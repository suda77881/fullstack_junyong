package com.company.repeat_251010;

import java.util.Scanner;

public class Exception005 {
	
	public static int nextInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1을 입력하세요");
		return sc.nextInt(); // a
	}
	
	public static void main(String[] args) {
		int one = 0;
		while(true) { one = nextInt(); if(one == 1) {break;}
			
		}
		

	}

}
