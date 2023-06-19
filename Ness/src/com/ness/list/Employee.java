package com.ness.list;

public class Employee implements Comparable<Employee>{

	//write 3 properties
	int empId;
	String empName;
	String empLoc;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLoc() {
		return empLoc;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	
	public Employee(int empId, String empName, String empLoc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLoc = empLoc;
	}
	
	@Override
	public int compareTo(Employee e) {
		return this.empId  -  e.empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLoc=" + empLoc + "]";
	}
	
	
	
}


