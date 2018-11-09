package test.com.www.course.c02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
    public static void main(String []args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println(ac.getBean("user1"));
        System.out.println(ac.getBean("user2"));
    }
}
