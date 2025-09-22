package com.company.java009_ex;

class Coffee{
	
	String name; int price, num;

	
	public Coffee(String name, int price, int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}
	
	public Coffee() {
		this.name = "아메리카노";
		this.price = 1;
		this.num = 2000;
	}
	
	
	
	void show() {
		
		System.out.println("=====커피");
		System.out.println("커피명 : " + this.name);
		System.out.println("커피잔수 : " + this.num);
		System.out.println("커피가격 : " + this.price * this.num);
		
		
		
	}
	
	
	}	// class Coffee end 




public class ClassEx003 {
	   public static void main(String[] args) {
	   
	   Coffee a1 = new Coffee("까페라떼" ,2 , 4000);  a1.show();
	   Coffee a2 = new Coffee();  a2.show();

	  }
}
