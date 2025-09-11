package com.company.java007_ex;

public class ArrayEx007_2 {
	
	public static void main(String[] args) {
		
		String []arr = new String[5];
		
		char ch = 'A';
		char data = 'A';
		
//		for (int i=0; i < str.length; i++)
//		{
//			
//			str[i] = "" + ch; // ai봄
//			
//			System.out.print(str[i]);
//			
//			ch += 1;
//			
//			
//			
//		}
		
		for (int i=0; i < arr.length; i++)
		{
			arr[i] = "" + ch ; ch += 1;
			
			System.out.printf("%s ",arr[i]);
			
		}
		for(int i=0; i<arr.length; i++) {arr[i] = data++;}
		for(int i=0; i<arr.length; i++) {System.out.print(arr[i]);}
		
		
	}

}
