package com.yash.oops_asignment_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class Test {
	static Logger logger=Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) throws ParseException {
		Department[] deptDepartments = new Department[2];
		deptDepartments[0] = new Department("Dept101", "Hr Department");
		deptDepartments[1] = new Department("Dept201", "It Department");

		String birthDate = "01/03/1994";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);

		String joinDate = "22/7/2022";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);

		String regDate = "01/02/2022";
		Date dor = new SimpleDateFormat("dd/MM/yyyy").parse(regDate);

		Employee emp = new Employee(1, "Namrata", "Wagholi", dob, 100000.00, doj, "Pune", deptDepartments[1], 78945,
				"nilumohale234511@gmail.com");

		Customer customer = new Customer(101, "Namrata", "wagholi", dob, dor, "pune", 11450, "namratajagtap@gmail.com");

		//System.out.println("Employee Details");
		logger.info("Employee Details");
		emp.printEmployeeDetails();
		//System.out.println("\ncustomer Details");
		logger.info("\ncustomer Details");
		customer.printCustomerDetails();
	}
}
