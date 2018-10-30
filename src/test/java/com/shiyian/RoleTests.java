package com.shiyian;

import com.shiyian.entity.SysMenu;
import com.shiyian.entity.SysRole;
import com.shiyian.mapper.SysRoleMapper;
import com.shiyian.service.SysRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTests {
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void contextLoads() {
        sysRoleService.getRoleMenuTree(1);
    }

    @Test
    public void insertRoleMenu() {
        SysRole role = new SysRole();
        role.setId(4);
        List<SysMenu> list = new ArrayList<>();
        SysMenu m = new SysMenu();
        m.setId(1);
        SysMenu m2 = new SysMenu();
        m2.setId(2);
        list.add(m);
        list.add(m2);
        role.setMenus(list);
        sysRoleMapper.insertRoleMenus(role);
    }


}
