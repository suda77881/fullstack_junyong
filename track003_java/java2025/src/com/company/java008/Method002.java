package com.company.java008;

public class Method002 {
	//(1) 마법상자 정의
	// public static 리턴값 메서드명(파라미터){ 	}
	public    static void myint(int a) {System.out.println(a);}
	
	public static void ten(int money) {System.out.println(money*10);}
	
	public static void add(int money, int btn) {System.out.println(money + btn);}
	
	/////////////////////////////////////////
	public static void main(String[] args) {
		//(2) 사용
		//public static void myint (int a) {System.out.println(a);}
							 myint(1);
							 myint(2);
        //public static void ten(int money) {System.out.println( money*10 );}	
							 ten(1); // int money=1;
		//public static void add(int money, int btn) {System.out.println(money + btn);}
							 add(100	, 20	);	//	int money=100, int btn = 20;
							 add(200	, 30	);	//	int money=200, int btn = 30;
							 
	}
	/////////////////////////////////////////
}
