package com.crud.crudDemo.exception;

public class AuthorAlreadyExists extends RuntimeException{
	
	public AuthorAlreadyExists(String message)
	{
		super(message);
	}
}
