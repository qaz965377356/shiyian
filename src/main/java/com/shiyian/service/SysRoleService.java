package com.shiyian.service;

import com.shiyian.entity.SysRole;

import java.util.List;
import java.util.Map;

/**
 * @Auther: jzhang
 * @Date: 2018/10/16 16:37
 * @Description: 角色服务层
 */
public interface SysRoleService{
    List<SysRole> findList();
    List<SysRole> findAllList(Integer page, Integer size);
    SysRole findById(Integer id);
    void saveRole(SysRole sysRole, int[] roleMenus);
    List<Map<String,Object>> getRoleMenuTree(Integer id);
}
