package com.example.employeeService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<String> dataNotFoundExceptionHandler(DataNotFoundException dataNotFoundException)
	{
		return new ResponseEntity<String>(dataNotFoundException.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
