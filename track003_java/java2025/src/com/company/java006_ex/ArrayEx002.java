package com.company.java006_ex;

public class ArrayEx002 {

	public static void main(String[] args) {

		char[] arr = { 'A', 'B', 'C', 'D' };

		for (int i = 0; i <= arr.length - 1; i++) {

			if (i == 3) {
				System.out.printf("%s", arr[i]);
			} else {
				System.out.printf("%s,", arr[i]);
			}

		}
	}

}
