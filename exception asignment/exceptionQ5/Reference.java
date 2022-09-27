/**
 * 
 */
package com.yash.exceptionQ5;

import java.time.LocalTime;

/**
 * @author namrata.jagtap
 *
 */
public class Reference {
	public static void main(String[] args) {
		// create a LocalTime object

		LocalTime time = LocalTime.now();

		// get Hour field using getHour()
		int Hour = time.getHour();

		// print result
		System.out.println("Hour Field: " + Hour);
	}
}
