/**
 * 
 */
package com.yash.streamapi_item_asignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.yash.jdkstreamapi.Product;

/**
 * @author namrata.jagtap
 *
 */
public class MainClass {
	static Logger logger=Logger.getLogger(MainClass.class.getClass());

	public static void main(String[] args) {
		BasicConfigurator.configure();
		float sum=0,avg;

		LocalDateTime myObj = LocalDateTime.now();
		
		ArrayList<Item>item=new ArrayList<>();
		Item i1=new Item(1,"mobile",myObj,myObj,12);
		Item i2=new Item(2,"laptop",myObj,myObj,12000);
		Item i3=new Item(3,"bag",myObj,myObj,140);
		Item i4=new Item(4,"pen",myObj,myObj,12);
		Item i5=new Item(5,"machine",myObj,myObj,2000);
		
		item.add(i1);
		item.add(i2);
		item.add(i3);
		item.add(i4);
		item.add(i5);



		// WAP to find the average price of item from the list of given items
		long avgprice[]= {i1.getPrice(),i2.getPrice(),i3.getPrice(),i4.getPrice(),i5.getPrice()};
		for(float num:avgprice) 
			
			sum = Arrays.stream(avgprice).sum();//sum+=num;
		logger.info("average of price is:"+sum/avgprice.length);

		//WAP to print detail of item which is having highest and lowest price.
		List<Long>list=Arrays.asList(i1.getPrice(),i2.getPrice(),i3.getPrice(),i4.getPrice(),i5.getPrice());
		Optional<Long> minPrice=list.stream().min(Comparator.comparing(Long::intValue));
		logger.info("Minimum price from list:"+minPrice);

		List<Long>list1=Arrays.asList(i1.getPrice(),i2.getPrice(),i3.getPrice(),i4.getPrice(),i5.getPrice());
		Optional<Long> maxPrice=list1.stream().max(Comparator.comparing(Long::intValue));
		logger.info("maximum price from list:"+maxPrice);

		// WAP to remove duplicate prices from the list of the items.
		Set<Long> price = new HashSet<>(list1);
		logger.info("Remove duplicate price:"+price);

		// WAP to store item name and price from list to set. 

		logger.info("print name and price:");
		Set<Item>set=new HashSet<>();
		set.addAll(item);
		set.stream().forEach((data)->{
			logger.info(data.getIname()+" "+data.getPrice());

		});
		
		


	}

}
