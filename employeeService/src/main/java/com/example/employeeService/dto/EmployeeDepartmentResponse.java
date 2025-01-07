package com.example.employeeService.dto;

import com.example.employeeService.entity.Employee2;

public class EmployeeDepartmentResponse {

	private Employee2 employee;
	private Department department;
	public Employee2 getEmployee() {
		return employee;
	}
	public void setEmployee(Employee2 employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
//	public EmployeeDepartmentResponse(Employee2 employee, Department department) {
//		super();
//		this.employee = employee;
//		this.department = department;
//	}
	public EmployeeDepartmentResponse() {
		super();
	}
	
}
