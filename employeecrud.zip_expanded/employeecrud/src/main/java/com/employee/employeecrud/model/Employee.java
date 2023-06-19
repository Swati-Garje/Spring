package com.employee.employeecrud.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	int empId;
	String empName;
	Date dob;
	String city;
	String mobileNumber;
	int salary;
}
