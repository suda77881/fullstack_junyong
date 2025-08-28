package com.company.java002_ex;

public class PrintEx002 {
	public static void main(String[] args) {
		
		//()로 문자열 뒤에 숫자를 연산 시킬 수 있다.
		// println
		System.out.println("10+3"+ "=" +(10+3));
		
		// print
		System.out.print("10+3="+(10+3)+"\n");
		/*
		 * System.out.print("10+3="); System.out.print("10+3\n");
		 */
		
		// printf
		System.out.printf("%d+%d="+(10+3),10,3);
	}
}
