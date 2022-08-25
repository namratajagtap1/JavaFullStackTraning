/**
 * 
 */
package com.yash.trainingPractice;

/**
 * @author namrata.jagtap
 *
 */
public class ArrayQuestion5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       int a[] = { 3, 5, 1, 7, 68, 23, 8, 54, 32 };



	       int even = 0, odd = 0, perfect = 0, prime = 0;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] % 2 == 0) {
	                even++;
	            }
	            if (a[i] % 2 != 0) {
	                odd++;
	            }
	            int count = 0;
	            for (int j = a[i]; j > 0; j--) {
	                if (a[i] % j == 0) {
	                    count++;



	               }
	            }
	            if (count == 2) {
	                prime++;
	            }



	       }
	        System.out.println("even no "+even);
	        System.out.println("odd no "+odd);
	        System.out.println("prime no "+prime);



	   }
	}