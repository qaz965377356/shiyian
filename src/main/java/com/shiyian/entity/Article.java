package com.shiyian.entity;


import java.util.Date;

//文章
public class Article {
    private Integer id;
    private String content;//文章内容
    private String articleName;//文章标题
    private Date createTime;//发布时间
    private Integer userId;//发布人(用户）
    private Integer count;//浏览次数

    public Article() {
    }

    public Article(Integer id, String content, String articleName, Date createTime, Integer userId, Integer count) {
        this.id = id;
        this.content = content;
        this.articleName = articleName;
        this.createTime = createTime;
        this.userId = userId;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", articleName='" + articleName + '\'' +
                ", createTime=" + createTime +
                ", userId=" + userId +
                ", count=" + count +
                '}';
    }
}
