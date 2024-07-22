package com.graymatter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Divyanshu");
		map.put(14, "Aman");
		map.put(28, "Ritu");
		map.put(17, "Harsh");
		
		
		System.out.println(map);
		
		System.out.println(map.get(11));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		map.put(13, null);
		map.put(null, "Hello");
		System.out.println(map);
		System.out.println(map.get(null));
		
		Set<Entry<Integer, String>> entSet = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entSet.iterator();
		
		System.out.println("\n\nEntry Set: ");
		while(itr.hasNext())
			System.out.println(itr.next());
		
//		Address add = new Address("Hyd", "Telangana");
		Employee e1 = new Employee("Divyanshu", 123, 50000, "Delhi");
		Employee e2 = new Employee("Aman", 234, 40000, "Hyderabad");
		Employee e3 = new Employee("Raj", 345, 55000, "Hyderabad");
		Employee e4 = new Employee("Kirti", 456, 42000, "Delhi");
		Employee e5= new Employee("Sarah", 567, 51000, "Delhi");
		Employee e6= new Employee("Uday", 678, 35000, "Hyderabad");
		Employee e7= new Employee("Divyanshu", 123, 53000, "Delhi");
		Employee e8= new Employee("Divyanshu", 123, 55000, "Delhi");
		
		
		TreeMap<Integer, Employee> treeMap = new TreeMap<Integer, Employee>();
		
		treeMap.put(1, e1);
		treeMap.put(2, e2);
		treeMap.put(3, e3);
		treeMap.put(4, e4);
		treeMap.put(5, e5);
		treeMap.put(6, e6);
		treeMap.put(7, e7);
		treeMap.put(8, e8);
		
		System.out.println(treeMap);
		
		System.out.println("________________________________\n");
		
		for(Entry<Integer, Employee> e : treeMap.entrySet())
			System.out.println(e);
		
		TreeMap<Employee, Address> myMap = new TreeMap<Employee, Address>();
		
		Address add = new Address("Hyd", "Telangana");
		myMap.put(e1, add);
		myMap.put(e2, add);
		
		System.out.println(myMap);
			
		
		
		
	}

}
