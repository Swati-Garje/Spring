package com.ness.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

public class EmployeeService {
	public static void main(String[] args) {

		//create employee and add it to company
		Employee employee1 = new Employee(2, "Rahul", "Ambernath");
		Employee employee2 = new Employee(3, "Hrutik", "Kalyan");
		Employee employee3 = new Employee(1, "Sahil", "Kalyan");
		
		
		LinkedList<Employee> employees= new LinkedList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		System.out.println((employees).getLast());
		System.out.println(employees.peek());


		//Company company = new Company(employees);
		
		//company.print();
	}


}
