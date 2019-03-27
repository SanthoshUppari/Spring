package com.hcl.controller;

import com.hcl.service.DepartmentService;
import com.hcl.service.UserService;

public class UserController {
	
	private UserService userServices;
	
	private DepartmentService departmentService;
	
	public UserController(UserService userServices, DepartmentService departmentService){
		this.userServices = userServices;
		this.departmentService = departmentService;
	}
	
	public void getData(){
		System.out.println("From controller...");
		userServices.getData();
		departmentService.getData();
	}

}
