package com.example.employeeService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeService.entity.Employee2;
import com.example.employeeService.exceptions.DataNotFoundException;
import com.example.employeeService.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee2 saveEmployee(Employee2 employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee2 findByID(int eid) {
		
		return employeeRepository.findById(eid).get();
	}

	@Override
	public Employee2 updateEmployee(int eid, Employee2 employee) {
		Optional<Employee2> e=employeeRepository.findById(eid);
		if(e.isPresent())
		{
			Employee2 e1=e.get();
			if(employee.getEmployeeName()!=null)
			{
				e1.setEmployeeName(employee.getEmployeeName());
			}
			if(employee.getEmployeeEmail()!=null)
			{
				e1.setEmployeeEmail(employee.getEmployeeEmail());
			}
			return employeeRepository.save(e1);
		}
		else {
			throw new DataNotFoundException("Employee with the given id is not present");
	}
	}
	@Override
	public String deleteEmployee(int id) {
		Optional<Employee2> e=employeeRepository.findById(id);
		if(e.isPresent())
		{
			Employee2 e1=e.get();
			employeeRepository.delete(e1);
		return  "Deleted Successfully";
		}
		else {
			throw new DataNotFoundException("Employee with the given id is not present");
		}

}
}