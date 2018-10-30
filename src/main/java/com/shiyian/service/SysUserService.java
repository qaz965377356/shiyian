package com.shiyian.service;

import com.shiyian.entity.SysUser;

import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/16 09:39
 * @Description: 系统用户接口
 */
public interface SysUserService {
    List<SysUser> findList(Integer page, Integer size);
    Integer selectCount();
    SysUser findUserById(Integer id);
    void saveSysUser(SysUser sysUser);
}
