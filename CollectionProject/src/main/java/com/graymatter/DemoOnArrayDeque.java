package com.graymatter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;

public class DemoOnArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Customer> customerDeque = new ArrayDeque<>();

        Customer customer1 = new Customer(101, "Divyanshu", 21);
        Customer customer2 = new Customer(102, "Aman", 16);
        Customer customer3 = new Customer(103, "Shweta", 40);
        Customer customer4 = new Customer(104, "Sarah", 22);
        Customer customer5 = new Customer(105, "Harsh", 32);
        Customer customer6 = new Customer(106, "Yash", 26);

        customerDeque.add(customer1);
        customerDeque.add(customer2);
        customerDeque.add(customer3);
        customerDeque.add(customer4);
        customerDeque.add(customer5);
        customerDeque.add(customer6);

        System.out.println("Customers in ArrayDeque:");
        for (Customer customer : customerDeque) {
            System.out.println(customer);
        }

//		To remove
        System.out.println("\n\nRemoving: ");
        customerDeque.remove(customer2);
        System.out.println(customerDeque);

 //		Contains function
        
        System.out.println(customerDeque.contains(customer1));

        System.out.println("\nSorting customers by ID: ");
        for (Customer customer : customerDeque) {
            System.out.println(customer);
        }
        
        ArrayList<Customer> customerList = new ArrayList<>(customerDeque);

        // Sort ArrayList using a Comparator
        customerList.sort(Comparator.comparing(Customer::getCustomerName));

        // Print sorted customers
        System.out.println("\nSorting customers by name:");
        for (Customer customer : customerList) {
            System.out.println(customer);
        
        }
    }
}
