package com.example.EmployeeManagement.EmployeeManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.EmployeeManagement.implementation.EmployeeImpl;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@RestController
public class EmployeeController {
	

	@Autowired
	public EmployeeImpl employeeimpl;
	
	@PostMapping("/addEmp")
	public Employee addemp(@RequestBody Employee emp) {
		
		return employeeimpl.addEmp(emp);
	}
	
	@GetMapping("/findAllEmp")
	public List<Employee> findAllEmp(){
		
		return employeeimpl.getAll();
	}
	
	@GetMapping("/findEmp/{id}")
	public Optional<Employee> findEmp(@PathVariable int id){
		
		return employeeimpl.getEmp(id);
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public java.lang.String deleteEmp(@PathVariable int id) {
		employeeimpl.deleteById(id);
		return "row deleted";
		
	}

}
