package com.shiyian.web;

import com.shiyian.entity.SysRole;
import com.shiyian.entity.SysUser;
import com.shiyian.service.SysRoleService;
import com.shiyian.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/16 09:19
 * @Description: 系统用户控制器
 */
@Controller
@RequestMapping("/bg/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/login")
    public  String login(){
        return "Background/login";
    }

    /**
     * 获取用户列表
     */
    @RequestMapping("/list")
    public String list(Model model,Integer page,Integer size) {
        List<SysUser> list = sysUserService.findList(page,size);
        Integer count = sysUserService.selectCount();
        model.addAttribute("list",list);
        model.addAttribute("count",count);
        model.addAttribute("curr",page);
        return "Background/userList";
    }

    /**
     * 编辑
     */
    @RequestMapping("/form")
    public String form(Model model,Integer id) {
        SysUser sysUser = new SysUser();
        if(id != null) {
            sysUser = sysUserService.findUserById(id);
        }
        //获取所有的角色
        List<SysRole> roleList = sysRoleService.findList();
        model.addAttribute("roleList",roleList);
        model.addAttribute("sysuser",sysUser);
        return "Background/userForm";
    }

    @RequestMapping("/save")
    public String save(SysUser sysUser) {
        sysUserService.saveSysUser(sysUser);
        return "redirect:list";
    }
}
