package com.example.employee.employeeDetails.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.employeeDetails.entity.employee;

public interface employeeRepository extends JpaRepository<employee,Integer>{

}
