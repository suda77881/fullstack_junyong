package com.company.java005_ex;
import java.util.Scanner;

public class ForEx004 {
	
	public static void main(String[] args) {
		
		int num1=0, cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3의 배수 : ");
		for (int i = 1; i <= 10; i++ ) {
			
			
//		입력 + 처리 (1) 문제파악
//		1이 3의 배수라면 카운트
//		2가 3의 배수라면 카운트
//		3이 3의 배수라면 카운트
//		
//		입력 + 처리(2) 구조
//		if (1이 3의 배수라면) {카운트}
//		if (2가 3의 배수라면) {카운트}
//		if (3이 3의 배수라면) {카운트}
//		입력 + 처리(3) 코드변환
//		if (1%3== 0) {cnt++;}
//		if (2%3== 0) {cnt++;}
//		if (3%3== 0) {cnt++;}
			
//		for (int i = 1; i <= 10; i++) {
//			if (i % 3 == 0) {cnt++;}
//		}

//			if (i % 3 == 0) { cnt ++ ; System.out.print((i == 9 ? ""+ i : ""+ i +","  ));} // if 문
			
			switch (i) {	// switch 문
			case 3 : case 6 : {cnt++;} ; System.out.print(i + ","); break;
			case 9 : {cnt++;} ; System.out.println(i);
			}
			
		}
		System.out.print("\n갯수 : " + cnt + "개");
	}

}


// 변수

//1~10까지 3의 배수의 갯수 카운트 담을 변수
// 입력 + 처리(1)
// 1이 3의 배수라면 카운트
//2이 3의 배수라면 카운트
//3이 3의 배수라면 카운트

// 입력 + 처리(2)
// if(1이3의 배수라면) {카운트}
//if(2가3의 배수라면) {카운트}
//if(3이3의 배수라면) {카운트}

//입력 + 처리(3)
//if(1%3의 배수라면) {cnt++;}
//if(2%3의 배수라면) {cnt++;}
//if(3%3의 배수라면) {cnt++;}