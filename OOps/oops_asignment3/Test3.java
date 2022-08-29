/**
 * 
 */
package com.yash.oops_asignment3;

import java.util.logging.Logger;

import com.yash.oops_asignment_1.Department;

/**
 * @author namrata.jagtap
 *
 */
public class Test3 {
static Logger logger=Logger.getLogger(Test3.class.getName());

	public static void main(String[] args) {
		Branch[] branch = new Branch[2];
		branch[0]=new Branch(12, "hdfc", "wagholi");
		branch[1]=new Branch(34, "icici", "hadpsar");
		
		Customer[] cusarray=new Customer[3];
		cusarray[0]=new Customer(1, "12345", "namrata", "pune", "01/03/1994", "23/11/2019", branch[0]);
		
		Customer_Account_Statement c=new Customer_Account_Statement("1a32",cusarray[0] , 1000f, 1500, "01/03/1994");
				
		

      System.out.println(c);
	}

}
