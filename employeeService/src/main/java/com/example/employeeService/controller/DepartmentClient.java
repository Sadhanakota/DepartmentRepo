package com.example.employeeService.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employeeService.dto.Department;

//for local meachine url =http://localhost:8084
//for virtual meachine url=http://vmIpaddress:9991 9991 is the exteranllythe departmentservice serving port 

@FeignClient(name="departmentService", url="http://13.126.108.60:9991")
public interface DepartmentClient {

	@GetMapping(value="department/{id}")
	Department findById(@PathVariable("id") int id);
	
}
