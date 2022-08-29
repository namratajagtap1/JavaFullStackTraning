package com.yash.oopsasignment_8;

import java.util.logging.Logger;

public class Test8 {
static Logger logger=Logger.getLogger(Test8.class.getName());
	
	public static void main(String[] args) {

		Electronic mobile=new Mobile(1, "gallium", "03/01/1993");
		Electronic lcd=new Lcd(2, "crystal", "13/11/1994");
		Electronic laptop=new Laptop(3, "selenium", "23/09/2021");
		mobile.printinfo();
		lcd.printinfo();
		laptop.printinfo();

	}

}
