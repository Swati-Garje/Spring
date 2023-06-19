package com.employee.employeecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeecrud.model.Employee;
import com.employee.employeecrud.service.EmployeeService;

@RequestMapping("employee")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		Employee savedEmployee = employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(savedEmployee,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> employees = employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.FOUND);
	}
	
	@GetMapping("getbyid/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int empId){
		Employee employees = employeeService.getEmployeeById(empId);
		return new ResponseEntity<Employee>(employees,HttpStatus.FOUND);
	}
	
	@GetMapping("getbyname/{empName}")
	public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable String empName){
		List<Employee> employees = employeeService.getEmployeeByEmpName(empName);
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.FOUND);
	}
}



















