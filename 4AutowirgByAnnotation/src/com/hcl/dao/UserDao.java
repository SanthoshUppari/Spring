package com.hcl.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
