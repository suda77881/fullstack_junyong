package com.company.repeat;

class Coffee012 {
	
	String name;
	int num;
	int price;
	
	public Coffee012(String name, int num, int price) 
	{ super(); this.name = name; this.num = num; this.price = price; }

	

	





	public void Coffe012() {
		
		name = "아케리카노"; num = 1; price = 2000;
		
	}
	
	void show () {
		
		System.out.println("=====커피");
		System.out.println("커피명 : " + name);
	}
}


public class repeat_25101010101 {
	
	public static void main(String[] args) {
		
		Coffee012 a1 = new Coffee012 ("까페라떼", 2, 4000);
		a1.show();
		Coffee012 a2 = new Coffee012 ();
		a2.show();
	}

}
