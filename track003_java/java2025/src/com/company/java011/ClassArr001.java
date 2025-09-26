package com.company.java011;

import java.util.Arrays;

public class ClassArr001 {
	public static void main(String[] args) {
		// 1) Toy [] 나주소 받을수 있어~
		Toy [] toys = new Toy[3];	//2) new 번지, Toy형태의 자료형 3개		
		System.out.println("1, " + toys);
		System.out.println("2, " + Arrays.toString(toys));
		
		
		toys[0] = new Toy();
		toys[0].setName("할로윈키티"); toys[0].setAge(52);
		System.out.println("3. " + toys[0] );
		
		
		// 사용방법2
		Toy [] toys2 = new Toy[] {
				new Toy("할로윈키티", 52) , new Toy("건담", 47)
		};
		// toys[0].name, toys[0].age
		// toys[1].name, toys[1].age
		
		for (int i=0; i<toys2.length; i++) { toys[i].show();}
		
		/// 클래스명의 뒷쪽에 [] 두번째 부분엔 숫자(층칸수) 선언
		///사용할땐 지역변수명[숫자]
	}
}





/*
------------------------[ runtime data area]
> Toy.class	Class_Repeat.class, Toy.company="(주) 703toyland" , Toy.num=0
------------------------------------
[heap: 동적]            | [stack : 잠깐빌리기]
1번지 [null][null][null]	<- toys [1번지]
						| 	main
		------------------------------------
*/