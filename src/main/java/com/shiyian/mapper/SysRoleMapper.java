package com.shiyian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shiyian.entity.SysRole;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Auther: jzhang
 * @Date: 2018/10/16 16:36
 * @Description: 角色控制器
 */
@Component
public interface SysRoleMapper extends BaseMapper<SysRole> {
    //查询角色关联查询角色菜单
    SysRole findRoleAndMenu(Integer id);

    //根据id删除所有角色菜单
    void deleteRoleMenus(SysRole sysRole);

    //批量插入角色菜单
    void insertRoleMenus(SysRole sysRole);
}
