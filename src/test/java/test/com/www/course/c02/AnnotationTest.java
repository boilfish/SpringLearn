package test.com.www.course.c02;

import com.www.course.c02.annotation.ClazzAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-annotation.xml");
        ClazzAnnotation ca = (ClazzAnnotation) ac.getBean("ClazzAnnotation");
        ca.getMaster();
        System.out.println(ca.toString());

    }
}
