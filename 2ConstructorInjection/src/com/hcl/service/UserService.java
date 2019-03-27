package com.hcl.service;

import com.hcl.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void getData(){
		System.out.println("From UserService...");
	}

}
