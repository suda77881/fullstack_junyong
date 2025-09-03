package com.company.java003;

import java.util.Scanner;

public class CastingIntegerEx {
	public static void main(String[] args) {
		// 1) 기본형 / 참조형
		// 2) boolean, 정수형(byte<short, char, <int★ <long), 실수형(float<double★)
		char upper = ' ';
		char lower = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대문자를 입력해주세요");	
		upper = sc.next().charAt(0);
		
		lower = (char) (upper + 32);
		//출력
		System.out.println("입력하신 대문자 : " + upper + ", 소문자 변환 : " + lower);

		
		
	}
}
