package com.company.java002;

import java.util.Scanner;

public class InputExtesttest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		byte c;
		float b;
		double d;
		
		System.out.println("당신의 수학점수는 무엇입니까?");
		a = sc.nextInt();
		
		a = a / 21 ;
		
		System.out.println("당신의 수학점수는 " + a + "까지 내려갈것입니다.");
		
		
	}
}