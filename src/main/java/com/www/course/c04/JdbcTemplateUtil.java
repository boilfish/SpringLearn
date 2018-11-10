package com.www.course.c04;

import com.www.course.c01.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplateUtil {
    private JdbcTemplate jdbcTemplate;

    private String errorTest;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void creatTable(){
        jdbcTemplate.execute("DROP TABLE IF EXISTS user");
        jdbcTemplate.execute("CREATE TABLE  user (\n" +
                "id int (11) not null AUTO_INCREMENT,\n" +
                "name varchar(50) default null,\n" +
                "sex varchar(10) default null,\n" +
                "email varchar(50) default null,\n" +
                "primary key (id)\n" +
                ")"
        );
    }

    public void addUser(Student student){
        String sql= "insert into user (name,sex,email) values(?,?,?)";
        jdbcTemplate.update(sql,student.getName(),student.getSex(),student.getEmail());
    }

    public void deleteUser(int id){
        String sql= "delete from user where id = ?";
        jdbcTemplate.update(sql,id);
    }

    public void updateUser(Student student){
        String sql="update user set name=?,sex=?,email=? where id=?";
        jdbcTemplate.update(sql,student.getName(),student.getSex(),student.getEmail(),student.getId());
    }
    //简单查询返回字符串
    public String searchUserName(int id){
        String sql="select name from user where id=?";
        return jdbcTemplate.queryForObject(sql,String.class,id);
    }
    //复杂查询返回List集合
    public List<Student> fingAll(){
        String sql="select * from user";
        return jdbcTemplate.query(sql,new StudentRowMapper());
    }


    class StudentRowMapper implements RowMapper<Student>{
        //rs 为返回结果集，以每行为单位封装
        public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
            Student student =new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setSex(rs.getString("sex"));
            student.setEmail(rs.getString("email"));

            return student;
        }

    }

}
