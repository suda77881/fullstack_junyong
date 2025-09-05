package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	
	public static void main(String[] args) {
		
		int num1, num2, result=0;
		
		char a ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1를 하나 입력해주세요"); num1 = sc.nextInt();
		System.out.println("정수2를 하나 입력해주세요"); num2 = sc.nextInt();
		
		System.out.println("연산자를 하나 입력해주세요"); a = sc.next().charAt(0);
		
		
		//Q1
		
//		if (a == '+') {result = num1 + num2;
//							System.out.printf("%d %s %d = %d" ,num1,a,num2,result);}
//		else if (a == '-') {result = num1 - num2;
//							System.out.printf("%d %s %d = %d" ,num1,a,num2,result);}
//		else if (a == '/') {result = num1 / num2;}
//		else if (a == '/') {double result2 = (double)num1 / num2; 
//							System.out.printf("%d %s %d = %.2f" ,num1,a,num2,result2);}
//		else if (a == '*') {result = num1 * num2; 
//							System.out.printf("%d %s %d = %d" ,num1,a,num2,result);}
		
		
		//Q2
//		if (a == '/') {double result2 = (double)num1 / num2; 
//		System.out.printf("%d %s %d = %.2f" ,num1,a,num2,result2);}
//		else if (a == '+' || a == '-' || a == '*')
//		{result = num1 - num2; System.out.printf("%d %s %d = %d" ,num1,a,num2,result);}
		
		
		//SSi
//		if (a >= 0) {a == '/' ? double result2 = (double)num1 / num2;  
//		System.out.printf("%d %s %d = %.2f" ,num1,a,num2,result2); : a == '+'}
//		else if (a == '+' || a == '-' || a == '*')
//		{result = num1 - num2; System.out.printf("%d %s %d = %d" ,num1,a,num2,result);
		
		
	}
	

}
