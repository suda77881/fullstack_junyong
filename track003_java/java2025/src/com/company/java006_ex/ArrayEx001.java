package com.company.java006_ex;

public class ArrayEx001 {

	public static void main(String[] args) {

		double[] arr = { 1.1, 1.2, 1.3, 1.4, 1.5 };

		for (int i = 0; i <= arr.length-1; i++) {

			if (i == arr.length-1) {
				System.out.printf("%.1f", arr[i]);
			} else {
				System.out.printf("%.1f,", arr[i]);
			}
		}
	}

}
