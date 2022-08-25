package com.yash.trainingPractice;

public class StringQuestion6 {

	public static void main(String[] args) {
		String s1 = "Yash Tech";
		String s2 = new String("Yash Tech");
		String s4 = new String("Yash Tech");
		String s3 = "Yash Tech";

		System.out.println(s1 == s2);// false
		System.out.println(s3 == s1);// true
		System.out.println(s3 == s4);// false
		System.out.println(s1.equals(s3));// true

	}

}
