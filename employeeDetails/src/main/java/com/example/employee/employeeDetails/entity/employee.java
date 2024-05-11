package com.example.employee.employeeDetails.entity;

import org.springframework.context.annotation.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {
	
	@Id
	int id;
	
	String name;
	String address;
	
	public employee() {
		super();

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
