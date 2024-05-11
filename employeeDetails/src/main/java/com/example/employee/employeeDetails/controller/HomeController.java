package com.example.employee.employeeDetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.employeeDetails.Implementation.employeeImplementation;
import com.example.employee.employeeDetails.entity.employee;

@RestController
public class HomeController {
	
	@Autowired
	public employeeImplementation employeeimpl;
	
	@GetMapping("/getAllEmp")
	public List<employee> getAll(){
		return employeeimpl.getAll();
	}
	
	@GetMapping("/getOne")
	public Optional<employee> getOne(int id){
		return employeeimpl.getOne(id);
	}
	
	
	@PostMapping("/deleteOne")
	public String deleteOne(int id){
		return employeeimpl.delete(id);
	}

}
