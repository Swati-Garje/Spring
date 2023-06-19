package Multithreading;

public class Department {
	private int deptId;
	private String dept;
	private String deptHead;
	private int noOfEmp;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public Department(int deptId, String dept, String deptHead, int noOfEmp) {
		super();
		this.deptId = deptId;
		this.dept = dept;
		this.deptHead = deptHead;
		this.noOfEmp = noOfEmp;
	}
	
	
}
