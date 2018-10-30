package com.shiyian.web;

import com.shiyian.entity.SysRole;
import com.shiyian.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Auther: jzhang
 * @Date: 2018/10/18 16:45
 * @Description: 角色控制器
 */
@Controller
@RequestMapping("/bg/role")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/list")
    public String list(Model model, Integer page, Integer size) {
        List<SysRole> roles = sysRoleService.findAllList(page,size);
        model.addAttribute("roles",roles);
        return "Background/roleList";
    }

    @RequestMapping("/form")
    public String form(Model model, Integer id) {
        SysRole sysRole = sysRoleService.findById(id);
        model.addAttribute("sysRole",sysRole);
        return "Background/roleForm";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(SysRole sysRole,int[] roleMenus) {
        sysRoleService.saveRole(sysRole,roleMenus);
        return "success";
    }

    /**
     * 获取角色授权菜单树
     * @return
     */
    @RequestMapping("/getRoleMenuTree")
    @ResponseBody
    public List<Map<String,Object>> getRoleMenuTree (Integer id) {
        List<Map<String,Object>> list = sysRoleService.getRoleMenuTree(id);
        return list;
    }
}
