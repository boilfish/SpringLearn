package test.com.www.course.c04;

import com.www.course.c01.Student;
import com.www.course.c04.JdbcTemplateUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-jdbc.xml");
        JdbcTemplateUtil jdbcTemplateUtil = (JdbcTemplateUtil) ac.getBean("jdbcTemplateUtil");

        //jdbcTemplateUtil.creatTable();

        Student student=(Student)ac.getBean("student");
        student.setName("heheda1");
        student.setSex("male");
        student.setEmail("heheda@126.com");

        jdbcTemplateUtil.addUser(student);

        String student1name = jdbcTemplateUtil.searchUserName(1);

        List<Student> list = jdbcTemplateUtil.fingAll();
        System.out.println("username=" + student1name);

        for (Student studentTemp : list) {
            System.out.println("id=" + studentTemp.getId() + " " + "name=" + studentTemp.getName());
        }

//        for(int i=0 ;i< list.size(); i++){
//            Student student2= list.get(i);
//            System.out.println("id="+student2.getId()+" "+ "name=" +student2.getName());
//        }
    }
}
