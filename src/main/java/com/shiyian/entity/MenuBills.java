package com.shiyian.entity;

public class MenuBills {
    private Integer id;
    private String cook_name;//菜谱名称
    private String menu_pic;//菜谱图片
    private String menu_describe;//菜谱描述
    private Integer diffculty;//难度
    private Integer time;//烹饪时间
    private String step_pic;//步骤图片
    private String step_describe;//步骤描述
    private String food_label;//食物标签


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCook_name() {
        return cook_name;
    }

    public void setCook_name(String cook_name) {
        this.cook_name = cook_name;
    }

    public String getMenu_pic() {
        return menu_pic;
    }

    public void setMenu_pic(String menu_pic) {
        this.menu_pic = menu_pic;
    }

    public String getMenu_describe() {
        return menu_describe;
    }

    public void setMenu_describe(String menu_describe) {
        this.menu_describe = menu_describe;
    }

    public Integer getDiffculty() {
        return diffculty;
    }

    public void setDiffculty(Integer diffculty) {
        this.diffculty = diffculty;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getStep_pic() {
        return step_pic;
    }

    public void setStep_pic(String step_pic) {
        this.step_pic = step_pic;
    }

    public String getStep_describe() {
        return step_describe;
    }

    public void setStep_describe(String step_describe) {
        this.step_describe = step_describe;
    }

    public String getFood_label() {
        return food_label;
    }

    public void setFood_label(String food_label) {
        this.food_label = food_label;
    }

    @Override
    public String toString() {
        return "MenuBills{" +
                "id=" + id +
                ", cook_name='" + cook_name + '\'' +
                ", menu_pic='" + menu_pic + '\'' +
                ", menu_describe='" + menu_describe + '\'' +
                ", diffculty=" + diffculty +
                ", time=" + time +
                ", step_pic='" + step_pic + '\'' +
                ", step_describe='" + step_describe + '\'' +
                ", food_label='" + food_label + '\'' +
                '}';
    }

    public MenuBills() {
        super();
    }

    public MenuBills(Integer id, String cook_name, String menu_pic, String menu_describe, Integer diffculty, Integer time, String step_pic, String step_describe, String food_label) {
        this.id = id;
        this.cook_name = cook_name;
        this.menu_pic = menu_pic;
        this.menu_describe = menu_describe;
        this.diffculty = diffculty;
        this.time = time;
        this.step_pic = step_pic;
        this.step_describe = step_describe;
        this.food_label = food_label;
    }

    public MenuBills(String cook_name, String menu_pic, String menu_describe, Integer diffculty, Integer time, String step_pic, String step_describe, String food_label) {
        this.cook_name = cook_name;
        this.menu_pic = menu_pic;
        this.menu_describe = menu_describe;
        this.diffculty = diffculty;
        this.time = time;
        this.step_pic = step_pic;
        this.step_describe = step_describe;
        this.food_label = food_label;
    }
}
