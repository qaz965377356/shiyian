package com.shiyian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shiyian.entity.SysMenu;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 16:33
 * @Description:
 */
@Component
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    List<SysMenu> findByUserName(String username);
}
