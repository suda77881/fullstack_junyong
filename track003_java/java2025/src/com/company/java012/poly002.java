package com.company.java012;
/*
1. 클래스는 부품객체 		2. 상태와 행위 		3. 상속은 재활용
 	 Object 		
	   ↑			 
	 TestA1	(int a, toString)
	   ↑
	 TestB1 (int b, toString)
*/
class TestA2 extends Object{ 
	int a= 10;
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }
}
class TestB2 extends TestA2{
	int b=20;
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }
}
/////////////////////////////////////////////////////////
public class poly002 {
	public static void main(String[] args) {
		TestA2 ta = new TestB2();
		// 부모는 자식을 담을수있다.
		// 1. TestA2 ta {int a , toString}
		// 2. 		 1번지 TestB2(){	int b=20, toString	} → TestA2(){int a=10 , toString } → Object()
		// 생성자는 인스턴스변수를 초기화해서 사용할수 있게 해줌.
		// 3. ta{int b=20, @toString} [1번지] = 1번지 {int a=10 , @toString} - {int a=10 , --------}
		System.out.println(ta);	  // TestB2 [b=20]
		System.out.println(ta.a); // 10
		System.out.println(((TestB2)ta).b);	//20
	}
}
//////////////////////////////////////////////////////////