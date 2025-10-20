package com.company.repeat;
import java.util.Scanner;
public class Repeat011 {

	
	public static void main(String[] args) {
		
		int num1, num2 ;	String result;
		char op = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요."); num1 = sc.nextInt(); 
		System.out.println("정수를 하나 입력해주세요."); num2 = sc.nextInt();
		System.out.println("연산자를 입력해주세요(+,-,*,/)"); op = sc.next().charAt(0);
		
		result = "" + num1 + op + num2 + "=" ;
		
//		System.out.println(result);
		
		if (op == '+') {result += num1 + num2;}
		else if (op == '-') {result += num1 - num2;}
		else if (op == '*') {result += num1 * num2;}
		else if (op == '/') {result += String.format("%-2.f" , num1 / num2);}
		
		System.out.println(result);
		
	}
}
