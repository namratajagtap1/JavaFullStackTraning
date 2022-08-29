package com.yash.array_string_asign;

import java.util.logging.Logger;

//You are given a sequence of Character in the form of Array. Now you have to put all vowels and 
//consonants together in the array

public class ArrayQuestion8 {
	static Logger logger = Logger.getLogger(ArrayQuestion8.class.getName());

	public static void main(String args[]) {

		String str = "technicalskills";
		char[] a = str.toCharArray();
		logger.info("The vowels are");
		logger.info("{");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				continue;
			}
			logger.info(a[i] + ",");
		}
		logger.info("}");
		System.out.println();
		logger.info("The consonents are ");
		logger.info("{");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				logger.info(a[i] + ",");
			}
		}
		logger.info("}");
	}
}
