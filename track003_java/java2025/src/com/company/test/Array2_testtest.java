package com.company.test;

public class Array2_testtest {
	public static void main(String[]args) {
		
		int [][]a = new int[2][3];
		int b = 100;
		
		for (int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				
				a[i][j] = ++b ;
				
				System.out.print(j == 2 ? a[i][j] + "\n" : a[i][j] + "\t");
			}
		}
		
		char c = 'A';
		
		char[][] d = new char[2][3];
		
		for (int i = 0; i<d.length; i++) {
			for(int j = 0; j<d[i].length; j++) {
				
				d[i][j] = c++ ;
				
				System.out.print(j == 2 ? d[i][j] + "\n" : d[i][j] + "\t");
			}
			c = 'B';
		}
		
		
	}

}
