package com.company.java008_ex;

public class MethodEx004 {

	public static int return_num() {
		return 1;
	}

	public static float return_float() {
		return 10 / 3.0f;
	}

	public static String mycolor() {
		return "purple";
	}

	public static String jangsu() {
		return "★★★★★";
	}

	public static int myadd(int a, int b) {
		return a + b;
	}

	public static String myban(char ban) {
		return ban == 'A' ? "나는 노랑조" : "나는 주황조";
	}

	public static String stdId(int id) {
		return "G" + id;
	}

	public static String stdAvg(int score) {
		return score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "D";
	}

	public static void main(String[] args) {

		System.out.println("1. 내가 좋아하는 숫자    :" + return_num()); // 1을 결과값으로 줌
		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float()); // 3.3333을 결과값으로 줌
		System.out.println("3. BEST COLOR        :" + mycolor()); // PURPLE을 결과값으로 줌
		System.out.println("4. 장수돌침대 별이       :" + jangsu()); // ★★★★★을 결과값으로 줌
		System.out.println("5. 10+20= " + myadd(10, 20)); // 두숫자를 더한값을 결과값으로 줌
		System.out.println("6. 반(노랑조/주황조)=" + myban('B')); // A이면 노랑조 , B이면 주황조
		System.out.println("7. 당신의 학번은?" + stdId(1111)); // G하고 넣어준 학번 나오게
		System.out.println("8. 당신의 평균은?" + stdAvg(88)); // 90점이상이면 A , 80점이상이면 B , 70점이상이면 C , 아니라면 D
	}

}
