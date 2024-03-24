package com.example.EmployeeManagement.EmployeeManagement.implementation;

import java.util.List;
import java.util.Optional;

import com.example.EmployeeManagement.EmployeeManagement.entity.Employee;

public interface EmployeeImpl {
	
	public Employee addEmp(Employee emp);
	
	public Optional<Employee> getEmp(int id);
	
	public List<Employee> getAll();
	
	public void deleteById(int id);


}
