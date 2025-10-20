package com.company.repeat;

public class Repeat_0917 {

//	public static void dog() {
//		System.out.println("멍멍");
//	}
//
//	public static void disp(int num, char ch) {
//		for (int i = 1; i <= num; i++) {
//			System.out.print(ch);
//		}
//	}
//
//	public static String stdAvg(int num) {
//		if (num >= 90) {
//			return "A";
//		}else if (num >= 80) {
//			return "B";
//		}else if (num >= 70) {
//			return "C";
//		}else {
//			return "D";
//		}
//	}

	
	public static void dog() {System.out.println("멍멍");}
	public static void disp(int num, char ch) {for (int i = 1; i<=num; i++ ) {System.out.print(ch);}}
	public static String stdAvg(int score) {
		if (score >= 90) {return "A";}else if (score >= 80) {return "B";}else if (score >= 70) {return "C";}else D";
	}

	
	public static void main(String[] args) {

		System.out.println("강아지가 등장합니다.!");
		dog();

		System.out.println("\n강아지가 시험을 봤습니다. 점수를 공개합니다.!");
		disp(7, '*');

		System.out.println("\n 평가결과는?");
		System.out.println("당신의 평균은?" + stdAvg(88)); // B 출력
		// 90 점이상 A, 80 B, 70 C 아니라면 D
	}

}
