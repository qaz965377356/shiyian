package com.shiyian.entity;


public class Restaurant {
    private Integer id;             //餐厅ID
    private String resname;         //餐厅姓名
    private String tel;             //餐厅电话
    private String address;         //餐厅地址
    private String featuredDishes;  //餐厅特色菜
    private String specialService;  //餐厅特色服务
    private String resImage;        //餐厅图片
    private Double perCon;          //餐厅人均消费
    private String desc;            //餐厅描述

    public Restaurant() {

    }

    public Restaurant(String resname, String tel, String address, String featuredDishes, String specialService, String resImage, Double perCon, String desc) {
        this.resname = resname;
        this.tel = tel;
        this.address = address;
        this.featuredDishes = featuredDishes;
        this.specialService = specialService;
        this.resImage = resImage;
        this.perCon = perCon;
        this.desc = desc;
    }

    public Restaurant(Integer id, String resname, String tel, String address, String featuredDishes, String specialService, String resImage, Double perCon, String desc) {
        this.id = id;
        this.resname = resname;
        this.tel = tel;
        this.address = address;
        this.featuredDishes = featuredDishes;
        this.specialService = specialService;
        this.resImage = resImage;
        this.perCon = perCon;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFeaturedDishes() {
        return featuredDishes;
    }

    public void setFeaturedDishes(String featuredDishes) {
        this.featuredDishes = featuredDishes;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public String getResImage() {
        return resImage;
    }

    public void setResImage(String resImage) {
        this.resImage = resImage;
    }

    public Double getPerCon() {
        return perCon;
    }

    public void setPerCon(Double perCon) {
        this.perCon = perCon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", resname='" + resname + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", featuredDishes='" + featuredDishes + '\'' +
                ", specialService='" + specialService + '\'' +
                ", resImage='" + resImage + '\'' +
                ", perCon=" + perCon +
                ", desc='" + desc + '\'' +
                '}';
    }
}
