package com.shiyian.entity;


//商家
public class Seller {
    private Integer id;
    private Integer sellerType;//商家类型
    private String sellerName;//商家名称

    public Seller() {
    }

    public Seller(Integer id, Integer sellerType, String sellerName) {
        this.id = id;
        this.sellerType = sellerType;
        this.sellerName = sellerName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSellerType() {
        return sellerType;
    }

    public void setSellerType(Integer sellerType) {
        this.sellerType = sellerType;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", sellerType=" + sellerType +
                ", sellerName='" + sellerName + '\'' +
                '}';
    }
}
