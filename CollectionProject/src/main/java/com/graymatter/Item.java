package com.graymatter;

public class Item implements Comparable {

	private String itemName;
	private int nou;
	private int price;
	private String brand;
	
	public Item() {
		super();
	}

	public Item(String itemName, int nou, int price, String brand) {
		super();
		this.itemName = itemName;
		this.nou = nou;
		this.price = price;
		this.brand = brand;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getNou() {
		return nou;
	}

	public void setNou(int nou) {
		this.nou = nou;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", nou=" + nou + ", price=" + price + ", brand=" + brand + "]";
	}

	@Override
	public int compareTo(Object o) {

		
		
		return 0;
	}
	
	
	
	
}



