package com.company.java005_ex;

public class ForEx005_2 {
	
	public static void main(String[] args) {
		
		int cnt=0;
		
		
		
		//입력 + 처리(1) 문제파악
		//a가 모음이라면 (a,e,i,o,u) 카운트
		//b가 모음이라면 (a,e,i,o,u) 카운트
		//c가 모음이라면 (a,e,i,o,u) 카운트
		
		//입력 + 처리(2) 구조
		//if ( a가 모음이라면 (aeiou) {카운트}
		//if ( b가 모음이라면 (aeiou) {카운트}
		//if ( c가 모음이라면 (aeiou) {카운트}
		
		// 입력 + 처리 3 코드 작성 {반복} {변수}
		
		
		
		for (char i = 'a'; i<='z'; i++)
		{if (i == 'a'|| i == 'e' || i == 'i' || i== 'o' || i == 'u') {cnt++;}}
		
		//출력 
		System.out.println("소문자 a~z까지 모음의 갯수 > " + cnt);
		
		
			
		}
		
		
		
		
	}
