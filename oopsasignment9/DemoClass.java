package com.yash.oopsasignment9;

public class DemoClass {

	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		System.out.println("Hashcode of object= " + obj.hashCode());
		obj = null;
		// calling garbage collector
		System.gc();
		System.out.println("end of garbage collection");

	}

	protected void finalize() {
		System.out.println("finalize method called");
	}

}
