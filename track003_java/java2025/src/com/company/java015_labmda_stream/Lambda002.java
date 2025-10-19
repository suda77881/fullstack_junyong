package com.company.java015_labmda_stream;


////////////////////////////////////////////////////////////
interface InterA2{  void   hi(); }
interface InterB2{  void   hi(String name); }
interface InterC2{  String hi(); }
interface InterD2{  void   hi(int num , String name); }
////////////////////////////////////////////////////////////
public class Lambda002 {
	public static void main(String[] args) {
		//interface InterA2{  void hi(); }
		System.out.println("\n\n[STEP1] 매개변수 X, 리턴값 X");  // InterA2
		//1-1. 익명객체 hi출력
		InterA2 a2 = new InterA2() {@Override public void hi() {System.out.println("hi");}}; 
		a2.hi();
		
		//1-2. 람다식 ()->{}
		InterA2 a21 = () -> System.out.println("hi"); 
		a21.hi();
		
		
		// interface InterB2{  void hi(String name); } 
		System.out.println("\n\n[STEP2] 매개변수 O, 리턴값 X"); 
		//2-1. 익명객체 hi sally!출력
		InterB2 b2 = new InterB2() {@Override public void hi(String name) {System.out.println("hi " + name);} };
		b2.hi("sally");
		
		//2-2. 람다식 ()->{}
		InterB2 b21 = name -> System.out.println("hi " + name);
		b21.hi("sally");
		
		InterB2 b22 = System.out::println;
		b22.hi("hi sally");

		System.out.println("\n\n[STEP3] 매개변수X , 리턴값 O"); 
		//3-1. 익명객체 Good :Day출력
		InterC2 c2 = new InterC2() {@Override public String hi () {return "Good :Day" ; }};
		System.out.println(c2.hi());
		//3-2. 람다식  ()->{}
		InterC2 c21 = () -> "Good :Day";
		System.out.println(c21.hi());
		
		System.out.println("\n\n[STEP4] 매개변수O , 리턴값 O"); 
		//4-1. 익명객체  
//		System.out.println(d.hi( 1, "sally" ));  //hi sally ★★★           
//		System.out.println(d.hi( 2, "sally" ));  //hi sally ★★★★  
		
		InterD2 d2 = new InterD2() {@Override public void hi(int num,String name) {num++;
			System.out.println(num + name);}};
			d2.hi(0,", Sally");

		//4-2. 람다식  ()->{}
			
		InterD2 d21 = (num, name) -> System.out.println(num + name);
		d21.hi(1,", Sally");

	}
}






