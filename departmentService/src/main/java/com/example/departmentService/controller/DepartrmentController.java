package com.example.departmentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentService.entity.Department;
import com.example.departmentService.service.DepartmentService;

@RestController
@RequestMapping(value= "/department")
public class DepartrmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/save")
	public ResponseEntity<Department> save(@RequestBody Department department)
	{
		return new ResponseEntity<Department>(departmentService.save(department),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> findById(@PathVariable("id") int id)
	{
		return new ResponseEntity<Department>(departmentService.getDepartment(id),HttpStatus.OK);
	}

}
