package com.example.employeeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeService.dto.Department;
import com.example.employeeService.dto.EmployeeDepartmentResponse;
import com.example.employeeService.entity.Employee2;
import com.example.employeeService.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private DepartmentClient departmentClient;
	
	@PostMapping("/save")
	public ResponseEntity<Employee2> save(@RequestBody Employee2 employee)
	{
		return new ResponseEntity<Employee2>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDepartmentResponse> findById(@PathVariable int id)
	{
		Department department=departmentClient.findById(id);
		Employee2 employee=employeeService.findByID(id);
		EmployeeDepartmentResponse emr=new EmployeeDepartmentResponse();
		emr.setDepartment(department);
		emr.setEmployee(employee);
		return new ResponseEntity<EmployeeDepartmentResponse>(emr, HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee2> updateEmployee(@RequestBody Employee2 employee,@PathVariable int id)
	{
		return new ResponseEntity<Employee2>(employeeService.updateEmployee(id, employee), HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id)
	{
		return new ResponseEntity<String>(employeeService.deleteEmployee(id),HttpStatus.OK);
	}
}
