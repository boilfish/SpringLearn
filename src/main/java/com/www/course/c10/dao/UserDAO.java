package com.www.course.c10.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDAO extends SqlSessionDaoSupport{
    public User findUserById(int id){
        return this.getSqlSession().selectOne("com.hbxy.course.c10.dao.UserMapper.findUserById", id);
    }
}
