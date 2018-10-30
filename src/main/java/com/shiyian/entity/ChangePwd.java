package com.shiyian.entity;

public class ChangePwd {
    private Integer id;
    private String old_pwd;//旧密码
    private String new_pwd;//新密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOld_pwd() {
        return old_pwd;
    }

    public void setOld_pwd(String old_pwd) {
        this.old_pwd = old_pwd;
    }

    public String getNew_pwd() {
        return new_pwd;
    }

    public void setNew_pwd(String new_pwd) {
        this.new_pwd = new_pwd;
    }


    @Override
    public String toString() {
        return "ChangePwd{" +
                "id=" + id +
                ", old_pwd='" + old_pwd + '\'' +
                ", new_pwd='" + new_pwd + '\'' +
                '}';
    }

    public ChangePwd() {
        super();
    }



    public ChangePwd(Integer id, String old_pwd, String new_pwd) {
        this.id = id;
        this.old_pwd = old_pwd;
        this.new_pwd = new_pwd;
    }

    public ChangePwd(String old_pwd, String new_pwd) {
        this.old_pwd = old_pwd;
        this.new_pwd = new_pwd;
    }
}
