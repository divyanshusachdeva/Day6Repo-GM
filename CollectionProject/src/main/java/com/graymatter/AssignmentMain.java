package com.graymatter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssignmentMain {

    public static void main(String[] args) {
       
        Item item1 = new Item("Laptop", 120, 56000, "Dell");
		Item item2 = new Item("Mouse", 230, 1000, "Dell");
		Item item3 = new Item("Keyboard", 350, 1500, "HP");
		Item item4 = new Item("Keyboard", 400, 1800, "Lenovo");
		Item item5= new Item("Monitor", 500, 12000, "HP");
		Item item6= new Item("CPU", 250, 28000, "Lenovo");
		Item item7= new Item("Laptop", 120, 53000, "HP");
		Item item8= new Item("Mouse", 150, 1900, "Dell");

        List<Item> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        Order order1 = new Order(1, new Date(), items1);

        List<Item> items2 = new ArrayList<>();
        items2.add(item3);
        Order order2 = new Order(2, new Date(), items2);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        for (Order order : orders) {
            System.out.println("Order " + order.getOrderId() + " total cost: Rs." + order.calculateTotalOrderCost()); // this is for total cost
        }

        Order maxOrder = Order.findMaximumOrder(orders);
        if (maxOrder != null) {
            System.out.println("\nMaximum Order (Order ID " + maxOrder.getOrderId() + ") has the highest total cost of Rs." + maxOrder.calculateTotalOrderCost());
        }
    }
}
