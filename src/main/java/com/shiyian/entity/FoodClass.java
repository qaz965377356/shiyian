package com.shiyian.entity;

public class FoodClass {
    private Integer id;
    private String name;

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

    public FoodClass(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public FoodClass() {
    }

    public FoodClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FoodClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
