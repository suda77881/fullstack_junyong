package com.company.java002_ex;

import java.util.Scanner;

public class InputEx2002 {

	public static void main(String[] args) {
		//변수
		//
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("당신의 국어점수를 입력하세요>");
		int korean = scanner.nextInt();
		System.out.print("당신의 영어점수를 입력하세요>");
		int english = scanner.nextInt();
		System.out.print("당신의 수학점수를 입력하세요>");
		int math = scanner.nextInt();
		
		// 처리
		int result = (korean + english + math);
		avg = result / 3.0; 	//정수 = 정수/정수 → 실수 = 정수/실수
		// 출력
		System.out.print("총점 : " +result+ "\n평균 :" +avg );
		
	}

}
