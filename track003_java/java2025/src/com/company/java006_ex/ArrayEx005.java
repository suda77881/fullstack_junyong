package com.company.java006_ex;

public class ArrayEx005 {

	public static void main(String[] args) {

		char[] ch = { 'B', 'a', 'n', 'a', 'n', 'a' };
		int num1 = 0, num2 = 0;

		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				num1++;
			} else {
				num2++;
			}

		}

		System.out.printf("대문자 갯수 : %d\n소문자 갯수 : %d", num2, num1);
	}

}
