package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hcl.dao.UserDao;

@Service
@Scope("prototype")
public class UserService {

	@Autowired
	private UserDao userDao;

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getData() {
		System.out.println("From UserService...");
	}

}
