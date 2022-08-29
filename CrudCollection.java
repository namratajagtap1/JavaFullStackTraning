package com.yash.arrayspractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.Logger;

public class CrudCollection {
	static Logger logger = Logger.getLogger(CrudCollection.class.getName());

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		ArrayList<Aliean> c = new ArrayList<Aliean>();
		int ch;
		do {
			logger.info("1.INSERT");
			logger.info("2.DISPLAY");
			logger.info("3.SEARCH");
			logger.info("4.DELETE");
			logger.info("5.UPDATE");
			
			logger.info("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				logger.info("Enter Aliean Id");
				int a = sc.nextInt();
				logger.info("Enter Aliean Name");
				String name = str.nextLine();
				logger.info("Enter mob Number");
				String mobno = str.nextLine();

				c.add(new Aliean(a, name, mobno));

				break;
			case 2:
				
				Iterator<Aliean> i = c.iterator();
				while (i.hasNext()) {
					Aliean b = i.next();
					System.out.println(b);
					
				}
				break;
			case 3:
				boolean search = false;
				System.out.println("Enter id Which u want to search");
				int alienId = sc.nextInt();
				
				i = c.iterator();
				while (i.hasNext()) {
					Aliean b = i.next();
					if (b.getId() == alienId) {
						System.out.println(b);
						search = true;
					}
				}
				if(!search) {
					logger.info("record not found");
				}

				break;
				
			case 4:
				 search = false;
				System.out.println("Enter id Which u want to delete");
				alienId = sc.nextInt();
				
				i = c.iterator();
				while (i.hasNext()) {
					Aliean b = i.next();
					if (b.getId() == alienId) {
					i.remove();
						search = true;
					}
				}
				if(!search) {
					logger.info("record not found");
				}else {
					logger.info("deleted successfully");
				}

				break;
				
			case 5:
				 search = false;
				System.out.println("Enter id Which u want to update");
				alienId = sc.nextInt();
				ListIterator<Aliean>up=c.listIterator();
				//Iterator< Aliean>update=c.iterator();
			//	i = c.iterator();
				while (up.hasNext()) {
					Aliean b = up.next();
					if (b.getId() == alienId) {
				logger.info("enter alian name");
				name=str.nextLine();
				logger.info("enter alian mob");
				mobno=str.nextLine();
				up.set(new Aliean(alienId,name,mobno));
				
				search = true;
					}
				}
				if(!search) {
					logger.info("record not found");
				}else {
					logger.info("upodate successfully");
				}

				break;
				

			default:
				break;
			}

		} while (ch != 0);
	}
}