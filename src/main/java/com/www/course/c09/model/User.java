package com.www.course.c09.model;

import java.util.List;

public class User {
    private int id = 20190202;
    private String name = "";
    private String sex;
    private String email;

    private Card cardID;//关联证件号

    private List<Resume> resumeLs;//个人发的多份简历

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Card getCardID() {
        return cardID;
    }

    public void setCardID(Card cardID) {
        this.cardID = cardID;
    }

    public List<Resume> getResumeLs() {
        return resumeLs;
    }

    public void setResumeLs(List<Resume> resumeLs) {
        this.resumeLs = resumeLs;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", resumeLs=" + resumeLs +
                '}';
    }
}

