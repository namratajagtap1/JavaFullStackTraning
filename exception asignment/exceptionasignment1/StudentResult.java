package com.yash.exceptionasignment1;

import java.util.Scanner;

import javax.security.auth.Subject;

public class StudentResult  {
private int maths;
private int marathi;
private int hindi;
private int geometry;
private int physics;

public StudentResult(int maths, int marathi, int hindi, int geometry, int physics) {
	super();
	this.maths = maths;
	this.marathi = marathi;
	this.hindi = hindi;
	this.geometry = geometry;
	this.physics = physics;
}
public int getMaths() {
	return maths;
}
public void setMaths(int maths) {
	this.maths = maths;
}
public int getMarathi() {
	return marathi;
}
public void setMarathi(int marathi) {
	this.marathi = marathi;
}
public int getHindi() {
	return hindi;
}
public void setHindi(int hindi) {
	this.hindi = hindi;
}
public int getGeometry() {
	return geometry;
}
public void setGeometry(int geometry) {
	this.geometry = geometry;
}
public int getPhysics() {
	return physics;
}
public void setPhysics(int physics) {
	this.physics = physics;
}
@Override
public String toString() {
	return "StudentResult [maths=" + maths + ", marathi=" + marathi + ", hindi=" + hindi + ", geometry=" + geometry
			+ ", physics=" + physics + "]";
}
	
	
}
