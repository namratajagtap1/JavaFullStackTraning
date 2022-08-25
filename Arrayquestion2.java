package com.yash.trainingPractice;

public class Arrayquestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int s1[] = { 1, 4, 3, 3,4,2, 5, 6, 7 };
	        
	        int count = 0;
	        for (int i = 0; i <= s1.length; i++) {
	            for (int j = i + 1; j <= s1.length-1; j++) {
	                if (s1[i] == s1[j]) {
	                    count++;
	                    System.out.println( s1[j] + " = " + count);
	                    
	                }
	                
	            }
		
	}

	}
}
