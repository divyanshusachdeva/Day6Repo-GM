package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {

		LinkedList<String> fruitList = new LinkedList<String>();
		
		fruitList.add("Apple");
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Orange");
		fruitList.add("Litchi");
		
		System.out.println(fruitList);
		
		fruitList.addFirst("Grapes");
		fruitList.addLast("Guava");
		
		System.out.println(fruitList);
		
//		fruitList.add(null); // Linkedlist can take null values
		
		System.out.println(fruitList);

		
		System.out.println("\nUsing iterator: ");

		Iterator<String> itr = fruitList.listIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println("\nSorting: ");
		
		Collections.sort(fruitList);
		System.out.println(fruitList);
		
		System.out.println(fruitList.contains("Apple"));
		
		System.out.println("\nClone: ");
		
		LinkedList<String> myFruits = (LinkedList<String>) fruitList.clone();
		System.out.println(myFruits);
		System.out.println(fruitList.hashCode());
		System.out.println(myFruits.hashCode());
		
		myFruits.add("Pineapple");
		System.out.println(myFruits);
		System.out.println(fruitList.hashCode());
		System.out.println(myFruits.hashCode());

		fruitList.add("Pineapple");
		System.out.println(fruitList.hashCode());
		System.out.println(myFruits.hashCode());
		
		
		
		LinkedList <Employee> empList = new LinkedList <Employee>();
		Employee e1 = new Employee("Divyanshu", 123, 50000, "Delhi");
		Employee e2 = new Employee("Aman", 234, 40000, "Hyderabad");
		Employee e3 = new Employee("Raj", 345, 55000, "Hyderabad");
		Employee e4 = new Employee("Kirti", 456, 42000, "Delhi");
		Employee e5= new Employee("Sarah", 567, 51000, "Delhi");
		Employee e6= new Employee("Uday", 678, 35000, "Hyderabad");
		Employee e7= new Employee("Divyanshu", 123, 53000, "Delhi");
		Employee e8= new Employee("Divyanshu", 123, 55000, "Delhi");
	
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);

		LinkedList<Employee> myEmps = (LinkedList<Employee>) empList.clone();
		
		System.out.println(empList.hashCode());
		System.out.println(myEmps.hashCode());
		
		Employee e9 = new Employee ("Riya", 111, 28000, "Hyderabad");
		
		myEmps.add(e9);
		System.out.println(myEmps);
		
		
		
		
		
		
		
		
	}

}
