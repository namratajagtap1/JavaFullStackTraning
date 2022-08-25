/**
 * 
 */
package com.yash.trainingPractice;

import java.util.Scanner;

/**
 * @author namrata.jagtap
 *
 */
public class ArrayQuestion4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double side1,side2,hypotenius;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side1");
		side1=sc.nextDouble();
		System.out.println("enter side2");
		side2=sc.nextDouble();
		
		hypotenius=Math.sqrt((side1*side1)+(side2*side2));
		System.out.println(hypotenius+" is ans");

	}

}
