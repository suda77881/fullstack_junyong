package com.company.java002;

import java.util.Scanner;

public class InputEx001 {
	public static void main(String[] args) {
		//변수
		int age = 0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("당신의 나이를 입력하시오>");
		age = scanner.nextInt();
		System.out.println("내 나이는 "+age+"입니다.");
		//처리
		//출력
		System.out.println("내 나이는 "+age+"살 입니다.");
		
		
	}
}
