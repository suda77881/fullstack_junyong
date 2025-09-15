package com.company.java007_ex;

public class Array2Ex001 {
	
	public static void main(String[] args) {
		
		int [][] arr2 = {{100,200,300},{400,500,600} };
		
		for (int ch = 0 ; ch < arr2.length; ch++) {
			for (int kan = 0; kan < arr2[ch].length; kan++) {
				System.out.print(arr2[ch][kan] + "\t");
			}
		}
		System.out.println();
		
		for (int ch = 0 ; ch <= 1; ch++) {
			for (int kan = 0; kan <= 2; kan++) {
				System.out.print(arr2[ch][kan]+"\t");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i<= 1; i++) {
			
			for (int i2 = 0; i2 <= 2; i2++) {
				
				System.out.print(arr2[i][i2]+"\t");
			}
		}
		System.out.println();
		
		System.out.println(arr2[0][0]);
		
		
			
	}

}
