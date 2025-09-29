package com.company.java012;

//Q1. 상속도를 그리시오.

//   Object
//	   ↑
//   TestA2
//     ↑
//   TestB2

class TestA2 extends Object{ 
	int a= 10;
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }
}
class TestB2 extends TestA2{
	int b=10;
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }
}
/////////////////////////////////////////////////
public class PolyEx001 {
	public static void main(String[] args) {
		TestA2 ta = new TestB2();
		
		package com.company.java012;

		//Q1. 상속도를 그리시오. 

//			  Object
//				↑
//		    TestA3
//		      ↑
//			  TestB3



		class TestA3  extends Object{  
		 int a=10;
		 @Override public String toString() { return "TestA3 [a=" + a + "]"; }
		}
		class TestB3  extends TestA3{  
		 int b=10;
		 @Override public String toString() { return "TestB3 [b=" + b + "]"; }
		} 
		/////////////////////////////////////////////////
		public class PolyEx002 {
		 public static void main(String[] args) {
		    TestB3  tb =  (TestB3) new TestA3();
		    //Q2. 15번째줄에서   TestB3  tb는 클래스의 무엇을 사용할수 있을까요? 
		    // A2. b, @toString 코드의 의미 tb변수에 클래스정보는 TestB3로 구성되어있지만, 실제 객체와 주소는 TestA3정보를 담는다.
		    //Q3. 15번째줄에서   T(TestB3) new TestA3() 클래스의 무엇을 사용할 수 있을까요?
		    //  사용할수 있는것, a, toString, b
		    //Q4. 코드상에서는 문제가 없는데 코드를 실행하면 오류가 나는 이유는?
		    // 실제로 오류가 나는것처럼 보이진 않지만 상속관계에 있으므로 캐스팅이 필요없다
		 }
		}
		
		
		//Q2. 15번째줄에서	  TestA2 ta 는 클래스의 무엇을 사용할 수 있을까요? TestA2클래스의 a, toString()  코드의 의미 업캐스팅
		//Q3. 15번째줄에서 	  TestB2() 는 클래스의 무엇을 사용할 수 있을까요?	TestB2클래스의 b, toString()
		// A. 1000번지 TestB2 { b=10 / @toString} - TestA2 { a=10 / -----}
		// A. ta {1000번지} = 1000번지 TestB2 { b=10/ [@toString] - TestA2 ( a=10 ] / ------)
		
		System.out.println(ta);	// 04. 출력내용과 이유? [b=10] , 업캐스팅으로 자식요소 출력 	TestA2 vs TestB2
		System.out.println(ta.a); //05. 사용가능?     사용이 가능하다
		System.out.println(ta.b); //06. 사용가능?	   사용이 불가능하다, 타입캐스팅이 명시적으로 필요하다(TestB2)
	}
}
//////////////////////////////////////////////////