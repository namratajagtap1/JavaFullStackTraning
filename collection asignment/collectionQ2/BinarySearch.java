/**
 * 
 */
package com.yash.collectionQ2;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author namrata.jagtap
 *
 */
public class BinarySearch {
static Logger logger=Logger.getLogger(BinarySearch.class.getName());
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
        ArrayList<Integer> arr = new ArrayList<Integer>();

       arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35);
        
        int value=30;
        int result=Collections.binarySearch(arr, value);
        logger.info("Value at index  :"+result);
    }
}
