package com.shiyian.entity;

public class User {
    private Integer id;
    private String tele_mail;//手机号、邮箱
    private String username;//用户名
    private String nickname;//昵称
    private String password;//密码
    private String head_protrait;//头像
    private String resume;//简介
    private String menu;//菜单
    private String fans;//粉丝
    private String letter;//信件
    private String menu_bills;//菜谱
    private Integer isban;//是否被禁用

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTele_mail() {
        return tele_mail;
    }

    public void setTele_mail(String tele_mail) {
        this.tele_mail = tele_mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHead_protrait() {
        return head_protrait;
    }

    public void setHead_protrait(String head_protrait) {
        this.head_protrait = head_protrait;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getFans() {
        return fans;
    }

    public void setFans(String fans) {
        this.fans = fans;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getMenu_bills() {
        return menu_bills;
    }

    public void setMenu_bills(String menu_bills) {
        this.menu_bills = menu_bills;
    }

    public Integer getIsban() {
        return isban;
    }

    public void setIsban(Integer isban) {
        this.isban = isban;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tele_mail='" + tele_mail + '\'' +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", head_protrait='" + head_protrait + '\'' +
                ", resume='" + resume + '\'' +
                ", menu='" + menu + '\'' +
                ", fans='" + fans + '\'' +
                ", letter='" + letter + '\'' +
                ", menu_bills='" + menu_bills + '\'' +
                ", isban=" + isban +
                '}';
    }

    public User() {
        super();
    }

    public User(Integer id, String tele_mail, String username, String nickname, String password, String head_protrait, String resume, String menu, String fans, String letter, String menu_bills, Integer isban) {
        this.id = id;
        this.tele_mail = tele_mail;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.head_protrait = head_protrait;
        this.resume = resume;
        this.menu = menu;
        this.fans = fans;
        this.letter = letter;
        this.menu_bills = menu_bills;
        this.isban = isban;
    }

    public User(String tele_mail, String username, String nickname, String password, String head_protrait, String resume, String menu, String fans, String letter, String menu_bills, Integer isban) {
        this.tele_mail = tele_mail;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.head_protrait = head_protrait;
        this.resume = resume;
        this.menu = menu;
        this.fans = fans;
        this.letter = letter;
        this.menu_bills = menu_bills;
        this.isban = isban;
    }
}
