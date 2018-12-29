package org.entity.dao.test;

import org.apache.ibatis.session.SqlSession;
import org.entity.dao.pojo.UserMapper;
import org.entity.dao.utils.MyBatisUtil;

import org.entity.dao.pojo.User;
import java.util.*;

public class TestMyBatis {
    public static void main(String[] args){
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        List<User> list = sqlSession.getMapper(UserMapper.class).getUserList();
        for(User buff:list){
            System.out.println(buff.getID()+" === "+buff.getUserName()+" === "+buff.getUserRole());
        }
    }
}
