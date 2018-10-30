package com.shiyian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiyian.entity.SysMenu;
import com.shiyian.mapper.SysMenuMapper;
import com.shiyian.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 16:37
 * @Description:
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> findListByUserName(String username) {
        return sysMenuMapper.findByUserName(username);
    }

    @Override
    public List<Map<String, Object>> queryMenuTree() {
        //查询出所有的菜单
        List<SysMenu> sysMenus = sysMenuMapper.selectList(new QueryWrapper<SysMenu>());

        //rootMenu存放根菜单
        List<Map<String,Object>> rootMenu = new ArrayList<>();
        //取出pid为0的节点
        if(!CollectionUtils.isEmpty(sysMenus)) {
            List<SysMenu> parentList = sysMenus.stream().filter(item -> 0 == (item.getPid())).collect(Collectors.toList());
            //把根节点放在Mpa里面，并去调用递归算法去查询子树
            if(!CollectionUtils.isEmpty(parentList)) {
                parentList.forEach(item -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("id",item.getId());
                    map.put("name",item.getName());
                    map.put("href",item.getUrl());
                    //查询出子节点
                    this.querySubMenuTree(map,sysMenus);
                    rootMenu.add(map);
                });
            }

        }
        return rootMenu;
    }

    @Override
    public SysMenu queryMenuById(Integer menuId) {
        return sysMenuMapper.selectById(menuId);
    }

    @Override
    public SysMenu queryParentMenuById(Integer menuId) {
        SysMenu sysMenu = sysMenuMapper.selectById(menuId);
        return sysMenuMapper.selectList(new QueryWrapper<SysMenu>()
                .eq("id",sysMenu.getPid() == 0 ? menuId : sysMenu.getPid())).get(0);
    }

    @Override
    public void saveMenu(SysMenu sysMenu) {
        if (sysMenu.getId() != null) {
            sysMenuMapper.updateById(sysMenu);
        } else {
            sysMenuMapper.insert(sysMenu);
        }
    }

    @Override
    public void deleteMenu(Integer menuId) {
        sysMenuMapper.deleteById(menuId);
    }

    /**
     * 获取子菜单
     */
    public Map<String, Object> querySubMenuTree(Map<String,Object> rootMap, List<SysMenu> sysMenus) {
        //subMenu
        List<Map<String,Object>> subMenu = new ArrayList<>();

        //选出某一个根节点下面的子树，递归。
        List<SysMenu> sub = sysMenus.stream().filter(item -> rootMap.get("id") == (item.getPid())).collect(Collectors.toList());
        //取出pid为0的节点
        if(!sub.isEmpty()) {
            sub.forEach(item -> {
                Map<String, Object> subMap = new HashMap<>();
                subMap.put("id",item.getId());
                subMap.put("name",item.getName());
                subMap.put("href",item.getUrl());
                //查询出子节点
                subMenu.add(subMap);
                this.querySubMenuTree(subMap,sysMenus);
            });
        }

        if(!CollectionUtils.isEmpty(subMenu)) {
            rootMap.put("children",subMenu);
        }
        return rootMap;
    }

}
