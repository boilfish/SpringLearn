package test.com.www.course.c01;

import com.www.course.c01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String []args){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-config.xml");
        Student s=(Student)ac.getBean("student");
        s.setId(100);
        s.setName("heheda");
        System.out.println(s.toString());
    }
}
