package com.graymatter;

import java.util.Stack;

public class DemoOnStack {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		System.out.println(st.capacity());
		
		st.push(10);
		st.push(70);
		st.push(30);
		st.push(55);
		st.push(65);
		
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		
		System.out.println(st.capacity());
		
		st.trimToSize();
		System.out.println(st.capacity());

		st.push(45);
		System.out.println(st.capacity());
		
	}

}
