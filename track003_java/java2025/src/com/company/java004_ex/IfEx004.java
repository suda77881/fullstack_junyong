package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	
	public static void main(String[] args) {
		
	char ch = '\u0000';
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("문자를 입력하세요"); ch = sc.next().charAt(0);
	
	if (ch <= 'z' && ch >= 'a' ) {System.out.println("당신이 입력한 문자는 소문자입니다.");}
	else if (ch <= 'Z' && ch >= 'A' ){System.out.println("당신이 입력한 문자는 대문자입니다.");}
	else {System.out.println("영문 소문자, 대문자가 아닙니다.");}
	
	// 소문자의 범위는 'a'~ 'z'
	// 대문자의 범위는 'A'~ 'Z'
	
	}
}
