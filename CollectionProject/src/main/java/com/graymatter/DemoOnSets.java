package com.graymatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class DemoOnSets {

	public static void main(String[] args) {

		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(45);
		hs.add(34);
		hs.add(73);
		hs.add(18);
		hs.add(45); // duplicate values are not allowed
		
		System.out.println(hs);
		
		hs.add(null); 
		hs.add(null);
		hs.add(null);
		System.out.println(hs); // It will take only 1 null value
		
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		HashSet<Integer> hs1 = (HashSet<Integer>) hs.clone();
		
		System.out.println(hs1);
	
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(45);
		lhs.add(34);
		lhs.add(73);
		lhs.add(18);
		lhs.add(45); 
		
		System.out.println(lhs);
		
		lhs.add(null); 
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		
			
		Iterator<Integer> litr = lhs.iterator();

		while(litr.hasNext())
			System.out.println(litr.next());
		
		HashSet<Integer> lhs1 = (LinkedHashSet<Integer>) lhs.clone();
		
		System.out.println(lhs1);
		
		System.out.println(hs);
		
		System.out.println("\n\nConverting a Set to an Array: ");
		Object arr[] = hs.toArray();
		System.out.println(arr[2]);
		
		
		System.out.println("\n\nConverting an Array to a List: ");
		List<Object> list = Arrays.asList(arr);
		System.out.println(list);

		System.out.println("_____________________________________________\n");
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(23);
		ts.add(92);
		ts.add(68);
		ts.add(21);
		
		System.out.println(ts);
		
		Iterator<Integer> itr1 = ts.descendingIterator();
		while(itr1.hasNext())
			System.out.println(itr1.next()); // This way, the elements will be in descending order

		Employee e1 = new Employee("Divyanshu", 123, 50000, "Delhi");
		Employee e2 = new Employee("Aman", 234, 40000, "Hyderabad");
		Employee e3 = new Employee("Raj", 345, 55000, "Hyderabad");
		Employee e4 = new Employee("Kirti", 456, 42000, "Delhi");
		Employee e5= new Employee("Sarah", 567, 51000, "Delhi");
		Employee e6= new Employee("Uday", 678, 35000, "Hyderabad");
		Employee e7= new Employee("Divyanshu", 123, 53000, "Delhi");
		Employee e8= new Employee("Divyanshu", 123, 55000, "Delhi");
		
		TreeSet<Employee> empTree = new TreeSet<Employee>();
		empTree.add(e1);
		empTree.add(e2);
		empTree.add(e3);
		empTree.add(e4);
		empTree.add(e5);
		empTree.add(e6);
		empTree.add(e7);
		empTree.add(e8);
		
		System.out.println(empTree);
		
		for(Employee emp:empTree)
			System.out.println(emp);
		
		
		System.out.println(ts);
		System.out.println(ts.ceiling(20)); // It gives the nearest element in the Set
		System.out.println(ts.floor(70));
		
		ts.add(56);
		ts.add(43);
		ts.add(12);
		
		System.out.println(ts.headSet(57));
		System.out.println(ts.tailSet(57));
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		
	}

}
