package test.com.www.course.c06;

import com.www.course.c06.dao.UserDAO;
import com.www.course.c06.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatis {
    public static void main(String[] args) {


        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-mybatis.xml");
        UserDAO userDAO = (UserDAO) ac.getBean("userDAO");
        User user;

        {
            try {
                user = userDAO.findUserById(1);
                System.out.println(user);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
