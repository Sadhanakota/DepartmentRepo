package com.example.departmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.departmentService.entity.Department;

public interface DeparmentRepository extends JpaRepository<Department, Integer>{

}
