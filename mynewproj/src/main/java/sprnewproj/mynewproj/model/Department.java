package sprnewproj.mynewproj.model;

public class Department {
	
	private String department;

	public Department() {
		super();
	}
	public Department(String department) {
		super();
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Department [department=" + department + "]";
	}

	
	
}
