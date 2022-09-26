package com.yash.java8asignment;

import java.util.Scanner;

interface Print {
	String print(String originalString, String stringToBeInserted, int index);
}

public class InsertStringQ4 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter original");
		String originalString = sc.next();
		System.out.println("Enter which u want to insert");
		String wantToInsert = sc.next();
		System.out.println("Enter index where u want to insert");
		int index = sc.nextInt();
		
		Print word = (s1, s2, in) -> {
			String newString = new String();
			for (int i = 0; i < s1.length(); i++) {
				newString += s1.charAt(i);
				if (i == in) {
					newString += s2;
				}
			}
			return newString;

		};
		 System.out.println("Result: "+word.print(originalString,wantToInsert, index));
		
	}

	/*
	 * public static String insertString(String originalString, String
	 * stringToBeInserted, int index){ String newString = new String(); for (int i =
	 * 0; i < originalString.length(); i++) { newString += originalString.charAt(i);
	 * if (i == index) { newString += stringToBeInserted; } } return newString; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc = new Scanner(System.in); System.out.println("Enter original");
	 * String originalString = sc.next();
	 * System.out.println("Enter which u want to insert"); String wantToInsert =
	 * sc.next(); System.out.println("Enter index where u want to insert"); int
	 * index = sc.nextInt();
	 * 
	 * System.out.println("we want final String is" + insertString(originalString,
	 * wantToInsert, index));
	 * 
	 * }
	 */

}
