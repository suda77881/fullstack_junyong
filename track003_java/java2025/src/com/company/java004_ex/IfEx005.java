package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	
	public static void main(String[] args) {
		 
		char ch = ' ';

		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문 입력>"); ch = sc.next().charAt(0);
		
		if (ch >= 'a' && ch <= 'z') {ch -= (char) 32; System.out.println(ch);}
		else if (ch >= 'A' && ch <= 'Z') {ch += (char) 32; System.out.println(ch);}
		
//			 if ( ch>='A' && ch<='Z' ) {ch+=32; System.out.println(ch);};
//	    else if ( ch>='a' && ch<='z' ) {ch-=32; System.out.println(ch);};
		
		ch = ch>='A' && ch<='Z' ? ch+=32 : 
			 ch>='a' && ch<='z' ? ch-= 32: ch;
	
	}

}
