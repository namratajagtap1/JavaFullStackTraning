package com.yash.oopsassignment10;

import java.util.logging.Logger;

public class Product implements Cloneable {
	static Logger logger=Logger.getLogger(Product.class.getName());
	
	 private int pid;
	 private String pname;
	 private double price;
	 private float unitOfMeasurement;
	 
	 

	public Product(int pid, String pname, double price, float unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}
	
	
	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	void display() {
		System.out.println("pid "+pid);
		System.out.println("name "+pname);
		System.out.println("price "+price);
		System.out.println("unit "+unitOfMeasurement);
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		Product p=new Product(1, "namrata", 3000d, 3.4f);
		Product c=(Product) p.clone();
		c.display();
		
		logger.info("change the object value and check incetance of");
		c.setPname("ashwini");
		c.setPrice(4000d);
		c.display();
		System.out.println(c instanceof Product);
		}

		
	}


