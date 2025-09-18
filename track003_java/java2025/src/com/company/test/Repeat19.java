package com.company.test;

public class Repeat19 {
	
	
	public static void start() {System.out.println("부우웅...");}
	public static void scan(int n, char ch) {for (int i = 1; i <= n; i++) {System.out.print(ch);}}
	public static String signalGrade(int grade) 
	{return grade > 80 ? "A" : grade > 70 ? "B" : grade > 60 ? "C" : "D";}
	public static int charge (int current, int added){return current + added;}
	
	
	public static void main(String[]args) {
		
		System.out.println("탐사 로봇이 기동합니다!");
		
		start();			// 부우웅... 출력
		
		System.out.println("\n 행성 스캔 중...");
		
		scan(5, '#');		// ##### 출력
		
		System.out.println("\n신호 강도 분석 결과:");
		
		System.out.println("신호등급 : " + signalGrade(65)); // C 출력
		
		System.out.println("\n배터리 충전 중...");
		System.out.println("충전 완료 : " + charge(40,40) + "%"); // 80
	}

}
