package com.www.course.c09.dao;


import com.www.course.c09.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class UserDAO {
    public User findUserById(int id) throws Exception{
        String resource="mybatis-config-relation.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        User user=session.selectOne("com.www.course.c09.mapper.UserMapper.findUserById",id);
        session.close();
        return user;
    }
    public User findUserWithResumeById(int id) throws Exception{
        String resource="mybatis-config-relation.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        User user = session.selectOne("com.www.course.c09.mapper.UserMapper.findUserWithResumeById",id);
        session.close();
        return user;
    }
}
