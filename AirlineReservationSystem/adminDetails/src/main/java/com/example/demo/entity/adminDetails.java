package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admindetails")
public class adminDetails {
	
	@Id
	int id;
	
	String name;
	String address;
	int adminId;
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
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public adminDetails(int id, String name, String address, int adminId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.adminId = adminId;
	}
	public adminDetails() {
		super();
	}
	
	
	
	
	

}
