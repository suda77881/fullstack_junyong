package com.company.test;

public class Repeat017_1 {
	
	public static void main(String[] args) {
		
		int [][]a = new int [2][3];
		int b = 100;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				a[i][j] = ++ b;
				System.out.print(j == 2 ? a[i][j] + "\n" : a[i][j] + "\t");
			}
			
		}
	}

}
