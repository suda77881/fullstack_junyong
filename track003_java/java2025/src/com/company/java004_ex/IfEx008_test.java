package com.company.java004_ex;

import java.util.Scanner;



public class IfEx008_test {
	
	public static void main(String[] args) {
		
		String number;
		int kor, eng, mat, total;
		double avg;
		String level = "가", pass = "불합격", jang = "-";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번 입력>"); number = sc.next();	// 학번
		System.out.println("국어점수 입력>"); kor = sc.nextInt();	// 국어
		System.out.println("국어점수 입력>"); eng = sc.nextInt();	// 영어
		System.out.println("국어점수 입력>"); mat = sc.nextInt();	// 수학
		
		//처리
		
//		1. 총점 구하기
		total = kor + eng + mat;
		//	2. 평균 구하기
		avg = total / 3.0;
		
		if (avg>=60 && kor>= 40 && eng>=40 && mat>=40) {pass="합격";}
		if (avg>=95 ) {jang = "장학생";}
		if (avg>=90) {level="수";}
		else if (avg>=80) {level="우";}
		else if (avg>=70) {level="미";}
		else if (avg>=60) {level="양";}
		
		// 출력
		System.out.println("===================================================================");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s"
						, "학번", "국어", "영어", "수학", "총점", "합격여부", "레벨", "장학생");
		System.out.println("===================================================================");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s"
						, number, kor, eng, mat, total, pass, level, jang);
		
		
		
				
		
		
	}

}
