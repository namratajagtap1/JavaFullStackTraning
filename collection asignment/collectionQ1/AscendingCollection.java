package com.yash.collectionQ1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class AscendingCollection {
static org.apache.log4j.Logger logger=org.apache.log4j.Logger.getLogger(AscendingCollection.class.getName());
	public static void main(String[] args) {
		
		List<Integer>numbers=new ArrayList<>();
		numbers.add(34);
		numbers.add(78);
		numbers.add(45);
		numbers.add(98);
		
		Collections.sort(numbers);
		for(int n:numbers) {
			logger.info(n);
		}

	}

}
