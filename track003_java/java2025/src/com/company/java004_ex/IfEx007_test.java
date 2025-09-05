package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007_test {
	
	public static void main(String[] args) {
		
		int num1, num2; 
		
		String result;
		
		char op ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1를 하나 입력해주세요"); num1 = sc.nextInt();
		System.out.println("정수2를 하나 입력해주세요"); num2 = sc.nextInt();
		
		System.out.println("연산자를 하나 입력해주세요"); op = sc.next().charAt(0);
		
		
		
		result = "" + num1 + op + num2 + "="; //
		if (op == '+')		{	result += (num1+num2);	}
		else if (op == '-') {	result += (num1-num2);	}
		else if (op == '*') {	result += (num1*num2);	}
		else if (op == '/') {	result += String.format("%.2f" , (double)num1/num2);	}
		
		//출력
		
		System.out.println(result);
		
		
		
		
		
	}
	

}
