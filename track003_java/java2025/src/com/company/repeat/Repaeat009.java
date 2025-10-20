package com.company.repeat;

import java.util.Scanner;

public class Repaeat009 {

	public static void main(String[] args) {
		
		int num1, num2;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력1_"); num1 = sc.nextInt();
		System.out.println("숫자입력2_"); num2 = sc.nextInt();
		
		result = (double)num1 / num2;
		
		System.out.printf("%d / %d = %.2f", num1, num2, result);
		
	}
}
