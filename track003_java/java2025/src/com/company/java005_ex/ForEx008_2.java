package com.company.java005_ex;

public class ForEx008_2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			System.out.print(i + "\t");
		}

		System.out.println("");
		int i = 1;
		while (i <= 5) {
			System.out.print(i + "\t");

			i++;
		}

		System.out.println("");
		i = 1;
		do {
			System.out.print(i + "\t");

			i++;
		} while (i <= 5);
	}

}
