package com.example.departmentService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentService.entity.Department;
import com.example.departmentService.repository.DeparmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DeparmentRepository deparmentRepository;
	@Override
	public Department save(Department department) {
			return deparmentRepository.save(department);
	}

	@Override
	public Department getDepartment(int dId) {
		
		Optional<Department> e=deparmentRepository.findById(dId);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}

}
