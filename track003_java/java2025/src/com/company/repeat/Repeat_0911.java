package com.company.repeat;

import java.util.Scanner;

public class Repeat_0911 {

	public static void main(String[] args) {

		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력>_");
		ch = sc.next().charAt(0);

		{
			if (ch == 'x') {
				System.out.println("X-ray");
			} else if (ch == 'y') {
				System.out.println("yogurt");
			} else if (ch == 'z') {
				System.out.println("zebra");
			} else {
				System.out.println("x,y,z가 아닙니다.");
			}
		}

		ch = ' ';
		System.out.print("문자입력>_");
		ch = sc.next().charAt(0);

		switch (ch) {
		case 'x': {
			System.out.println("X-ray");
		}
			break;
		case 'y': {
			System.out.println("yogurt");
		}
			break;
		case 'z': {
			System.out.println("zebra");
		}
			break;
		default: {
			System.out.println("x,y,z가 아닙니다.");
		}
			break;
		}

		int num = 0;
		for (;;) {
			System.out.print("숫자를 입력해주세요");
			num = sc.nextInt();

			if (num == 7) {
				System.out.print("\n종료합니다.");
				break;
			} else {
			}

		}
		System.out.println("");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		int i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 5);

	}

}
