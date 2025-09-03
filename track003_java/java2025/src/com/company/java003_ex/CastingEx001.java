package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	
	public static void main(String[] args) {
		
		int input1, input2;
		
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("숫자입력1>_입력받기"); input1 = sc.nextInt();
		System.out.print("숫자입력1>_입력받기"); input2 = sc.nextInt();
		
		//처리
		double result = (double)input1 / input2; 
		
		//출력
//		System.out.println(input1+ " / " + input2 + "=" +result);
		System.out.println(input1 + " / " + input2 + "=" + String.format("%.2f", result));
		System.out.printf("%d / %d=%.2f", input1, input2, result); 
		
		
	}

}
