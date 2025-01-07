package com.example.employeeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeService.entity.Employee2;

public interface EmployeeRepository  extends JpaRepository<Employee2, Integer>{

}
