package com.yash.array_string_asign;

public class Arrayquestion10 {

	public static void main(String[] args) {
		String[] arr = { "yash", "pune", "magarpatta", "technology", "mam" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(Palindrome(arr[i]))) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static String Palindrome(String reverse) {
		String temp = reverse;
		String rev = "";
		for (int i = temp.length() - 1; i >= 0; i--) {
			rev = rev + temp.charAt(i);
		}
		return rev;
	}
}
