package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Director {
	
	@Id
	int id;
	
	String name;
	String performance;
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
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public Director(int id, String name, String performance) {
		super();
		this.id = id;
		this.name = name;
		this.performance = performance;
	}
	
	

}
