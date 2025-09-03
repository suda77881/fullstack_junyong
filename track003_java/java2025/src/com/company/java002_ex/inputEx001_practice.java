package com.company.java002_ex;

import java.util.Scanner;

public class inputEx001_practice {

	public static void main(String[] args) {
		
		int korean;
		int english;
		int math;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 국어 점수를 입력하세요>");
		korean = scanner.nextInt();
		System.out.println("당신의 영어 점수를 입력하세요>");
		english = scanner.nextInt();
		System.out.println("당신의 수학 점수를 입력하세요>");
		math = scanner.nextInt();
		
		int result; 
		int result2;
		
		result = korean + english + math;
		result2 = result / 3;
		
		System.out.println("합산 : " + result + "\n평균 : " + result2);
		
	}
}
