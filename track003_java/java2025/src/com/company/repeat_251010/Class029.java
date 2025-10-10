package com.company.repeat_251010;

/*		초기화순서			기본값	명시적초기화	초기화블록		생성자
 * 당장바로사용가능!
1) [static]	su			0		10			x 여전히 10	관련없지만 static 사용가능 일단 여전히 10			
2) [static] basicpay2	0		x 여전히 0 	20000		관련없지만 static 사용가능 일단 여전히 20000
____________________________________________________________________________________________
 * new 객체만들때 생성-장난감만들때 필요시 생성
 * 장난감마다 각각 생성된 장난감 위치 번지 생김 this
3) pay					0		10000		x여전히 10000  변경가능 여전히 10000
*/


class Sawon005{
	// (1) 인스턴스변수 - heap, new 0, 실체화, this 각각, 생성자 [2. new해서 객체만들어서 사용]
	int pay=10000;	
	// (2) 클래스변수 - method area , new X , [1. 지금당장 바로사용가능]
	// ★ static에서는 instance 사용불가
	static int su =10;	// 명시적 초기화
//	static int basicpay=pay; ////###000 basicpay 메모리상에 올라가 있음. pay는 new해서 사용해야함.
	static int basicpay2;
	static {basicpay2=20000;}	//	초기화블록
	
	//(3) 클래스메서드 - method , new X , [1. 바로사용가능]
	public static void showSu() {System.out.println(su);} ///###001
	
	
//	public static void showPay() {System.out.println(this.pay);} ///###001 클래스 메서드 안에서 인스턴스 변수 및 this 사용불가
	//(4) 인스턴스메서드 - heap, new O, 실체화, this 각각, 생성자 [2. new해서 객체만들어서 사용]
	public void showAll001() { //// ####003
		System.out.println(su);	//	클래스변수 사용가능
		System.out.println(this.pay);	//	인스턴스 변수 사용가능
		
	}
	//(5) 클래스메서드 - method , new x, [1. 바로사용가능]
	public static void showAll002() {
		
		
	}
}
//(5) 클래스메서드 - method , new X , [1. 바로사용가능]
public class Class029 {
	public static void main(String[] args) {
		
		Sawon005 sola = new Sawon005();
		sola.showAll001();
		
		Sawon005.showAll002();
	}// end main
}// end class
