package com.graymatter;

import java.util.Date;
import java.util.List;

public class Order {

    private int orderId;
    private Date orderDate;
    private List<Item> itemList;

    public Order(int orderId, Date orderDate, List<Item> itemList) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.itemList = itemList;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", itemList=" + itemList + "]";
    }

    public double calculateTotalOrderCost() {
        double totalCost = 0.0;
        for (Item item : itemList) {
            totalCost += item.getPrice() * item.getNou();
        }
        return totalCost;
    }

    public static Order findMaximumOrder(List<Order> orders) {
        Order maxOrder = null;
        double maxCost = Double.MIN_VALUE;
        for (Order order : orders) {
            double orderCost = order.calculateTotalOrderCost();
            if (orderCost > maxCost) {
                maxCost = orderCost;
                maxOrder = order;
            }
        }
        return maxOrder;
    }
}
