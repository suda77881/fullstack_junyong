package com.company.java005_ex;
import java.util.Scanner;
public class ForEx002 {
	
	public static void main(String[] args) {
		
		int dan ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요"); dan = sc.nextInt();
		
		// 2*1=2
		// 2*2=4
		
//		for (int i = 1; i <= 9; i++ ) {
			
			
//			System.out.println(i * dan);
			
//			System.out.printf("%d*%d=%d\n", dan, i, dan*i);
			
			for(int i=1; i<=9; i++) {System.out.println(dan + "*" + i + "=" + dan*i);}
			
//		}
		
	}

}
