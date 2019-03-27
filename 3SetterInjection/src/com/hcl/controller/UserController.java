package com.hcl.controller;

import com.hcl.service.DepartmentService;
import com.hcl.service.UserService;

public class UserController {
	
	private UserService userService;
	
	private DepartmentService departmentService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public void getData(){
		System.out.println("From controller...");
		userService.getData();
		departmentService.getData();
	}

}
