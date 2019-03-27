package com.hcl.test;

import java.util.List;

public class UserResponse {
	
	List<User> users;
	
	String statusCode;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
}
