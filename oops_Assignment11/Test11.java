/**
 * 
 */
package com.yash.oops_Assignment11;

import java.util.logging.Logger;

/**
 * @author namrata.jagtap
 *
 */
public class Test11 {
static Logger logger=Logger.getLogger(Test11.class.getName());
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date emp=new Employee(1, "namrata", "10000", "pune","01/03/1994","01/12/2021");
		logger.info(emp.toString());

	}

}
