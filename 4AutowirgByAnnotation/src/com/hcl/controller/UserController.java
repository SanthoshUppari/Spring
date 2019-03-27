package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hcl.service.DepartmentService;
import com.hcl.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private DepartmentService departmentService;
	
	public void getData(){
		System.out.println("From UserController...");
		userService.getData();
		departmentService.getData();
	}

}
