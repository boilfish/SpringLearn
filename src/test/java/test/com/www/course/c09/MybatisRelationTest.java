package test.com.www.course.c09;

import com.www.course.c09.dao.UserDAO;
import com.www.course.c09.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisRelationTest {
    public static void main(String[] args){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring-config-mybatisrelation.xml");
        UserDAO userDAO =(UserDAO) ac.getBean("userDAO");
        try {
            User user=userDAO.findUserWithResumeById(3);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
