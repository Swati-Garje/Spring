package com.employee.employeecrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.employeecrud.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId);
	public List<Employee> getEmployeeByEmpName(String empName);
	public Employee deleteEmployee(int empId);
//	public Employee up
}
