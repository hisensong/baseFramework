package com.gome.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gome.dao.IUserDao;
import com.gome.domain.User;
import com.gome.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Autowired 
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {   
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
