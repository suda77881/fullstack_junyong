package com.company.repeat_251010;

//1. 클래스는 부품객체
//2.
class Coffee010{
	
	String name = "";
	int num = 0;
	int price = 0;
	
	
	Coffee010(String name, int num, int price) { super(); this.name = name; this.num = num; this.price = price; }
	Coffee010(){this.name = "아메리카노"; this.num = 1; this.price = 2000;	}
	
	void show() {
		
		System.out.println("=====커피\n커피명 : " + name + "\n커피잔수 : " + num + "\n커피가격 : " + price);
	}
	
}	//	 class end

public class Coffee011 {

	public static void main(String[] args) {
		
		Coffee010 c1 = new Coffee010("까페라떼", 2, 4000);
		c1.show();
		Coffee010 c2 = new Coffee010();
		c2.show();
		
		
	}

}
/*	초기화순서
 1. 기본값	{name= "null"	,	num=0, price=0	/	show()}
 2. 명시적	{name= "null"	,	num=0, price=0	/	show()}
 3. 초기화블록	{name= "null"	,	num=0, price=0	/	show()}
 4. 생성자	{name= "아메"	    ,	num=1, price=2000	/	show()}
 */
/************** 
Repeat001_oop.java
Repeat001_oop.class Coffee.class
[method : 정보보관]
[1번지]	public Repeat001_oop.class ★
[2번지]	Coffee.class	(	설계도	)
------------------------------------------------------------
[heap:동적]                             				|    [stack:지역]
													←	a2(2000번지).show() @33번째줄
2000번지 																		(a1 실제로 만든 장난감, 객체, 인스턴스)
{name="아메리카노", num=1, price=2000} / show()}		←	a2(2000번지) @31번째줄

													←	a1(1000번지).show() @30번째줄	(a1 실제로 만든 장난감, 객체, 인스턴스)
1000번지 
{name="카페라떼", num=2, price=4000} / show()}			←	a1(1000번지) @28번째줄	(a1 실제로 만든 장난감, 객체, 인스턴스)
 														a1(null)    @27번쨰줄
 									   				|	main 	★
------------------------------------------------------------
*/


