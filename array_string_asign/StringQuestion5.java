package com.yash.array_string_asign;

public class StringQuestion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   long startTime = System.currentTimeMillis();
           StringBuilder sb = new StringBuilder();
           StringBuffer sb2 = new StringBuffer();
           while (System.currentTimeMillis() - startTime <= 1000){



              sb.append("Y");
              sb2.append("Y");
           }
           System.out.println("string builder short: " + sb.length());
           System.out.println("string buffer short: " + sb2.length());
       }
	}


