package com.shiyian.service.impl;

import com.shiyian.entity.SysRole;
import com.shiyian.entity.SysUser;
import com.shiyian.mapper.SysUserMapper;
import com.shiyian.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 15:51
 * @Description:    自定义用户登录
 */
@Service
public class CustomUserService implements UserDetailsService { //自定义UserDetailsService 接口

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private UserMapper userMapper;
    public UserDetails loadUserByUsername(String username) {
        com.shiyian.entity.User user = userMapper.findUserByName(username);
        if (user != null) {

            List<GrantedAuthority> grantedAuthorities = new ArrayList <>();
            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }

}
