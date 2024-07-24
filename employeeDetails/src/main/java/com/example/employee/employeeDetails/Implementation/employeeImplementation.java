package com.example.employee.employeeDetails.Implementation;

import java.util.List;
import java.util.Optional;

import com.example.employee.employeeDetails.entity.employee;

public interface employeeImplementation {
	
	List<employee> getAll();
	Optional<employee> getOne(int id);
	String delete(int id);
	String addOne(employee emp);
	String deleteAll();

}
