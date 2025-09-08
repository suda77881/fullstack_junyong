package com.company.java005_ex;

public class ForEx003 {
	
	public static void main(String[] args) {
		
		int result=0;
		
		int num1=0; String result2 = "", result3 = "";
		int hap=0;
		
//		for (int i = 0; i <= 10; i++ ) {
			
			//입력 + 처리
			// hap변수 1담기
			// hap변수에 2담기
			
			//		hap = hap+1		//	hap[1]	0+1
			//		hap = hap+2		//	hap[3]	1+2
			//		hap = hap+3		//	hap[6]	3+4
			//  	{반복}
			
			for(int i=1; i<=10; i++) {	
					hap = hap+i;
					System.out.print( (i==1? "":"+") + i);
			
			
			}
			
			System.out.println("=" + hap);
	
//			result += i;
			 
			
			// 업그레이드 문제
//			if (i == 0) {result2 = ""; }
//			else if (i >= 1 && i <= 8) {result2 += String.format("%d", i) + "+";}
//			else if (i == 9) {result2 += String.format("%d", i);}
//			else if (i == 10) {result2 += "=" + String.format("%d", i);}
			
			
//			result3 = (i <= 8 && i >= 1) ? result2 += String.format("%d", i) + "+" : "";
//			result3 = (i == 9 ) ? result2 += String.format("%d", i) + "=" : "";
//			result3 = (i == 10 ) ? result2 += String.format("%d", i) : "";
			
			
			// result += i
//		}
//		System.out.println(result);
//		System.out.println(result2);
//		System.out.println(result3);
		
	}

}
