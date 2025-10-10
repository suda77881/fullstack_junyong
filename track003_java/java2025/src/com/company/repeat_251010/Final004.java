package com.company.repeat_251010;

//옵션1. division, jumin 바뀌면 안됨
//옵션2. 각 유저마다 데이터 저장

//1. 클래스는 부품객체
//2. 상태와 행위
//3. 상태 - 인스턴스변수★, 클래스변수(static), 지역변수
//4. 바뀌면 안됨 - static, final - 하지마 ★ (멤버변수 -상수 , 멤버메서드-오버라이딩하지마, 클래스-상속받지마)
/*	초기화순서 		초기값		명시적초기화		초기화블록			생성자
 	division	\u0000		x 유지 \u0000		x 유지 \u0000		처리 User004('B' , "200101-1234567") O
 	jumin		null		x 유지 null		x 유지 null		처리 User004()	\u0000, null
 */
final class User004{
	char division; // A,B,C,D 4가지 타입으로 분류할 수 있다.
	String jumin;
	
	public User004(){super(); 
	division = 'A'; 
	jumin = "123456-1234567"; 
	}	// 필드있는 생성자를 만들면 자동생성이 꺠짐 + fui
	
	public User004(char division, String jumin) { super(); this.division = division; this.jumin = jumin; }
	
	@Override public String toString() { return "User004 [division=" + division + ", jumin=" + jumin + "]"; };
	
}
public class Final004 {
	public static void main(String[] args) {
		
	User004 c1 = new User004('B', "200101-1234567");	System.out.println(c1);
	User004 c2 = new User004();							System.out.println(c2);
		
	}

}
