package com.graymatter;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoOnItems {

	public static void main(String[] args) {

		LinkedList <Item> itemList = new LinkedList <Item>();
		Item i1 = new Item("Laptop", 120, 56000, "Dell");
		Item i2 = new Item("Mouse", 230, 1000, "Dell");
		Item i3 = new Item("Keyboard", 350, 1500, "HP");
		Item i4 = new Item("Keyboard", 400, 1800, "Lenovo");
		Item i5= new Item("Monitor", 500, 12000, "HP");
		Item i6= new Item("CPU", 250, 28000, "Lenovo");
		Item i7= new Item("Laptop", 120, 53000, "HP");
		Item i8= new Item("Mouse", 150, 1900, "Dell");
	
		itemList.add(i1);
		itemList.add(i2);
		itemList.add(i3);
		itemList.add(i4);
		itemList.add(i5);
		itemList.add(i6);
		itemList.add(i7);
		itemList.add(i8);
		
		System.out.println("\n\nSorting on basis of Item name: ");
		
		itemList.sort(new ItemNameComparator());
		for(Item i :itemList)
			System.out.println(i);
		

		System.out.println("\nSorting on basis of Brands and then items: ");
		
		itemList.sort(new BrandComparator()
				.thenComparing(new BrandComparator()));
		for(Item i: itemList)
			System.out.println(i);
		
		
	
	}

}
