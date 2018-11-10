package test.com.www.course.c03;

import com.www.course.c03.UserX;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspecJXMLTest {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-aop.xml");
        UserX user1=(UserX) ac.getBean("userxml");
        user1.queryUser();
    }
}
