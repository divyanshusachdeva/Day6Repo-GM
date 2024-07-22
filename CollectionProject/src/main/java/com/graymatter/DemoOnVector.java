package com.graymatter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {
	
	public static void main(String[] args) {

		Vector<Integer> vector= new Vector<Integer>();
		
		System.out.println(vector.capacity());
		for (int i =0; i<=10; i++)
			vector.add(i);
		
		System.out.println(vector.capacity()); // the initial size of vector is 10
		
		vector.add(11);
		System.out.println(vector.capacity()); // after the capacity is exhausted, the capacity becomes double
		
		
		Enumeration<Integer> myEnum = vector.elements();
		while(myEnum.hasMoreElements()) {
			int i =myEnum.nextElement();
			System.out.println(i);
		}
		
		Iterator<Integer> itr = vector.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			if (i==6)
				itr.remove();
			System.out.println(i);
		}
		
		System.out.println(vector);
		
		System.out.println(vector.contains(3));
		
		vector.addFirst(6);
		vector.add(5);
		System.out.println(vector);

		System.out.println(vector.elementAt(5));

		
	
	}

}
