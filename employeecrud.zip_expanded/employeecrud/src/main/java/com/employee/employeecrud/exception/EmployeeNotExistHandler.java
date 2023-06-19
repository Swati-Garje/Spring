package com.employee.employeecrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@ControllerAdvice
public class EmployeeNotExistHandler {
	
	@ExceptionHandler(EmployeeNotExist.class)
	public ResponseEntity<String> EmployeeNotExisthandler(){
		return new ResponseEntity<String>("Employee Not exist",
				HttpStatus.NOT_ACCEPTABLE);
		
	}

}
