package com.crud.crudDemo.exception;

public class AuthorNotExist extends RuntimeException {
	
	public AuthorNotExist(String message)
	{
		super(message);
	}
}
