package com.shiyian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiyian.entity.SysMenu;
import com.shiyian.entity.SysRole;
import com.shiyian.mapper.SysMenuMapper;
import com.shiyian.mapper.SysRoleMapper;
import com.shiyian.service.SysRoleService;
import org.apache.ibatis.javassist.compiler.SyntaxError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Auther: jzhang
 * @Date: 2018/10/16 16:39
 * @Description:
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    public static Integer CURRENT_PAGE = 1;
    public static Integer PAGE_SIZE = 2;

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysRole> findList() {
        return sysRoleMapper.selectList(
                new QueryWrapper<>()
        );
    }

    @Override
    public List<SysRole> findAllList(Integer page,Integer size) {
        if (page != null) {
            CURRENT_PAGE = page;
        }
        if (size != null) {
            PAGE_SIZE = size;
        }
        return sysRoleMapper.selectList(
                new QueryWrapper<>()
        );
    }

    @Override
    public SysRole findById(Integer id) {
        return sysRoleMapper.selectById(id);
    }

    @Override
    public void saveRole(SysRole sysRole,int[] roleMenus) {
        if (sysRole.getId() != null) {
            sysRoleMapper.updateById(sysRole);
        } else {
            sysRoleMapper.insert(sysRole);
        }
        //更新授权
        sysRoleMapper.deleteRoleMenus(sysRole);
        List<SysMenu> roleMenuList = new ArrayList<>();
        for (int i=0; i<roleMenus.length;i++) {
            SysMenu sysMenu = new SysMenu();
            sysMenu.setId(roleMenus[i]);
            roleMenuList.add(sysMenu);
        }
        sysRole.setMenus(roleMenuList); //给当前角色绑定对应菜单
        sysRoleMapper.insertRoleMenus(sysRole);
    }

    @Override
    public List<Map<String, Object>> getRoleMenuTree(Integer id) {
        //查询出所有的菜单
        List<SysMenu> sysMenus = sysMenuMapper.selectList(new QueryWrapper<>());
        //查询当前角色所拥有的菜单
        SysRole role = sysRoleMapper.findRoleAndMenu(id);
        List<SysMenu> roleMenu = role.getMenus();

        //rootMenu存放根菜单
        List<Map<String,Object>> rootMenu = new ArrayList<>();
        //取出pid为0的节点
        if(!CollectionUtils.isEmpty(sysMenus)) {
            List<SysMenu> parentList = sysMenus.stream().filter(item -> 0 == (item.getPid())).collect(Collectors.toList());
            //把根节点放在Mpa里面，并去调用递归算法去查询子树
            if(!CollectionUtils.isEmpty(parentList)) {
                parentList.forEach(item -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("title",item.getName());
                    map.put("value",item.getId());
                    roleMenu.forEach(rMenu -> {
                        if (rMenu.getId() == (item.getId())) {
                            map.put("checked",true);
                        }
                    });
                    //查询出子节点
                    this.querySubMenuTree(map,sysMenus,roleMenu);
                    rootMenu.add(map);
                });
            }

        }
        return rootMenu;
    }


    /**
     * 获取子菜单
     */
    public Map<String, Object> querySubMenuTree(Map<String,Object> rootMap, List<SysMenu> sysMenus, List<SysMenu> roleMenu) {
        //subMenu
        List<Map<String,Object>> subMenu = new ArrayList<>();

        //选出某一个根节点下面的子树，递归。
        List<SysMenu> sub = sysMenus.stream().filter(item -> rootMap.get("value") == (item.getPid())).collect(Collectors.toList());
        //取出pid为0的节点
        if(!sub.isEmpty()) {
            sub.forEach(item -> {
                Map<String, Object> subMap = new HashMap<>();
                subMap.put("title",item.getName());
                subMap.put("value",item.getId());
                subMap.put("data",new ArrayList<>());
                roleMenu.forEach(rMenu -> {
                    if (rMenu.getId() == (item.getId())) {
                        subMap.put("checked",true);
                    }
                });
                //查询出子节点
                subMenu.add(subMap);
                this.querySubMenuTree(subMap,sysMenus,roleMenu);
            });
        }

        if(!CollectionUtils.isEmpty(subMenu)) {
            rootMap.put("data",subMenu);
        } else {
            rootMap.put("data",new ArrayList<>());
        }
        return rootMap;
    }
}
