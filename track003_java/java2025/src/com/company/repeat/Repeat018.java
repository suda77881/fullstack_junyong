package com.company.repeat;

public class Repeat018 {
	
	public static void dog() {System.out.print("멍멍");}
	public static void disp(int num, char ch) {for (int i = 1; i <= num; i++) {System.out.print(ch);}}
	public static String stdAvg(int score) 
	{if (score >= 90) {return "A";}else if (score >= 80) {return "B";}else if (score >= 70) {return "C";}
	else {return "D";}
	}
	public static void main(String [] args) {
		
		System.out.println("강아지가 등장합니다!");
		dog();								// 멍멍 출력
		
		
		System.out.println("\n 강아지가 시험을 봤습니다. 점수를 공개합니다!");
		disp(7,'*');						// ******* 출력
		
		System.out.println("\n 평가 결과는?");
		System.out.println("당신의 평균은?" + stdAvg(88));  // B출력
		
	}	// 90점 이상 A , 80 B , 70 C, 아니라면 D

}
