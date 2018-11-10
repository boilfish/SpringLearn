package com.www.course.c03;

public class UserX {
    private int id = 201820202;
    private String name = "user1";
    private String sex;
    private String email;

    public void saveUser(){
        System.out.println("save user info...");
    }
    public void queryUser(){
        System.out.println("query user info...");
        System.out.println(this.toString());
    }




    //setter getter and to string
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

    @Override
    public String toString() {
        return "UserX{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
