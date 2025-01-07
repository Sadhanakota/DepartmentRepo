package com.example.departmentService.service;

import com.example.departmentService.entity.Department;

public interface DepartmentService {

	Department save(Department department);
	Department getDepartment(int dId);
}
