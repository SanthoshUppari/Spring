package com.hcl.hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "add_id")
	private int addId;
	
	@Column(name = "location")
	private String location;
	
	@OneToOne(targetEntity=Employee1.class)
	@PrimaryKeyJoinColumn
	private Employee1 employee1;
	
	public Employee1 getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
