package com.shiyian.entity;

public class Dishes {
    private Integer id;             //菜品ID
    private String dishName;        //菜名
    private String cuisine;         //菜系
    private Double price;           //菜金
    private Integer resId;          //餐厅Id
    private String foodImage;       //菜品图片

    public Dishes() {

    }

    public Dishes(String dishName, String cuisine, Double price, Integer resId, String foodImage) {
        this.dishName = dishName;
        this.cuisine = cuisine;
        this.price = price;
        this.resId = resId;
        this.foodImage = foodImage;
    }

    public Dishes(Integer id, String dishName, String cuisine, Double price, Integer resId, String foodImage) {
        this.id = id;
        this.dishName = dishName;
        this.cuisine = cuisine;
        this.price = price;
        this.resId = resId;
        this.foodImage = foodImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", price=" + price +
                ", resId=" + resId +
                ", foodImage='" + foodImage + '\'' +
                '}';
    }
}
