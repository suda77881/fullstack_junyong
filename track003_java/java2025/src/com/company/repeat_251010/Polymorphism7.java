package com.company.repeat_251010;

class Papa extends Object{
	int money = 10000;

	public Papa() { super();  }
	public void sing() {
			System.out.println("GOD - 거짓말");}
	} // end class

class Son extends Papa{
	int money = 1500;

	public Son() { super();  }

	@Override public void sing() { super.sing(); System.out.println("빅뱅 - 거짓말"); }

	public Son(int money) {
		super();
		money = this.money;
	}
	
}

public class Polymorphism7 {

	public static void main(String[] args) {
		
		Papa mypapa = new Son();
		System.out.println(((Son)mypapa).money);	// 1. 10000 , 2. 형변환
		mypapa.sing();
		
//		Son s = new Son(1500);
//		System.out.println(s.money);
		
	}// end main

}// end class
