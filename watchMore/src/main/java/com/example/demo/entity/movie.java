package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class movie {
	
	@Id
	int id;
	
	String name;
	String directorName;
	String star;
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
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public movie(int id, String name, String directorName, String star) {
		super();
		this.id = id;
		this.name = name;
		this.directorName = directorName;
		this.star = star;
	}
	
	

}
