package com.company.java003;

import java.util.Scanner;

public class Repeat007 {
	public static void main(String[] args) {
		
		int kor, eng, mat, total;
		double avg;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오");
		kor = scanner.nextInt();
		System.out.println("영어점수를 입력하시오");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력하시오");
		mat = scanner.nextInt();
		
//		System.out.println("국어점수를 입력하시오");
//		kor = scanner.nextInt();
//		System.out.println("영어점수를 입력하시오");
//		eng = kor+ scanner.nextInt();
//		System.out.println("수학점수를 입력하시오");
//		mat = eng+ scanner.nextInt();
		
		total = kor + eng + mat;
		
//		double var = 3.0;
		
		avg = total / 3.0;
		
		System.out.print("총점 : "+total+"\n평균 : "+avg);

	}

}
