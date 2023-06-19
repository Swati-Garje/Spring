package Multithreading;

public class Employee {
	private int empId;
	private String empName;
	private String dept;
	private int managerId;
	private int salary;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, String dept, int managerId, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.managerId = managerId;
		this.salary = salary;
	}
	
	
}
