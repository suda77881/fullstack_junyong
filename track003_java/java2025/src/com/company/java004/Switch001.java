package com.company.java004;

import java.util.Scanner;

public class Switch001 {
	public static void main(String[] args) {
		// 변수
		int a=0;
		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.print("숫자 한개 입력 >");
		a = sc.nextInt();
		// 처리+출력 (1) if
			 if(a == 1) {System.out.println("1이다");}	//	else 부분 안봄
		else if(a == 2) {System.out.println("2이다");}
		else if(a == 3) {System.out.println("3이다");}
			 
	    System.out.println();	 
		// 처리+출력 (2) switch case break (처리대상 1,2,3)
			 switch(a) { // 처리대상
			 case 1 : System.out.println("1이다"); /* a==1 */ break;
			 case 2 : System.out.println("2이다"); /* a==2 */ break;
			 case 3 : System.out.println("3이다"); /* a==3 */ break;
		}
			 
		// 출력
		
	}

}
