package com.www.course.c02.javaconfig;

public class Clazz {
    private int id = 20130303;
    private String name="class5";
    private Teacher teacher;

    public Clazz(){}

    public Clazz(Teacher teacher){
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
