package com.shiyian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shiyian.entity.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 15:38
 * @Description:  系统用户接口
 */
@Component
public interface SysUserMapper extends BaseMapper<SysUser> {
    SysUser findUserByName(String username);
    SysUser findUserById(Integer id);
    void insertRoles(SysUser sysUser);//更新角色
    void deleteRoles(SysUser sysUser);//删除角色
}
