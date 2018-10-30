package com.shiyian.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.List;

public class FoodClass {
    private Integer id;
    private String name;
    @TableField(exist = false)
    private List<Food> foods;
    public Integer getId() {
        return id;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
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

    public FoodClass(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public FoodClass() {
    }

    public FoodClass(String name) {
        this.name = name;
    }

    public FoodClass(String name, List<Food> foods) {
        this.name = name;
        this.foods = foods;
    }

    public FoodClass(Integer id, String name, List<Food> foods) {
        this.id = id;
        this.name = name;
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "FoodClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foods=" + foods +
                '}';
    }
}
