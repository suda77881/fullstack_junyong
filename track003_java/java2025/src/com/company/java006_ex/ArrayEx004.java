package com.company.java006_ex;

public class ArrayEx004 {

	public static void main(String[] args) {

		char[] ch = { 'B', 'a', 'n', 'a', 'n', 'a' };
		int num = 0;

		for (int i = 1; i <= ch.length - 1; i++) {
			if (ch[i] == 'a') {
				num++;
			} else {
				System.out.print("");
			}

		}
		System.out.println("a의 갯수 : " + num);
	}

}
