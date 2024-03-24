package com.example.EmployeeManagement.EmployeeManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.EmployeeManagement.EmployeeManagement.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
