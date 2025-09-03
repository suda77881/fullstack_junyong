package com.company.java003;

public class Operator001 {

	public static void main(String[] args) {
		// 먼저() 값(+,-,*,/,%,++,--) 비교(>,<) 조건(&& , || ,?:) 대입(=)
		
		
		// 1. 값
		int a = 10, b = 3;	
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);	// 몫 3
		System.out.println(a%b);	// 나머지 1
		
		//Q1. 나머지연산자 - 짝수니? 홀수니?
		// 0%2	1%2	2%2	3%2
		System.out.println( 0%2 +"\t" + 1%2 + "\t" + 2%2 + "\t" + 3%2);
		//Q2. 3의 배수?		 0			1				2		0			1
		// 3으로 나눴을때 0 / 나머지 0 1 2
		System.out.println( 0%3 +"\t" + 1%3 + "\t" + 2%3 + "\t" + 3%3 + "t" + 4%3);
		
		//2. 비교 ( ==, != , < , > , >= , <=  )
		System.out.println(	10	 > 	3 );		//true
		System.out.println(	10	==  3 );	//false
		//Q1.a가 짝수니? 
		System.out.println(a%2 == 0);	//	true
		//Q2.b가 3의 배수니?
		System.out.println(b%3 == 0);	//	true
		
		//3. && (모든조건만족시) || (여러조건중에 하나라도 만족시 true)
		System.out.println(true    &    true); // true
		System.out.println(true    &&   true); // 모든조건 만족시 true
		System.out.println(false   &    true); // & 처음에 false 뒤에조건까지 읽는
		System.out.println(false   &&   true); // Dead code
		
		System.out.println(true    |    true); // true
		System.out.println(true    ||   true); // true	: Dead code
		System.out.println(false   |    true); // true
		System.out.println(false   ||   true); // false
		
		//Q1. a가 2의 배수 이면서 5의 배수라면 true / false
		//Q2. a가 2의 배수 이면서 3의 배수라면 true / false
		
		System.out.println(a%2 == 0 && a%5 == 0);
		System.out.println(a%2 == 0 && a%3 == 0);
		
		//4. 삼항연산자 (조건)? 참: 거짓
		System.out.println( a==10 ? "10이다" : "10이 아니다");
		
	}
}
