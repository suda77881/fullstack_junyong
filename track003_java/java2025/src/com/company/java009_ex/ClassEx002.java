package com.company.java009_ex;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수) 그렇기 떄문에 스캐너를 다른데 두어야한다?

import java.util.Scanner;
class MyPrice001{
	// 멤버 변수 :
	String name; int price;
	// 멤버 함수 : void input() 입력받는 기능 / void show() 출력을 해주는 기능
	void input() {
		Scanner sc = new Scanner(System.in);   /// 이 위치에 두어보자
		// 상품이름 입력 > apple
		// 상품가격 입력 > 1500
		System.out.print("상품이름 입력 > "); this.name = sc.next();
		System.out.print("상품가격 입력 > "); this.price = sc.nextInt();
	}
	void show () {
		// 상품정보입니다.
		// 상품이름 : apple / 상품가격 : 1500
		System.out.println("\n\n상품정보입니다.");
		System.out.printf("상품이름 : %s / 상품가격 : %d", this.name, this.price);
	}
}
///////////////////////////////////////////////////////////////////
public class ClassEx002{
	   public static void main(String[] args) {
	        MyPrice001   p1 = new MyPrice001();
	        p1.input();
	        p1.show();
	   }
	}
////////////////////////////////////////////////////////////////////
/* ■ myPrice001 p1 = new MyPrice001();
 ----------------------[runtime data area]
 [method : 정보, static, final : 공용정보]
 Myprice001.class , 	ClassEx002.class	클래스( 설계도)
 ----------------------------------------	객체 (p1) 인스턴스 (p1.name="apple" /p1.price=1500)
 [heap: 동적]				   		| [stack : 잠깐빌리기]
 									   		p1.show(){    }
 1번지								   		p1.input(){   }
 { name=null, price=0, input(), show()} ←   p1 [1번지]
 
 								| main
 ---------------------------------------
 */

