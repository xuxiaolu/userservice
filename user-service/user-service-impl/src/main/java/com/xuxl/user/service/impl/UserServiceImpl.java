package com.xuxl.user.service.impl;


import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;
import com.xuxl.user.service.api.UserService;
import com.xuxl.user.service.domain.User;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

	public User getUserByAge(int age) {
		User user = new User();
		user.setAge(age);
		return user;
	}

	public User getUserByName(String name) {
		User user = new User();
		user.setName(name);
		return user;
	}

	public User getUserByBirthday(Date date) {
		User user = new User();
		user.setBirthday(date);
		return user;
	}

}
