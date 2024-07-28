package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookingdetails")
public class bookingDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String source;
	String destination;
	String customername;
	long phone;
	String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public bookingDetails(int id, String source, String destination, String customername, long phone, String status) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.customername = customername;
		this.phone = phone;
		this.status = status;
	}
	public bookingDetails() {
		super();
	}
  
	
	
	

}
