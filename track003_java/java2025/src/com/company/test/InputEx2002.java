package com.company.test;
import java.util.Scanner;
public class InputEx2002 {

	public static void main(String[] args) {
		int kor, eng, mat, total;
		double avg;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오"); kor = scanner.nextInt();
		System.out.println("영어점수를 입력하시오"); eng = scanner.nextInt();
		System.out.println("수학점수를 입력하시오"); mat = scanner.nextInt();
		
		total = kor + eng + mat;
		
		avg = (double)total / 3 ;
		
		System.out.print("총점 : " + total + "평균 : " + avg);
	}
}
