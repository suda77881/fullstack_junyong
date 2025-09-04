package com.company.java004_ex;

import java.util.Scanner;

public class IfEx2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("평균점을 입력하시오"); int avg = sc.nextInt();
		
		System.out.println(avg >= 60 ? "합격" : "불합격");

	}

}
