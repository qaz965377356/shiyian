package com.shiyian.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;
import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 15:21
 * @Description: 系统用户类
 */
public class SysUser {
    private Integer id;
    private String username;    //登录名
    private String password;
    private String name; //用户名
    private String email;
    private String mobile;
    private Integer status; //用户状态
    private SysUser createuser;
    private Date createtime;
    private SysUser updateuser;
    private Date updatetime;

    //角色
    //mybatis plus忽略该属性和数据库的映射
    @TableField(exist = false)
    private List<SysRole> roles;

    public SysUser() {
    }

    public SysUser(String username, String password, String name, String email, String mobile, Integer status, SysUser createuser, Date createtime, SysUser updateuser, Date updatetime) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        this.createuser = createuser;
        this.createtime = createtime;
        this.updateuser = updateuser;
        this.updatetime = updatetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SysUser getCreateuser() {
        return createuser;
    }

    public void setCreateuser(SysUser createuser) {
        this.createuser = createuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public SysUser getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(SysUser updateuser) {
        this.updateuser = updateuser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status=" + status +
                ", createuser=" + createuser +
                ", createtime=" + createtime +
                ", updateuser=" + updateuser +
                ", updatetime=" + updatetime +
                ", roles=" + roles +
                '}';
    }
}
