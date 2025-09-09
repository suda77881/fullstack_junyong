package com.company.java006_ex;
import java.util.Scanner;
public class ForEx007_2 {
	public static void main(String[] args) {
		
		//변수
		String std="";
		int	   kor = -1, eng = -1, mat = -1, total; /* 0. 0~100사이가 아닌 값 */
		double avg;
		String pass, level, jang;
		Scanner sc = new Scanner(System.in);
		//입력
		//		학번입력 > std111
		//		국어점수 입력 > 100	*	0~100사이만 입력받기
		//		영어점수 입력 > 100	*	0~100사이만 입력받기	 
		//		수학점수 입력 > 100	*	0~100사이만 입력받기
		
		System.out.println("학번 입력 >"); std = sc.next();
		for(;;) { //1. 무한반복
//			System.out.println("국어점수 입력> "); kor = sc.nextInt();
//			if( 0<= kor && kor <= 100) {break;}
			if (!(0<=kor && kor <=100)) {
				System.out.print("국어점수 입력 >"); kor = sc.nextInt(); // 2-2. 입력받고
				continue; // 2-3. 아래 건너뛰기 - 2-1.으로 가서 범위맞는지 확인
			}
//		}
//		for(;;) {
//			System.out.println("영어점수 입력> "); eng = sc.nextInt();
//			if( 0<= eng && eng <= 100) {break;}
			
			if (!(0 <= eng && eng <=100)) { // 3-1. 점검 : 0~100사이가 아니라면
				System.out.print("영어점수 입력 >"); eng  = sc.nextInt(); // 3-2. 입력받고
				continue; // 3-3. 아래 건너뛰기 1무한반복위치에서 다시 코드범위 확인
			}
//		}
//		for(;;) {
//			System.out.println("수학점수 입력> "); mat = sc.nextInt();
//			if( 0<= mat && mat <= 100) {break;}
			if (!(0<= mat && mat <=100)) { // 3-1. 점검 : 0~100사이가 아니라면
				System.out.print("수학점수 입력 >"); mat = sc.nextInt(); // 3-2. 입력받고
				continue; // 3-3. 아래 건너뛰기 1무한반복위치에서 다시 코드범위 확인
			}
			break;
			}
		
		
		//처리
		
		total = kor + eng + mat;
		avg   = total/3.0;
		pass  = avg < 60? "불합격" : kor>=40 && eng >= 40 && mat>=40 ? "합격" : "불합격";
		jang  = avg < 95? "" : "장학생";
		level = avg >=90? "수" : avg >= 80? "우" : avg >= 80? "미" : avg >= 80? "양" : "가"; 
		
		//출력
		
		System.out.println("============================================================== ");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t"
				, "학번", "국어", "영어", "수학", "총점", "평균", "합격여부", "레벨", "장학생");
		System.out.println("============================================================== ");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\t"
				, std, kor, eng, mat, total, avg, pass,level, jang);
		
		}
		

}
