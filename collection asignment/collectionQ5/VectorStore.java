package com.yash.collectionQ5;

import java.util.Collections;
import java.util.Vector;

import org.apache.log4j.Logger;

public class VectorStore {
	static Logger logger=Logger.getLogger(VectorStore.class.getName());

	public static void main(String[] args) {
		Vector<String>animals=new Vector<>();
		
		animals.add("Cow");
		animals.add("Tiger");
		animals.add("Loin");
		animals.add("Dog");
		animals.addElement("Cat");
			    
	logger.info(animals);
		Collections.sort(animals);
		logger.info(animals);
		
	}
	
}
