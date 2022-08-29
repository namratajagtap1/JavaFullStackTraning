package com.yash.oops_asignment5;

import java.util.logging.Logger;

public  class D extends C {
static Logger logger=Logger.getLogger(D.class.getName());
	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

public static void main(String[] args) {
	
	D d=new D();
	logger.info("sum is="+d.sum(10, 4));
	logger.info("sub is="+d.sub(10, 4));
	logger.info("mul is="+d.mul(10, 4));
	logger.info("div is="+d.div(10, 4));
	
}
}