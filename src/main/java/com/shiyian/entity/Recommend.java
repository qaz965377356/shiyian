package com.shiyian.entity;


public class Recommend {
    private Integer id;             //推荐表id
    private Integer userId;         //推荐人(用户)Id
    private Integer resId;          //餐厅id
    private Double priceAvg;        //人均消费
    private String cause;           //推荐理由
    private Integer praise;         //点赞人数
    private Integer dishpraise;     //食物点赞人数

    public Recommend() {

    }

    public Recommend(Integer userId, Integer resId, Double priceAvg, String cause, Integer praise, Integer dishpraise) {
        this.userId = userId;
        this.resId = resId;
        this.priceAvg = priceAvg;
        this.cause = cause;
        this.praise = praise;
        this.dishpraise = dishpraise;
    }

    public Recommend(Integer id, Integer userId, Integer resId, Double priceAvg, String cause, Integer praise, Integer dishpraise) {
        this.id = id;
        this.userId = userId;
        this.resId = resId;
        this.priceAvg = priceAvg;
        this.cause = cause;
        this.praise = praise;
        this.dishpraise = dishpraise;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Double getPriceAvg() {
        return priceAvg;
    }

    public void setPriceAvg(Double priceAvg) {
        this.priceAvg = priceAvg;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Integer getDishpraise() {
        return dishpraise;
    }

    public void setDishpraise(Integer dishpraise) {
        this.dishpraise = dishpraise;
    }

    @Override
    public String toString() {
        return "Recommend{" +
                "id=" + id +
                ", userId=" + userId +
                ", resId=" + resId +
                ", priceAvg=" + priceAvg +
                ", cause='" + cause + '\'' +
                ", praise=" + praise +
                ", dishpraise=" + dishpraise +
                '}';
    }
}
