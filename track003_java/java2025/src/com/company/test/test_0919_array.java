package com.company.test;

import java.util.Arrays;

public class test_0919_array {
	public static void dog () {System.out.println("멍멍");}
	public static void main(String[] args) {
		
		int [][]num = new int[2][3];
		int data = 100;
		for (int i = 0; i<num.length; i++) {
			for (int j = 0; j<num[i].length; j++) {
				
				num[i][j] += ++data; 
				
				System.out.print(j==2 ? num[i][j] + "\n" : num[i][j] + "\t");
			}
			data += 97;
		}
		
//		System.out.println(Arrays.deepToString(num));
		dog();
		
	}

}
