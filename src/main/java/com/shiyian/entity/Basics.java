package com.shiyian.entity;

public class Basics {
    private Integer id;
    private String mail_box; //手机号或者邮箱
    private String nickname;//昵称
    private Integer sex;//性别
    private String taste;//口味
    private String city;//城市
    private String individual;//简介

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail_box() {
        return mail_box;
    }

    public void setMail_box(String mail_box) {
        this.mail_box = mail_box;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    @Override
    public String toString() {
        return "Basics{" +
                "id=" + id +
                ", mail_box='" + mail_box + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", taste='" + taste + '\'' +
                ", city='" + city + '\'' +
                ", individual='" + individual + '\'' +
                '}';
    }

    public Basics() {
        super();
    }

    public Basics(Integer id, String mail_box, String nickname, Integer sex, String taste, String city, String individual) {
        this.id = id;
        this.mail_box = mail_box;
        this.nickname = nickname;
        this.sex = sex;
        this.taste = taste;
        this.city = city;
        this.individual = individual;
    }

    public Basics(String mail_box, String nickname, Integer sex, String taste, String city, String individual) {
        this.mail_box = mail_box;
        this.nickname = nickname;
        this.sex = sex;
        this.taste = taste;
        this.city = city;
        this.individual = individual;
    }
}
