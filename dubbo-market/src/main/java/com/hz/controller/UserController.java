package com.hz.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hz.bean.User;
import com.hz.service.impl.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource UserService userService;
	
    @RequestMapping("get")
    public User getUserById() {
    	 User user = userService.getUserById(1);
		return user;
    }

}
