package com.example.employee.employeeDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.employeeDetails.Implementation.employeeImplementation;
import com.example.employee.employeeDetails.Repo.employeeRepository;
import com.example.employee.employeeDetails.entity.employee;

@Service
public class employeeService implements employeeImplementation{
	
	@Autowired
	public employeeRepository employeerepo;

	@Override
	public List<employee> getAll() {		
		return employeerepo.findAll();
	}

	@Override
	public Optional<employee> getOne(int id) {
		return employeerepo.findById(id);
	}

	@Override
	public String delete(int id) {
		employeerepo.deleteById(id);
		return "Record with "+id+" deleted";
	}

	@Override
	public String addOne(employee emp) {
		
		return "true";
		
		
	}

	@Override
	public String deleteAll() {
		employeerepo.deleteAll();
		return "deletion done!!";
		
	}


	

}
