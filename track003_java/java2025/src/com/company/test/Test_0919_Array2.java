package com.company.test;

public class Test_0919_Array2 {
	
	
	
	public static void main(String[] args) {	
		char[][] ch = new char[2][3];
		
		

		char ch2 = 'A';
		for (int i = 0; i < ch.length; i++) {

			for (int j = 0; j < ch[i].length; j++) {

				ch[i][j] += ch2++;				
				 System.out.print(j== 2 ? ch[i][j] + "\n" : ch[i][j] + "\t" );	 
			}
			ch2 += 29; // ch2 = 'a';
			 
		}
	}

}
