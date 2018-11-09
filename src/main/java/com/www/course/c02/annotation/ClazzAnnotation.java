package com.www.course.c02.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ClazzAnnotation")
public class ClazzAnnotation {
    private int id = 20140101 ;
    private String name="grade5clazz2";
    private TeacherAnnotation master;


    public ClazzAnnotation(){
      //  master=ta;
    }  //constructor

    @Autowired
    private void newmaster(TeacherAnnotation teacher1){
        this.master=teacher1;
    }

    public TeacherAnnotation getMaster(){
        return master;
    }

    @Override
    public String toString() {
        return "ClazzAnnotation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
