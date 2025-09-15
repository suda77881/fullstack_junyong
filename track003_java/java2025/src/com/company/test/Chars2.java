package com.company.test;

public class Chars2 {
	public static void main(String[] args) {
		char ch = 'a';
		char []chars = new char[3];
		
		for (int i = 0; i<chars.length; i++)
		{
			
			
			System.out.print(i == 2 ? ch : ch + ",");
			chars[i] = ch++; 
		}
		
	}

}
