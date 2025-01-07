package com.example.employeeService.service;

import com.example.employeeService.entity.Employee2;

public interface IEmployeeService {

	Employee2 saveEmployee(Employee2 employee);
	Employee2 findByID(int eid);
	Employee2 updateEmployee(int eid,Employee2 employee);
	String deleteEmployee(int id);
}
