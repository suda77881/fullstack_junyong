package com.company.test;

import java.util.Scanner;
public class test_250919 {
	
	public static void main(String[] args) {
		
		
		char word = ' ';
		Scanner sc = new Scanner(System.in);
//		for (;;)
//			
//		{
//			
//			System.out.println("+,-,*,/를 입력해주세요");  word = sc.next().charAt(0);
//			if (word == '+' || word == '-' || word == '*' || word == '/' ) {
//				
//				break;
//			}
//			
//		}
		
		char word2 = ' ';
		
		while (word2 == '+' || word2 == '-' || word2 == '*' || word2 == '/' ) {
			
			System.out.println("+,-,*,/를 입력해주세요");  word2 = sc.next().charAt(0);
		}
	}

}
