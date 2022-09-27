/**
 * 
 */
package com.yash.exceptionQ10;

import java.util.Arrays;

/**
 * @author namrata.jagtap
 *
 */
public class Parent {
	Test m1 = new Test();

	void largest(int[] arr) {
		try {
			System.out.println("I am from Parent class");
			Arrays.sort(arr);

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e);
		}

	}
}


