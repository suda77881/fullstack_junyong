package com.company.java015_labmda_stream;

//1. 클래스는 부품객체 - 설계도(틀, can do this~!)
//2. 상태 + 행위     - interface( public static final  / public abstract  )
///////////////////////////////////////////////////////////////////////////
interface Inter11{  void method();   }
class Inter11Impl implements Inter11{ 
	@Override public void method() { System.out.println("Hello :D"); }
}
///////////////////////////////////////////////////////////////////////////
public class Lambda001_2 {
	public static void main(String[] args) {
		//#1. interface  구현객체(자식)
		// 부모	  = 자식
		Inter11 i0 = new Inter11Impl(); i0.method();
		//#2. 익명이너클래스 ( test목적, 1번쓰고 버릴목적, 잘안쓰는 이벤트 )
		// Inter1 i2  = new Inter1();  interface 는 추상메서드이기때문에 new사용못함.
		Inter11 i1 = new Inter11Impl() {
			@Override public void method() 
		{System.out.println("일회용 Hello :D");}};
		i1.method();

		//#3. lambda 
		Inter11 i2 = () -> {System.out.println("용량줄이기");};
		i2.method();

	}
}







