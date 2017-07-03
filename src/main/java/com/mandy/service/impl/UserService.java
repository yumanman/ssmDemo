package com.mandy.service.impl;

import javax.annotation.Resource;

import com.mandy.dao.UserMapper;
import com.mandy.model.User;
import com.mandy.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {
    @Resource
    private UserMapper userDao;

    public User getUserById(int userId){
        return this.userDao.selectByPrimaryKey(userId);
    }

}