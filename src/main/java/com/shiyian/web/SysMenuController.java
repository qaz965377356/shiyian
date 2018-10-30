package com.shiyian.web;

import com.shiyian.entity.SysMenu;
import com.shiyian.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Auther: jzhang
 * @Date: 2018/10/17 10:51
 * @Description: 菜单控制器
 */
@Controller
@RequestMapping("/bg/menu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/list")
    public String list() {
        return "Background/menuList";
    }

    @RequestMapping("/queryMenuTree")
    @ResponseBody
    public List<Map<String,Object>> queryMenuTree() {
        List<Map<String,Object>> map = sysMenuService.queryMenuTree();
        return map;
    }

    @RequestMapping("/getMenuById")
    @ResponseBody
    public SysMenu getMenuById(Integer menuId) {
        SysMenu sysMenu = sysMenuService.queryMenuById(menuId);
        return sysMenu;
    }

    @RequestMapping("/getParentMenu")
    @ResponseBody
    public SysMenu getParentMenu(Integer menuId) {
        SysMenu sysMenu = sysMenuService.queryParentMenuById(menuId);
        return sysMenu;
    }

    @RequestMapping("/form")
    public String form() {
        return "Background/menuForm";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(SysMenu sysMenu) {
        sysMenuService.saveMenu(sysMenu);
        return "success";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Integer menuId) {
        sysMenuService.deleteMenu(menuId);
        return "success";
    }
}
