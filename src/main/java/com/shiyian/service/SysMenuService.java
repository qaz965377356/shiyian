package com.shiyian.service;

import com.shiyian.entity.SysMenu;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 16:32
 * @Description:
 */
@Component
public interface SysMenuService {
    List<SysMenu> findListByUserName(String username);

    List<Map<String,Object>> queryMenuTree();

    SysMenu queryMenuById(Integer menuId);

    SysMenu queryParentMenuById(Integer menuId);

    void saveMenu(SysMenu sysMenu);

    void deleteMenu(Integer menuId);
}
