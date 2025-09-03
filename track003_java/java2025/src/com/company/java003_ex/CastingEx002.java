package com.company.java003_ex;
import java.util.Scanner;
public class CastingEx002 {
	
	public static void main(String[] args) {
		
		// 변수
		// int num1, num2;
		// System(너의운영체제)
		// 입력
		// 처리
		// 출력
		//GIGO
		//변수
		int kor, eng, mat, level, total;
		double avg ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 입력>");	kor = scanner.nextInt();
		System.out.println("영어점수 입력>");	eng = scanner.nextInt();
		System.out.println("수학점수 입력>");	mat = scanner.nextInt();
		
		//처리
		total = kor + eng + mat;
		avg = (double)total / 3;	// 정수/실수 99.67 → 9.967 	→ 9 
		level =  (int)avg / 10;		// 		   		   99.67/10 → (int)9.967
		
		//출력
		//			%s 문자열 %d 정수 %.2f 실수
		System.out.print("국어 영어 수학 총점 평균 레벨 \n");
		System.out.printf("%d %d %d %d %.2f %d ",kor,eng,mat,total,avg,level);
		//				   %s 문자열	%d 정수	%.2f 실수
//		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n","국어", "영어", "수학", "총점", "평균", "레벨");
//		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n",100,100,99,299,99.67,9);
//		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-6.2f\t%-5s\n",kor,eng,mat,total,avg,level);
		
	}
	

}
