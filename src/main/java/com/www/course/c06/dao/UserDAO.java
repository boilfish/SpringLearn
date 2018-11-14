package com.www.course.c06.dao;

import com.www.course.c06.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class UserDAO {

    //查1
    public User findUserById(int id) throws Exception{
        String resource = "mybatis-config.xml";

        //读取MyBatis配置文件，加载映射文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();//构建会话工厂，会话对象

        User user =sqlSession.selectOne("com.www.course.c06.mapper.UserMapper.findUserByID",id);

        sqlSession.close();
        return user;
    }

    //模糊查
    public List<User> findUserList(String name) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users = sqlSession.selectList("com.www.course.c06.mapper.UserMapper.findUserList",name);
        sqlSession.close();
        return users;
    }

    //增
    public void addUser(User user) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.insert("com.www.course.c06.mapper.UserMapper.addUser",user);
        sqlSession.close();
    }

    //改
    public void updateUser(User user) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.update("com.www.course.c06.mapper.UserMapper.updateUser",user);
        sqlSession.close();
    }

    //删
    public void deleteUser(int delId) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.delete("com.www.course.c06.mapper.UserMapper.deleteUser",delId);
        sqlSession.close();

    }
}
