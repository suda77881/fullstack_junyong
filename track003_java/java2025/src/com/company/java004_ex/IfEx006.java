package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	
	public static void main(String[] args) {
		
		int num;
		
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요"); num = sc.nextInt();
		
		// ver - 1
//		if (num%2==0) {System.out.println("당신의 성별은 여자입니다.");}
//		else {System.out.println("당신의 성별은 남자입니다.");}
		
		result = num%2 == 0? "여자" : "남자";
		
		System.out.println(result);
	}

}
