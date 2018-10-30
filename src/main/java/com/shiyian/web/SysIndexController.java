package com.shiyian.web;

import com.shiyian.entity.SysMenu;
import com.shiyian.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 15:51
 * @Description:    后台主页控制台
 */
@Controller
@RequestMapping("/bg")
public class SysIndexController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/")
    public String index(Model model){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        //根据用户查询其对应的菜单
        List<SysMenu> menus = sysMenuService.findListByUserName(userDetails.getUsername());
        model.addAttribute("menus",menus);
        return "Background/index";
    }

    @RequestMapping("/console")
    public String console() {
        return "Background/console";
    }

}
