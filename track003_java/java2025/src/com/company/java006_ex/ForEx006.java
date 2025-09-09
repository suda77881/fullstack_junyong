package com.company.java006_ex;
import java.util.Scanner;
public class ForEx006 {

		public static void main(String[] args) {
			
			int num1, num2 = 0, result2 = 0 ; double result = 0;
			
			char op = ' ';  double str = 0.0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. 정수를 하나 입력해주세요 >"); num1 = sc.nextInt();
			
			
			for(;;) { 
//				if (!(num1 >=0 && num1 <= 100 )) {} 아니면
				
				System.out.println("1. 정수를 하나 입력해주세요 >"); num1 = sc.nextInt();
				

					if (num1 > 100 || num1 < 0) {continue;}
					else if (num1 <= 100 || num1 >= 0) {break;}
//					if (num1 >= 0 && num1 <= 100) {break;} // 축약가능

			}
			
//			if (num1 > 100 || num1 < 0) {for (;;) {System.out.println();}}
			
			System.out.println("2. 정수를 하나 입력해주세요 >");	num2 = sc.nextInt();
			
			for(;;) {
				
				System.out.println("2. 정수를 하나 입력해주세요 >"); num2 = sc.nextInt();
				

					if (num2 > 100 || num2 < 0) {continue;} 
					else if (num2 <= 100 || num2 >= 0) {break;} 
//					if (num1 >= 0 && num1 <= 100) {break;} // 축약가능

			}
			
//			if (num2 > 100 || num2 < 0) {for (;;) {System.out.println();}}
			
//			System.out.println("3. 연산자를 입력해주세요 (+,-,*,/) >");	op = sc.next().charAt(0);
			
			for(;;) {
				System.out.println("3. 연산자를 입력해주세요 (+,-,*,/) >");	op = sc.next().charAt(0);
					if (op == '+' || op == '-' || op == '*' || op == '/') {break;} 
					else {continue;} 
				}
			
			switch (op) {
			
			case '+' : {result2 = num1 + num2;}break;
			case '-' : {result2 = num1 - num2;}break;
			case '*' : {result2 = num1 * num2;}break;
			case '/' : {result2 = num1 / num2;}break;
			
//			default : {for (;;) {System.out.println();}}
			
			}
			
//			if (op == '+' || op == '-' || op == '*' || op == '/' ) {} 
//			else {for (;;) {System.out.println();}}
//			
//			if (op == '+') {result2 = num1 + num2;}
//			else if (op == '-') {result2 = num1 - num2;}
//			else if (op == '*') {result2 = num1 * num2;}
//			else if (op == '/') {result2 = num1 / num2;

//			System.out.println(String.format(%.2f,str));
				
			System.out.printf("%d %s %d = %d", num1, op, num2, result2);
			System.out.println("" + num1 + op + num2 + "=" + 
								(op!='/'? "" +(int)result : String.format("%.2f", result)));
		}
}
