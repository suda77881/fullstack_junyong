package com.company.java002;

import java.util.Scanner;

public class InputEx001_22 {
	public static void main(String[] args) {
		int year = 2025;
		int birth = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신이 태어난 연도를 입력하시오>"); birth = scanner.nextInt();
		System.out.println("당신의 나이는 "+(year-birth)+"입니다.");
		
	}
}
