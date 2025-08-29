package com.company.java002;

import java.util.Scanner;

public class InputEx002 {
	public static void main(String[] args) {
		//변수
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("좋아하는 수(정수) 입력하시오 >");
		number = scanner.nextInt();
		
		//출력
		System.out.println("좋아하는 숫자는 "+number+"입니다.");
		
	}
}
