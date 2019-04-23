package com.service;

import com.dao.UserMapper;
import com.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
@Repository
public class UserService {
    @Resource
    UserMapper userMapper;

    public User select(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
