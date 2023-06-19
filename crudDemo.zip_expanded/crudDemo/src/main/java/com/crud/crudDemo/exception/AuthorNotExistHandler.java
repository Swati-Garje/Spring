package com.crud.crudDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@ControllerAdvice
public class AuthorNotExistHandler {

	@ExceptionHandler(AuthorNotExist.class)
	public ResponseEntity<String> authorNotExistsException()
	{
		return new ResponseEntity<String>("author not exist",
											HttpStatus.NOT_ACCEPTABLE);
	}
}
