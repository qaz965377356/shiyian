package com.shiyian.entity;

import java.util.Date;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 15:35
 * @Description: 系统菜单
 */
public class SysMenu {
    private Integer id;
    private Integer pid;
    private String name;
    private String url;
    private String perms;   //角色
    private String icon;    //图标
    private SysUser createuser;
    private Date createtime;
    private SysUser updateuser;
    private Date updatetime;

    public SysMenu() {
    }

    public SysMenu(Integer pid, String name, String url, String perms, String icon, SysUser createuser, Date createtime, SysUser updateuser, Date updatetime) {
        this.pid = pid;
        this.name = name;
        this.url = url;
        this.perms = perms;
        this.icon = icon;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    @Override
    public String toString() {
        return "SysMenu{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", perms='" + perms + '\'' +
                ", icon='" + icon + '\'' +
                ", createuser=" + createuser +
                ", createtime=" + createtime +
                ", updateuser=" + updateuser +
                ", updatetime=" + updatetime +
                '}';
    }
}
