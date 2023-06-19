package com.employee.employeecrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.employee.employeecrud.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

	public List<Employee> findByEmpName(String empName);

}
