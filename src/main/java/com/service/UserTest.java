package com.service;

import com.dao.UserMapper;
import com.model.User;
import com.tools.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.*;


public class UserTest {
    //    要用4.12版本的才可以
    @Test
    //添加操作
    public void insertUser(){
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(1,"Nice");
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
    //修改操作
    public void updateUser() {
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        User user = new User(1,"Lucy");
        try {
            mapper.updateByPrimaryKey(user);
            System.out.println(user.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }


    @Test
    // 查询操作
    public void selectAllUser(){
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try{
            User user = mapper.selectByPrimaryKey(1);
            System.out.println(user.toString());
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }
    }



}
