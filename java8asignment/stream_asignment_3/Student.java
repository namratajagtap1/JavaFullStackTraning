package com.yash.stream_asignment_3;

import java.time.LocalDate;


public class Student {
	private int rollno;
	private LocalDate date_of_addmission,dob;
	private StudentSubject sub;
	private String classname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, LocalDate date_of_addmission, LocalDate dob, StudentSubject sub, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.sub = sub;
		this.classname = classname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public LocalDate getDate_of_addmission() {
		return date_of_addmission;
	}
	public void setDate_of_addmission(LocalDate date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public StudentSubject getSub() {
		return sub;
	}
	public void setSub(StudentSubject sub) {
		this.sub = sub;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", sub="
				+ sub + ", classname=" + classname + "]";
	}
	
	

}
	