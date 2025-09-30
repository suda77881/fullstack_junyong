package com.company.java012_ex;

//Q1. 상속도를 그리시오. 

//	  Object
//		↑
//    TestA3
//      ↑
//	  TestB3



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
    /* 
     TestB3 tb = (TestB3) new TestA3(); 
     */
    //Q2. TestB3 tb는 클래스의 무엇을 사용할 수 있을까요? A: {b=10, @toString} - {a=10, -------}
    //Q3. T(TestB3) new TestA3() 클래스의 무엇을 사용할 수 있을가요? A: 		   {a=10, toString()}
    //Q4. 코드상에서는 문제가 없는데 코드를 실행하면 오류가 나는 이유는? 
    // tb : {b=10, @toString} - {a=10, ------} = 					1000번지{a=10, toString()}
    // 		{b=10, }이부분을 객체생성한적이 없음.
    
    //Q2. 15번째줄에서   TestB3  tb는 클래스의 무엇을 사용할수 있을까요? 
    // tb에 대입되는 참조주소와 객체는 TestA3의 것 (a, toString), TestB3로 선언되었지만 멤버가 존재하지 않으므로 
    // (TestB3)로 형변환이 이루어지면 두가지 클래스의 정보를 모두 사용할수 없다.

    //Q3. 15번째줄에서   T(TestB3) new TestA3() 클래스의 무엇을 사용할 수 있을까요?
    //   사용이 불가능하다.
    //Q4. 코드상에서는 문제가 없는데 코드를 실행하면 오류가 나는 이유는?
    // 	형변환이 일어나서 TestA3의 변수와 메서드를 사용불가

 }
}