package com.company.java005_ex;

public class RepeatEx010 {

	public static void main(String[] args) {

		char ch = 'A';

		for (int i = 0; i <= 25; i++) {

			if (i % 5 == 0) {
				System.out.println("");
			}
			System.out.print(ch);
			ch += 1;
		}
		int i = 0;
		ch = 'A';

		while (i <= 25) {

			if (i % 5 == 0) {
				System.out.println("");
			}
			System.out.print(ch);
			ch += 1;

			i++;
		}

		i = 0;
		ch = 'A';

		do {

			if (i % 5 == 0) {
				System.out.println("");
			}
			System.out.print(ch);
			ch += 1;

			i++;
		} while (i <= 25);

	}

}
