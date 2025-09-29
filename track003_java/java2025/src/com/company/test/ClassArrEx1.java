package com.company.test;

public class ClassArrEx1 {

	public static void main(String[] args) {
//		Apple[] apples=new Apple[3];
//		
		Apple[] apples = new Apple[] {
				new Apple("RED", "iron", 2, 1000), new Apple("GREEN", "hulk", 1, 1500),
				new Apple("GOLD", "captain", 3, 2000)
				
		};
		
		for (Apple a : apples) {System.out.println(a);}
	}
}
