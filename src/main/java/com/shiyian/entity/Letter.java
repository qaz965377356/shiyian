package com.shiyian.entity;

public class Letter {
    private Integer id;
    private String recipients;//收件人
    private String theme;//主题
    private String content;//内容

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Letter{" +
                "id=" + id +
                ", recipients='" + recipients + '\'' +
                ", theme='" + theme + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Letter() {
        super();
    }

    public Letter(Integer id, String recipients, String theme, String content) {
        this.id = id;
        this.recipients = recipients;
        this.theme = theme;
        this.content = content;
    }

    public Letter(String recipients, String theme, String content) {
        this.recipients = recipients;
        this.theme = theme;
        this.content = content;
    }
}
