package com.shiyian.entity;

import java.util.Date;


//订单
public class Orders {
    private Integer id;
    private Integer goodId;//商品Id
    private Integer userId;//买家Id
    private Integer sellerId;//卖家Id
    private Double price;//价格
    private Double money;//金额
    private Integer orderNumber;//订单编号
    private Date createTime;//创建时间
    private String address;//收货地址
    private Integer phone;//买家联系方式
    private Integer amount;//订单数量

    public Orders() {
    }

    public Orders(Integer id, Integer goodId, Integer userId, Integer sellerId, Double price, Double money,
                  Integer orderNumber, Date createTime, String address, Integer phone, Integer amount) {
        this.id = id;
        this.goodId = goodId;
        this.userId = userId;
        this.sellerId = sellerId;
        this.price = price;
        this.money = money;
        this.orderNumber = orderNumber;
        this.createTime = createTime;
        this.address = address;
        this.phone = phone;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", goodId=" + goodId +
                ", userId=" + userId +
                ", sellerId=" + sellerId +
                ", price=" + price +
                ", money=" + money +
                ", orderNumber=" + orderNumber +
                ", createTime=" + createTime +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", amount=" + amount +
                '}';
    }
}
