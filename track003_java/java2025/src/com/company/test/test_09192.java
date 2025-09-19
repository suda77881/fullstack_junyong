package com.company.test;

import java.util.Scanner;

public class test_09192 {
	
	public static void main(String[] args) {
		char ch = ' '; 
		Scanner sc = new Scanner(System.in) ;
	
	
	for (;;) {
		System.out.print("+,-,*,/를 입력해주세요"); ch = sc.next().charAt(0);
		
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/' )
		{break;}
		
		
		}
		System.out.println("break됨");
		
		char ch2 = ' ';
		
	while (!(ch2 == '+' || ch2 == '-' || ch2 == '*' || ch2 == '/') ) {
		
	System.out.print("+,-,*,/를 입력해주세요"); ch2 = sc.next().charAt(0);
	
	}
		System.out.println("break됨");
		
		
		char ch3 = ' ' ;
		do {
			
			System.out.print("+,-,*,/를 입력해주세요"); ch3 = sc.next().charAt(0);
			
			
		}while (!(ch3 == '+' || ch3 == '-' || ch3 == '*' || ch3 == '/') );
		
		
		System.out.println("break됨");
		
	}
	
	
}
