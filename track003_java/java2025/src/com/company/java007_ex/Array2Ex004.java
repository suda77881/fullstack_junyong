package com.company.java007_ex;

public class Array2Ex004 {
	
	public static void main(String[] args) {
		
		char [][]ch = new char[2][3];
		
		char data = 'A'; 
		
		for (int fl = 0; fl < ch.length; fl++) {
			for (int f2 = 0; f2 <ch[fl].length; f2++) {
			
//				if (fl == 0) {ch[fl][f2] = data++;}
//				else {ch[fl][f2] = data --;}			 
		 	
				if (fl == 1 && f2 == 0) {data = 'B';}
				ch[fl][f2] = data++;

			 System.out.print(f2 == 2 ? ch[fl][f2]+"\n" : ch[fl][f2]+"\t");
			}
			
		}
		
		
	}

}
