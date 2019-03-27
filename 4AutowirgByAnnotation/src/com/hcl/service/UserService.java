package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hcl.dao.UserDao;

@Service
public class UserService {

	@Autowired
	//@Qualifier("userDao2")
	private UserDao userDao;

	public void getData(){
		System.out.println("From UserService..."+userDao);
		System.out.println("From UserService..."+userDao.getCount());
	}

}
