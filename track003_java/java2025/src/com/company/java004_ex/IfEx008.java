package com.company.java004_ex;

import java.util.Scanner;



public class IfEx008 {
	
	public static void main(String[] args) {
		
		String number;
		int kor, eng, mat, total;
		double avg;
		String level = " ", pass = " ", str = " ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번입력"); number = sc.next();	// 학번
		System.out.println("국어점수 입력>"); kor = sc.nextInt();	// 국어
		System.out.println("국어점수 입력>"); eng = sc.nextInt();	// 영어
		System.out.println("국어점수 입력>"); mat = sc.nextInt();	// 수학
		
		total = kor + eng + mat;	//	총점
		avg = (double)total / 3;	//	평균
		
		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40 ) 
		   {pass  = "합격";}	// 합격여부
		
		else {pass = "불합격";}	
		
		if (avg >= 90) {level  = "수";}	// 레벨
		else if	(avg >= 80) {level  = "우";}
		else if	(avg >= 70) {level  = "미";}
		else if	(avg >= 60) {level  = "양";}
		else if	(avg <= 59) {level  = "가";}
		
		
		if (avg >= 95) {str = "장학생"; }	//	장학생여부
		else {str = "X";}
		
		System.out.println("=========================================="
						+ "========================================="); 
		System.out.println("학번 국어 영어 수학 총점 평균 합격여부 레벨 장학생");
		System.out.println("=========================================="
						+ "=========================================");
		System.out.printf("%s %d %d %d %d %.2f %s %s %s"
						   ,number,kor,eng,mat,total,avg, pass, level, str);
		
		
		
	}

}
