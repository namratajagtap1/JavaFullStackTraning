package com.yash.collectionQ4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;


public class CollectionQ4 {
	static Logger logger=Logger.getLogger(CollectionQ4.class.getName());

	public static void main(String[] args) {
    List<String>names=new ArrayList<>(Arrays.asList("Namrata","Ashwini","pooja","Neha","sayali","Namrata","Ashwini"));
    logger.info(names);
	/*
	 * Collections.sort(names); for(String n:names) { System.out.println(n); }
	 */
    ArrayList<String>newList=new ArrayList<>();
    for(String n:names) {
    	if(!newList.contains(n)) {
    		newList.add(n);
    		
    	}
    }
    for(String dupName:newList) {
    	logger.info(dupName);
    	
    }
    
    Collections.sort(newList,Collections.reverseOrder());
    logger.info(newList);
   
	}
	
	

}
