package com.company.repeat;

public class Repeat017_2 {
	
	public static void main(String[] args) {
		
		char a[][] = new char [2][3];
		
		char b = 'A';
		
		for (int i = 0; i < a.length ; i++) {
			
			for (int j = 0; j < a[i].length ; j++) {
				
				a[i][j] = b++;
				System.out.print(j == 2 ? a[i][j] + "\n" : a[i][j] + "\t");
			}
			b = 'B';	// -1도 가능
		}
	}

}
