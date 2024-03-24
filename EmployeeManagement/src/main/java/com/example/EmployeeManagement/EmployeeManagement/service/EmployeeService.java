package com.example.EmployeeManagement.EmployeeManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.EmployeeManagement.implementation.EmployeeImpl;
import com.example.EmployeeManagement.EmployeeManagement.repo.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeImpl{
	
	@Autowired
	public EmployeeRepo employeerepo;

	@Override
	public Employee addEmp(Employee emp) {

		return employeerepo.save(emp);
	}



	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeerepo.findAll();
	}



	@Override
	public Optional<Employee> getEmp(int id) {

		return employeerepo.findById(id);
	}



	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeerepo.deleteById(id);
		
	}







}
