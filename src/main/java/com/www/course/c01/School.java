package com.www.course.c01;

import java.util.ArrayList;
import java.util.List;

public class School {
    private int id = 2000;
    private String namr = "heheda";
    private Student student;

    private List<Student> manyStudents = new ArrayList();

    public School(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamr() {
        return namr;
    }

    public void setNamr(String namr) {
        this.namr = namr;
    }

    public List<Student> getManyStudents() {
        return manyStudents;
    }

    public void setManyStudents(List<Student> manyStudents) {
        this.manyStudents = manyStudents;
    }
}
