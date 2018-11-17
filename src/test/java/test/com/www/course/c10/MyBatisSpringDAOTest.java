package test.com.www.course.c10;

import com.www.course.c10.dao.User;
import com.www.course.c10.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSpringDAOTest {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-mybatis-dao.xml");
        UserDAO userDAO =(UserDAO) ac.getBean("userDAO");
        User user = userDAO.findUserById(1);
        System.out.println(user);
    }
}
