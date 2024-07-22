package com.graymatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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

		System.out.println("________________________________________________________________\n");
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(23);
		ts.add(92);
		ts.add(68);
		ts.add(21);
		
		System.out.println(ts);
		
		Iterator<Integer> itr1 = ts.descendingIterator();
		while(itr1.hasNext())
			System.out.println(itr1.next()); // This way, the elements will be in descending order

		
		//Tree set will not do modifications when it encounters same element
		
		System.out.println("\n\n_________________________________________________________________\n");
		
		
		Set<Employee> lhsEmp = new LinkedHashSet<>();
		
		Employee e1 = new Employee("Divyanshu", 123, 50000, "Delhi");
		Employee e2 = new Employee("Aman", 234, 40000, "Hyderabad");
		Employee e3 = new Employee("Raj", 345, 55000, "Hyderabad");
		Employee e4 = new Employee("Kirti", 456, 42000, "Delhi");
		Employee e5= new Employee("Sarah", 567, 51000, "Delhi");
		Employee e6= new Employee("Uday", 678, 35000, "Hyderabad");
		Employee e7= new Employee("Divyanshu", 123, 53000, "Delhi");
		Employee e8= new Employee("Divyanshu", 123, 55000, "Delhi");
		
		lhsEmp.add(e1);
		lhsEmp.add(e2);
		lhsEmp.add(e3);
		lhsEmp.add(e4);
		lhsEmp.add(e5);
		lhsEmp.add(e6);
		lhsEmp.add(e7);
		lhsEmp.add(e8);
		
		for (Employee emp : lhsEmp) {
            System.out.println(emp);
            
        System.out.println(lhsEmp.contains(e1));
        
            
            
            
        }
			
	}

}
