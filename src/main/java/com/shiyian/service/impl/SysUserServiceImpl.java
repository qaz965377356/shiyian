package com.shiyian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiyian.entity.SysUser;
import com.shiyian.mapper.SysUserMapper;
import com.shiyian.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: jzhang
 * @Date: 2018/10/16 09:40
 * @Description:
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    public static Integer CURRENT_PAGE = 1;
    public static Integer PAGE_SIZE = 2;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findList(Integer page, Integer size) {
        if (page != null) {
            CURRENT_PAGE = page;
        }
        if (size != null) {
            PAGE_SIZE = size;
        }
        return sysUserMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public Integer selectCount() {
        return sysUserMapper.selectCount(new QueryWrapper<>());
    }

    @Override
    public SysUser findUserById(Integer id) {
        return sysUserMapper.findUserById(id);
    }

    @Override
    public void saveSysUser(SysUser sysUser) {
        if (sysUser.getId() != null) {
            sysUserMapper.updateById(sysUser);
        } else {
            //新增用户设置默认密码123456
            String pwd = new BCryptPasswordEncoder().encode("123456");
            sysUser.setPassword(pwd);
            Integer index = sysUserMapper.insert(sysUser);
        }
        //更新角色
        updataSysUserRoles(sysUser);
    }

    /**
     * 更新用户角色
     */
    private void updataSysUserRoles(SysUser sysUser) {
        //删除原有角色
        sysUserMapper.deleteRoles(sysUser);
        //更新角色
        sysUserMapper.insertRoles(sysUser);
    }

}
