package com.company.test;

public class Apple {
	
	String order;
	String name;
	int num;
	int price;
	public Apple(String order, String name, int num, int price) 
	{ super(); this.order = order; this.name = name; this.num = num; this.price = price; }
	
	@Override public String toString() { return "Apple [order=" + order + ", name=" + name + ", num=" + num + ", price=" + price + "]"; }

	
	

}
