package com.service;

import com.dao.UserMapper;
import com.model.User;
import com.tools.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.*;

import java.util.List;

public class UserTest {
    //    要用4.12版本的才可以
    @Test
    //添加操作
    public void insertUser(){
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User("John");
        try {
            mapper.insert(user);
            System.out.println(user.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    @Test
    //删除操作
    public void deleteUser() {
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            mapper.deleteByPrimaryKey(3);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }


    @Test
    public void selectAllUser(){
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try{
            List<User> user = mapper.selectByPrimaryKey(1);
            System.out.println(user.toString());
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }
    }



}
