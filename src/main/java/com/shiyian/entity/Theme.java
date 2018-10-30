package com.shiyian.entity;


//主题
public class Theme {
    private Integer id;
    private String themeDetails;//主题简介
    private String themeName;//主题名称
    private Integer themeAmount;//主题数量
    private String themePhotoes;//主题照片

    public Theme() {
    }

    public Theme(Integer id, String themeDetails, String themeName, Integer themeAmount, String themePhotoes) {
        this.id = id;
        this.themeDetails = themeDetails;
        this.themeName = themeName;
        this.themeAmount = themeAmount;
        this.themePhotoes = themePhotoes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThemeDetails() {
        return themeDetails;
    }

    public void setThemeDetails(String themeDetails) {
        this.themeDetails = themeDetails;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public Integer getThemeAmount() {
        return themeAmount;
    }

    public void setThemeAmount(Integer themeAmount) {
        this.themeAmount = themeAmount;
    }

    public String getThemePhotoes() {
        return themePhotoes;
    }

    public void setThemePhotoes(String themePhotoes) {
        this.themePhotoes = themePhotoes;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "id=" + id +
                ", themeDetails='" + themeDetails + '\'' +
                ", themeName='" + themeName + '\'' +
                ", themeAmount=" + themeAmount +
                ", themePhotoes='" + themePhotoes + '\'' +
                '}';
    }
}
