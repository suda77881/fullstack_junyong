package com.company.java007_ex;

public class Array2Ex005 {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
		
		int total = 0; double avg=0.0;
		
		for (int ch = 0; ch < arr.length; ch++) {
			for (int kan = 0; kan < arr[ch].length; kan++) {
				
				total += arr[ch][kan];
			}
		}
		avg = total / 12.0;
		
		System.out.print("total : "+ total + " avg : " + avg);
	}

}
