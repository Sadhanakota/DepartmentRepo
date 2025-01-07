package com.example.employeeService.exceptions;

public class DataNotFoundException extends RuntimeException{

	public DataNotFoundException(String mess)
	{
		super(mess);
	}
	
}
