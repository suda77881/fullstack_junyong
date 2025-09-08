package com.company.java004_ex;
import java.util.Scanner;
public class SwitchEx003 {

	public static void main(String[] args) {
		
		int num1, num2;
		char op;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 정수를 하나 입력해주세요. > "); num1 = sc.nextInt();
		System.out.println("2. 정수를 하나 입력해주세요. > "); num2 = sc.nextInt();
		System.out.println("3. 연산자를 입력해주세요 > "); op = sc.next().charAt(0);
		
		result = "" + num1 + op + num2 + "=" ;
		
		switch(op) {
		
		case '+' : result += num1 + num2; break;
		case '-' : result += num1 - num2; break;
		case '*' : result += num1 * num2; break;
		case '/' : result += String.format("%.2f", (double)num1 / num2); break;
		
		// case '+' : System.out.printf("%d %c %d = %d" , num1 , op, num2, num1+num2); break;
		// case '-' : System.out.printf("%d %c %d = %d" , num1 , op, num2, num1+num2); break;
		// case '*' : System.out.printf("%d %c %d = %d" , num1 , op, num2, num1+num2); break;
		// case '/' : System.out.printf("%d %c %d = %.2f" , num1 , op, num2, (double)num1+num2); break;
		
		}
		
		System.out.println(result);
	}
}
