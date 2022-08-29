package com.yash.oops_Assignment11;

public class Employee extends Date {
	private int empid;
	private String empname;
	private String empsalary;
	private String empaddress;

	

	public Employee(int empid, String empname, String empsalary, String empaddress,String doj,String dob) {
		super(doj,dob);
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
	}
	
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public void setEmpsalary(String empsalary) {
		this.empsalary = empsalary;
	}
	
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", Date of Birth=" + getEmp_dob() + ", Date of Joining=" + getEmp_doj() +  "]";
	}
	

	
	
}