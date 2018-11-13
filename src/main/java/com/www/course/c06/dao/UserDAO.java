package com.www.course.c06.dao;

import com.www.course.c06.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class UserDAO {
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
}
