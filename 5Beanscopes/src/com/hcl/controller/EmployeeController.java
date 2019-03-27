package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hcl.service.DepartmentService;
import com.hcl.service.UserService;

@Controller
public class EmployeeController {
	
	UserService userService;

	DepartmentService departmentService;
	
	@Autowired
	public EmployeeController(UserService userService, DepartmentService departmentService){
		this.userService = userService;
		this.departmentService =departmentService;
	}
	
	public void getData(){
		System.out.println("From EmployeeController...");
		userService.getData();
		departmentService.getData();
	}

}
