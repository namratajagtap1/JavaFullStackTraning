package com.yash.arrayspractice;

public class Aliean {
private int id;
private String name;
private String mobNo;
public Aliean() {
	super();
	// TODO Auto-generated constructor stub
}
public Aliean(int id, String name, String mobNo) {
	super();
	this.id = id;
	this.name = name;
	this.mobNo = mobNo;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the mobNo
 */
public String getMobNo() {
	return mobNo;
}
/**
 * @param mobNo the mobNo to set
 */
public void setMobNo(String mobNo) {
	this.mobNo = mobNo;
}
@Override
public String toString() {
	return "Aliean [id=" + id + ", name=" + name + ", mobNo=" + mobNo + "]";
}



}
