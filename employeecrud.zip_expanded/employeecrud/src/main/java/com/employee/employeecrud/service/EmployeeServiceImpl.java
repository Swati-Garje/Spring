package com.employee.employeecrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeecrud.dao.EmployeeDao;
import com.employee.employeecrud.exception.EmployeeNotExist;
import com.employee.employeecrud.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee saveEmployee(Employee employee) {	
			return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Optional<Employee> found = employeeDao.findById(empId);
		if(found.isPresent()) {
			return found.get();
		}else {
			throw new EmployeeNotExist("employee already exists");
		}
	}
	
	@Override
	public List<Employee> getEmployeeByEmpName(String empName) {
		List<Employee> found = employeeDao.findByEmpName(empName);
		if(found.isEmpty()) {
			throw new EmployeeNotExist("employee already exists");
		}
		else {
			return found;
		}
	}
	
	@Override
	public Employee deleteEmployee(int empId) {
		Employee found = getEmployeeById(empId);
		if(found==null) {
			throw new EmployeeNotExist("employee not exists");
		}else {
			employeeDao.deleteById(empId);	
			return found;
		}
	}

}













