package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx008{ 
	
	public static void upper(char[] ch) 
			{for (int i = 0; i < ch.length; i++ ) {ch[i] -= 32;}
			
			
			
	}
	// public static 리턴값 메서드명 (파라미터){해야할일}
	// public static void upper
	
	public static void main(String [] args) {
		
    char[] ch = {'a','b','c'};
    upper(ch);     
    // public static 리턴값 메서드명(파라미터) {해야할일}
    // public static void upper( char[] ch ) {대문자로 변경}
    /* [heap]					[stack]
     * 						  < upper (1000번지)
     * 1000번지{'a','b','c'}    < ch : 1000번지 
     */
    System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          );  // [A,B,C]
	}
}


