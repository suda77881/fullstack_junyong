package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("평균점을 입력하시오"); int avg = sc.nextInt();
		
		if ( avg >= 60  ) {System.out.println("합격");}
		else {System.out.println("불합격");}
	}

}
