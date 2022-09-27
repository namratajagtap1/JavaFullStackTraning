package com.yash.collectionQ6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CollectionSort {
	static Logger logger=Logger.getLogger(CollectionSort.class.getName());
	
	public static void main(String[] args) {
		BasicConfigurator.configure();

	HashMap<String, String>city=new HashMap();
	city.put("pune", "1234564");
	city.put("Nagar", "64564");
	city.put("Aurangabad", "5634564");
	city.put("Baramati", "14564");
	city.put("Mumbai", "34564");
	
	Iterator<String>it=city.keySet().iterator();
	while(it.hasNext()) {
		String key=it.next();
		System.out.println(key+"="+city.get(key));
	}
	HashMap<String, String>newcity=new HashMap();
	logger.info("Sorting");
	
	TreeMap<String, String>sorted=new TreeMap(city);
	Iterator itr=sorted.keySet().iterator();
	while(itr.hasNext())    
	{    
	String key=(String) itr.next();  
	//logger.i("Roll no:  "+key+"     name:   "+city.get(key));  
	logger.info("Roll no:  "+key+"     name:   "+city.get(key));  
	}    
	}  
	}


