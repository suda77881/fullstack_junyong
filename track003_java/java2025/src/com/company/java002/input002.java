package com.company.java002;

import java.util.Scanner;
public class input002 { 	// 어디서든지 접근가능한, 부품객체
	public static void main(String[] args) {
		// 1. 자료형 - 기본형/참조형
		// 2. 기본형 - 논리, 정수(byte-short-int★-long), 실수(float-double★)
		// GIGO (입력 → 처리 → 출력)
		// 변수
		float f  = 3.14f;	//1.23 3.14
		double d = 3.14;	//
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("실수를 입력하세요");
		f = scanner.nextFloat();	//f = scanner.nextFloat();
		d = scanner.nextDouble();
		// 처리 x
		// 출력
		System.out.println("입력하신 실수는 " + d);
	}// end main
}// end class
