package com.company.java006_ex;

public class ArrayEx003 {

	public static void main(String[] args) {

		String[] arr = { "아이언맨", "헐크", "캡틴" };

		for (int i = 0; i <= arr.length - 1; i++)

		{
			if (i == 2) {
				System.out.printf("%s", arr[i]);
				// System.out.print ((i==0 ? "," : "")); ?
			} else {
				System.out.printf("%s,", arr[i]);
			}

		}
	}

}
