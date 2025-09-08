package com.company.java005_ex;

public class ForEx005 {
	
	public static void main(String[] args) {
		
		int cnt=0;
		char ch = 'a';
		
		for (int i = 26; i >= 0; i--) { 
//			System.out.print(ch);
//			System.out.print((ch == 'a' || ch == 'e' || ch == 'u' || ch == 'o' || ch == 'i' ? cnt++ : ""));
//			ch ++ ;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {cnt++;} ch ++ ;
//			switch (ch) {
//			case 'a' : cnt++;
//			case 'e' : cnt++;
//			case 'i' : cnt++;
//			case 'o' : cnt++;
//			case 'u' : cnt++;
//			ch ++ ;
//			}
			
		}
		
		System.out.println(cnt);
		
		
	}

}
