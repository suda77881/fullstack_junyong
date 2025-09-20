package com.company.test;



public class test_0919_control {
	
	public static String stdId(int num2) { return "G"+num2;}
	public static void disp(int num, char ch) {for (int i = 1; i <= num; i++ ) {System.out.print(ch);}
		}
	public static void main(String[] args) {
		
		disp(7,'*');
		System.out.println();
		System.out.println("당신의 학번은?" + stdId (1111));
	}
	
	

}
