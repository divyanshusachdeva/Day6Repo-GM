package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoOnArrayList {

	public static void main(String[] args) throws CloneNotSupportedException {

		ArrayList <Employee> empList = new ArrayList <Employee>();
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

		
		
		System.out.println("With to String: ");
		System.out.println(empList);
		
		System.out.println("\nUsing enhanced for loop: ");
		for(Employee emp:empList)
			System.out.println(emp);
		
		System.out.println("\nUsing iterator: ");
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
			
		System.out.println("\n\nSort operation: ");
		
//		Collections.sort(empList);
//		for(Employee emp:empList)
//			System.out.println(emp);
		
		
		System.out.println("\n\nSorting on basis of Cities: ");
		
		empList.sort(new CityComparator());
		for(Employee emp:empList)
			System.out.println(emp);
	
		
		System.out.println("\nSorting on basis of Cities and then salaries: ");
		
		empList.sort(new CityComparator()
				.thenComparing(new SalaryComparator()));
		for(Employee emp:empList)
			System.out.println(emp);
		
		
		System.out.println("\nSorting on basis of Cities and then names and then salaries: ");
		
		empList.sort(new CityComparator()
				.thenComparing(new NameComparator()
						.thenComparing(new SalaryComparator())));
		for(Employee emp:empList)
			System.out.println(emp);
		
		
		Employee employee = new Employee();
		Employee emp1 = (Employee) employee.clone();
		System.out.println(emp1.hashCode() + " " + employee.hashCode());
	}

}
