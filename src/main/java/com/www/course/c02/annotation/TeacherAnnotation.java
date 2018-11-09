package com.www.course.c02.annotation;

import org.springframework.stereotype.Component;

@Component("teacherAnnotation")
public class TeacherAnnotation {
    private int id = 20180101;
    private String name = "teacher123";
    private String sex ;
    private String email;

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
        return "TeacherAnnotation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
