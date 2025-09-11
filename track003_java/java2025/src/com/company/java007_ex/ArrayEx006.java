package com.company.java007_ex;

public class ArrayEx006 {
	public static void main(String [] args) {
		
	
		double[] arr 		= 	new double[5];
		double db = 1.1;
//		double arr2 = (double) arr[i];
		
		for (int i = 0; i < arr.length; i++)
		{
			
			
			arr[i] = db;  db += 0.1;
			
			
			

		}
		for (int i = 0; i < arr.length; i++)
		{
		System.out.printf("%.1f " ,arr[i]);
		}

	}

}
