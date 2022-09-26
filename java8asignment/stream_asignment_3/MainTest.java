/**
 * 
 */
package com.yash.stream_asignment_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author namrata.jagtap
 *
 */
public class MainTest {
	static Logger logger=Logger.getLogger(MainTest.class.getClass());
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicConfigurator.configure();

		List l=Arrays.asList(
				new Student(1, LocalDate.of(2021, 8, 23), LocalDate.of(2005,8,23), new StudentSubject(45, 33, 39, 40, 44), "10th"),
				new Student(2, LocalDate.of(2021, 5, 22), LocalDate.of(2004,4,13), new StudentSubject(45, 30, 32, 44, 44), "10th"),
				new Student(3, LocalDate.of(2021, 9, 26), LocalDate.of(2004,10,14), new StudentSubject(35, 37, 41, 46, 34), "10th"),
				new Student(4, LocalDate.of(2021, 2, 28), LocalDate.of(2005,12,22), new StudentSubject(45, 39, 48, 42, 34), "10th"),
				new Student(5, LocalDate.of(2021, 4, 19), LocalDate.of(2003,6,7), new StudentSubject(45, 37, 39, 40, 44), "10th"),
				new Student(6, LocalDate.of(2021, 6, 3), LocalDate.of(2006,9,8), new StudentSubject(44, 33, 39, 38, 42), "10th")

				);
		System.out.println("student who scored less than 40%");


	}

}
