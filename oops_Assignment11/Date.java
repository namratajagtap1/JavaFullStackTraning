package com.yash.oops_Assignment11;

public class Date {
	private String emp_dob;
	private String emp_doj;
	
	
	public Date(String emp_dob, String emp_doj) {
		
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}
	

	public String getEmp_dob() {
		return emp_dob;
	}


	public void setEmp_dob(String emp_dob) {
		this.emp_dob = emp_dob;
	}


	public String getEmp_doj() {
		return emp_doj;
	}


	public void setEmp_doj(String emp_doj) {
		this.emp_doj = emp_doj;
	}


	@Override
	public String toString() {
		return "Date [emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
	
	
	
}