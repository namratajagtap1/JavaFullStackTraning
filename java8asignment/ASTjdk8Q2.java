/**
 * 
 */
package com.yash.java8asignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author namrata.jagtap
 *
 */
public class ASTjdk8Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Taj is ast situated ast in Agra";
		List<String> list = Arrays.asList(str.split(" "));
		Object[] a = list.toArray();
		List<String> list2 = list.stream().filter(i -> i.contains("ast")).collect(Collectors.toList());
		System.out.println(list2);
	}

}
