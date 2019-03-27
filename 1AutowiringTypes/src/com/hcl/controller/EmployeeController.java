package com.hcl.controller;

import com.hcl.service.DepartmentService;
import com.hcl.service.UserService;

public class EmployeeController {
	
	UserService userService;
	
	DepartmentService departmentService;
	
	public EmployeeController(UserService userService, DepartmentService departmentService){
		this.userService = userService;
		this.departmentService = departmentService;
	}
	
	public void getData(){
		System.out.println("From EmployeeController...");
		userService.getData();
		departmentService.getData();
	}

}
