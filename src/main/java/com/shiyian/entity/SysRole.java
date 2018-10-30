package com.shiyian.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;
import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 15:26
 * @Description: 用户角色
 */
public class SysRole {
    private Integer id;
    private String name;
    private String remark;
    private SysUser createuser;
    private Date createtime;
    private SysUser updateuser;
    private Date updatetime;

    @TableField(exist = false)
    private List<SysMenu> menus;

    public SysRole() {
    }

    public SysRole(String name, String remark, SysUser createuser, Date createtime, SysUser updateuser, Date updatetime) {
        this.name = name;
        this.remark = remark;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public List<SysMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<SysMenu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", createuser=" + createuser +
                ", createtime=" + createtime +
                ", updateuser=" + updateuser +
                ", updatetime=" + updatetime +
                ", menus=" + menus +
                '}';
    }
}
