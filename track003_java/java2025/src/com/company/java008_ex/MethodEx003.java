package com.company.java008_ex;

public class MethodEx003 {
	public static void printProfile(String name, int age, String area) {
		System.out.print("이름 : " + name + "\n나이 : " + age + "\n지역 : " + area + "\n");
	}

	public static void checkAge(int lmt) {
		System.out.println(19 > lmt ? "미성년자 입니다." : "성인 입니다.");
	}

	public static void repeatMessage(String msg, int rpt) {
		for (int i = 1; i <= rpt; i++) {
			System.out.println(msg);
		}
	}

	public static void drawBox(int rpt, char msg) {
		for (int i = 1; i <= rpt; i++) {
		for (int j = 1; j <= rpt; j++) {
			System.out.print(msg);
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {

		// public static 리턴값 메서드명(파라미터)
		printProfile("홍길동", 25, "서울"); // 이름, 나이, 지역 출력
		checkAge(17); // 미성년자 여부 판단
		repeatMessage("안녕하세요!", 3); // 메시지 반복 출력
		drawBox(5, '#'); // 문자로 박스 출력
	}

}
