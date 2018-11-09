package test.com.www.course.c01;

import com.www.course.c01.School;
import com.www.course.c01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class SchoolTest {
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        School sc = (School) ac.getBean("school");

        ArrayList<Student> sl= (ArrayList<Student>) sc.getManyStudents();

        for(Student s :sl){
            System.out.println(s.toString());
        }
    }
}
