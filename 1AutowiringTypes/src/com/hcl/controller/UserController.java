package com.hcl.controller;

import com.hcl.service.DepartmentService;
import com.hcl.service.UserService;

public class UserController {
	
	private UserService us;
	
	private DepartmentService departmentService;
	
	public void setUs(UserService us) {
		this.us = us;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public void getData(){
		System.out.println("From UserController...");
		us.getData();
		departmentService.getData();
	}

}
