package sprnewproj.mynewproj.model;

import java.time.LocalDate;

public class Employee {
	private String eName;
	private int eId;
	private LocalDate dob;
	private Department department;
	
	public Employee() {
		super();
	}
	public void destroy()
	{
		System.out.println("bean is being destroy");
	}

	
	public Employee(String eName, int eId, LocalDate dob, Department department) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.dob = dob;
		this.department = department;
	}
	
	public Employee(String eName, int eId, Department department) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.department = department;
	}
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + ", dob=" + dob + ", department=" + department + "]";
	}
	
}
