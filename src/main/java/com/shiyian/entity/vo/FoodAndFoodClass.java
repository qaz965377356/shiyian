package com.shiyian.entity.vo;

public class FoodAndFoodClass {
    private Integer id;
    private Integer foodid;
    private Integer classid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public FoodAndFoodClass() {
    }

    public FoodAndFoodClass(Integer id, Integer foodid, Integer classid) {
        this.id = id;
        this.foodid = foodid;
        this.classid = classid;
    }

    public FoodAndFoodClass(Integer foodid, Integer classid) {
        this.foodid = foodid;
        this.classid = classid;
    }

    @Override
    public String toString() {
        return "FoodAndFoodClass{" +
                "id=" + id +
                ", foodid=" + foodid +
                ", classid=" + classid +
                '}';
    }
}
