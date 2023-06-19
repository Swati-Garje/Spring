package com.employee.employeecrud.exception;

public class EmployeeNotExist extends RuntimeException{
	public EmployeeNotExist(String msg) {
		super(msg);
	}

}
