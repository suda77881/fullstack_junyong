package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex002_upgrade1 {
	
	public static void main(String[] args) {
		
	 String result = " ";
		
		int [][] arr = {{100,101,102},{200,201,202},{300,301,302}};
		
		for (int ch = 0; ch < 3 ; ch++) {
			
			for (int kan = 0; kan <3; kan++) {
				
			
				if (arr[ch][kan]%2 == 0) {
					
					result += "" + arr[ch] + arr[kan];
					System.out.println(Arrays.toString(arr[ch]));
					System.out.println(Arrays.toString(arr[kan]));
					System.out.print(arr[ch][kan]%2 == 0 ? "arr[" +ch+ "][" + kan + "] = " + arr[ch][kan] + "\n" : "");
				}
//				System.out.print(arr[ch][kan]%2 == 0 ? arr[ch][kan] + "\t" : "");
				
			}
		}
	}

}
