package com.company.java005;

public class Repeat003_while_Dowhile {
	
	public static void main(String [] args) {
		
		// 1. for (반복횟수 알때)
		// 1 2 3
		System.out.println("1. for");
		for(int i=1; i<=3; i++){	System.out.println(i + "\t");	}
		
		//2. while (반복횟수 모를떄 - 게시판 조건) ctrl + shift + f
		System.out.println("2. while");
		int i = 1; // 2-1. 조건문-위로
		while (i <= 3) { // 2-2. 조건
			System.out.println(i + "\t");
			i++;
		} // 2-3. 증감 - }맨끝
		//3. do while (무조건 1번은 실행해야할때)
		System.out.println("2. while");
		int a = 1; // 2-1. 조건문-위로
		do{ // 2-2. 조건
			System.out.println(i + "\t");
			i++;
		}while (i <= 3); // 3-3. 증감 - }맨끝
		
	
		
		
		
		
	}

}
