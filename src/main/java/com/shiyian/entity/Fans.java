package com.shiyian.entity;

public class Fans {
    private Integer id;
    private String fan;//粉丝
    private String attention;//关注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }


    @Override
    public String toString() {
        return "Fans{" +
                "id=" + id +
                ", fan='" + fan + '\'' +
                ", attention='" + attention + '\'' +
                '}';
    }

    public Fans() {
        super();
    }

    public Fans(Integer id, String fan, String attention) {
        this.id = id;
        this.fan = fan;
        this.attention = attention;
    }

    public Fans(String fan, String attention) {
        this.fan = fan;
        this.attention = attention;
    }
}
