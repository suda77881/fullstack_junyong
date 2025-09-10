package com.company.java005_ex;

public class RepeatEx10_2 {

	public static void main(String[] args) {

//		for, while, do whjle 3가지 버전으로
//		ABCD
//		FGHIJ
//		KLMNO
//		PQRST
//		UVWXY
//		Z
		
		//ver-1 눈에 보이는그대로
		
//		System.out.println();
//		System.out.print('A');System.out.print('B');System.out.print('C');System.out.print('D');
		System.out.println("java-ver");
		for(char i='A'; i<='Z'; i++){ if(i%5==0) {System.out.println();} 	System.out.print(i);}
		// 이게되네
		
		System.out.println("while-ver");	//	변수선언 while 앞으로 뺴주고 증감문 마침 중괄호 앞에 위치시키고;
		char i='A'; while(i<='Z'){ if(i%5==0) {System.out.println();} 	System.out.print(i); i++;}
		
		System.out.println("do-while-ver");	//	위치만 재조합 while위치에 do 넣고 while은 마침 중괄호 뒤로 붙이고 세미콜론
		i='A'; do{ if(i%5==0) {System.out.println();} 	System.out.print(i); i++;}while(i<='Z');
	}

}
