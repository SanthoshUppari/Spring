package com.hcl.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class DepartmentService {

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getData() {
		System.out.println("From DepartmentService...");
	}

}
