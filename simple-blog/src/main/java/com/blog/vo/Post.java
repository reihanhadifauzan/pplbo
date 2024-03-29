package com.blog.vo;

import java.util.Date;

public class Post {
    private Long id;
    private String user;
    private String title;
    private String content;
    private Date regDate;
    private Date updtDate;

    public Post() {
    }

    public Post(Long id, String user, String title, String content) {
        super();
        this.id = id;
        this.user = user;
        this.title = title;
        this.content = content;
        this.regDate = new Date();
        this.updtDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getUpdtDate() {
        return updtDate;
    }

    public void setUpdtDate(Date updtDate) {
        this.updtDate = updtDate;
    }
}
