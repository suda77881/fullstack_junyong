package com.company.java008_total;

import java.util.Scanner;
public class Test001 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch= ' ';
		
		System.out.println("\n\n1. for(1)");
		for (;;) { //시작; 종료  ; 변화 - 몇번쨰까지
		
			System.out.print("+,-,*,/를 입력해주세요.");
			ch = sc.next().charAt(0);
			if (ch== '+' || ch== '-' || ch== '*' || ch== '/') {break;} // 잘썻으면 나와!
		}
		
		System.out.println();
		
		System.out.println("\n\n1. for(2)");
		ch= ' ';
		for(; !(ch== '+' || ch== '-' || ch== '*' || ch== '/');) {
			System.out.print("+,-,*,/를 입력해주세요.");
			ch = sc.next().charAt(0);
			
		}
		
		System.out.println("\n\n2. while");
		ch= ' ';
		while ( !(ch== '+' || ch== '-' || ch== '*' || ch== '/')) {
			System.out.print("+,-,*,/를 입력해주세요.");
			ch = sc.next().charAt(0);
			
		}
		
		System.out.println("\n\n3. do-while");
		ch= ' ';
		do{
			System.out.print("+,-,*,/를 입력해주세요.");
			ch = sc.next().charAt(0);
			
		} while ( !(ch== '+' || ch== '-' || ch== '*' || ch== '/')) ;
	}

}
