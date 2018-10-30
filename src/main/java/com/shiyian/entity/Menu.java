package com.shiyian.entity;

public class Menu {
    private Integer id;
    private String dish_name;//菜品名称
    private String picture;//菜品图片
    private String introduce;//介绍
    private String farecook;//菜品描述

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getFarecook() {
        return farecook;
    }

    public void setFarecook(String farecook) {
        this.farecook = farecook;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", dish_name='" + dish_name + '\'' +
                ", picture='" + picture + '\'' +
                ", introduce='" + introduce + '\'' +
                ", farecook='" + farecook + '\'' +
                '}';
    }

    public Menu() {
        super();
    }

    public Menu(Integer id, String dish_name, String picture, String introduce, String farecook) {
        this.id = id;
        this.dish_name = dish_name;
        this.picture = picture;
        this.introduce = introduce;
        this.farecook = farecook;
    }

    public Menu(String dish_name, String picture, String introduce, String farecook) {
        this.dish_name = dish_name;
        this.picture = picture;
        this.introduce = introduce;
        this.farecook = farecook;
    }
}
