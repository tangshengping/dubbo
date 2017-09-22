package com.hz.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hz.bean.User;
import com.hz.service.IUserService;

@Service
public class UserService {
 
    @Reference(version = "1.0.0",check=false)
    private IUserService uservice;
 
    public User getUserById(int id){
    	return uservice.getUserById(id);
    }

}
