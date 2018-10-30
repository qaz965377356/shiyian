package com.shiyian.entity;


//商品
public class Goods {
    private Integer id;
    private String name;
    private Double price;
    private Integer amount;//商品数量
    private String talkWord;//评价
    private Integer sellerId;//卖家Id

    public Goods() {
    }

    public Goods(Integer id, String name, Double price, Integer amount, String talkWord, Integer sellerId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.talkWord = talkWord;
        this.sellerId = sellerId;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTalkWord() {
        return talkWord;
    }

    public void setTalkWord(String talkWord) {
        this.talkWord = talkWord;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", talkWord='" + talkWord + '\'' +
                ", sellerId=" + sellerId +
                '}';
    }
}
