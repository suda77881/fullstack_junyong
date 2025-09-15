package com.company.test;

public class Chars {

	public static void main(String[] args) {

		char ch = 'a';
		char[] chars = new char[3];

		for (int i = 0; i < chars.length; i++) {

			chars[i] = ch++;

			System.out.print(i == 2 ? chars[i] : chars[i] + ",");

		}
	}

}
