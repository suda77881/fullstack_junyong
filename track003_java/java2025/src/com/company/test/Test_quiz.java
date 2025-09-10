package com.company.test;

import java.util.Scanner;

public class Test_quiz {

	public static void main(String[] args) {

		char a = ' ', b = ' ';
		int num = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("a,b,c중 하나를 입력하세요");
		a = sc.next().charAt(0);

		if (a == 'a') {
			System.out.println("apple");
		} else if (a == 'b') {
			System.out.println("banana");
		} else if (a == 'c') {
			System.out.println("coconut");
		} else {
			System.out.println("a,b,c가 아니다.");
		}

		System.out.println("a,b,c중 하나를 입력하세요");
		b = sc.next().charAt(0);

		switch (b) {

		case 'a': {
			System.out.println("apple");
		}
			break;
		case 'b': {
			System.out.println("banana");
		}
			break;
		case 'c': {
			System.out.println("coconut");
		}
			break;
		default: {
			System.out.println("a,b,c가 아니다.");
		}
		}

		for (;;) {

			System.out.println("숫자를 입력해주세요");
			num = sc.nextInt();

			if (num == 1) {
				break;
			} else {
				continue;
			}

		}
	}

}
