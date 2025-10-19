package com.company.java015_labmda_stream;

////////////////////////////////////////////////////////////
interface InterA22{  void   hi(); }
interface InterB22{  void   hi(String name); }
interface InterC22{  String hi(); }
interface InterD22{  void   hi(int num , String name); }
////////////////////////////////////////////////////////////
public class Lambda002_2 {
	public static void main(String[] args) {
		//interface InterA2{  void hi(); }
		System.out.println("\n\n[STEP1] 매개변수 X, 리턴값 X");  // InterA2
		//1-1. 익명객체 hi출력
		InterA22  a = new InterA22() {
			@Override public void hi() { System.out.println("hi"); }
		}; a.hi();
		//1-2. 람다식 ()->{}
		InterA22  a2 = ()->{ System.out.println("hi2"); };  a2.hi();
		InterA22  a3 = ()->  System.out.println("hi3");     a3.hi(); //처리할일이 한줄 {}생략
		InterA22  a4 = System.out::println; a4.hi();
		
		// interface InterB2{  void hi(String name); } 
		System.out.println("\n\n[STEP2] 매개변수 O, 리턴값 X"); 
		//2-1. 익명객체 hi sally!출력
		InterB22 b = new InterB22() {
			@Override public void hi(String name) { System.out.println("hi! " + name); }
		}; b.hi("sally");
		//2-2. 람다식 ()->{}
		InterB22 b2 = (String name)->{ System.out.println("hi! " + name); };
		b2.hi("alpha");
		InterB2 b3 = (name)->{ System.out.println("hi! " + name); };
		b3.hi("buja");
		InterB2 b4 =  name ->  System.out.println("hi! " + name);  
		b4.hi("빨강이");
		
		// interface InterC2{  String hi(); } 
		System.out.println("\n\n[STEP3] 매개변수X , 리턴값 O"); 
		//3-1. 익명객체 Good :Day출력
		InterC22 c = new InterC22() {
			@Override public String hi() { return "Good :Day"; } 
		};  
		System.out.println( c.hi() );
		
		//3-2. 람다식  ()->{}
		InterC22 c2 = ()->{ return "G:ood Day"; };
		System.out.println(c2.hi());

		InterC22 c3 = ()->  "G:ood :Day";  
		System.out.println(c3.hi());
		
		//interface InterD2{  void   hi(int num , String name); }
		System.out.println("\n\n[STEP4] 매개변수O , 리턴값 O"); 
		//4-1. 익명객체  
		InterD22 d = new InterD22() {

			@Override
			public void hi(int num, String name) {
				String star ="";
				for (int i = 0; i < num ; i++) {
					star += "★";
				}
				System.out.println(name + star);
			}};
			d.hi(3, "hi Sally ");
			d.hi(4, "hi Sally ");
		
		         
		 //hi sally ★★★★      
		
		//4-2. 람다식  ()->{}
			
	InterD22 d2 = (num, name) -> {String star =""; for (int i = 0; i < num ; i++) { star += "★"; } System.out.println(name + star);};
//				d2.hi(3, "hi Sally ");
	
	
		d2.hi(3, "hi Sally ");
		d2.hi(4, "hi Sally ");
//		InterD2 d3 = new InterD2 () {@Override public String hi(int num, String name) {
//			String star = "";
//			for(int i=0; i<num; i++) {star += "★";}
//			return "hi " + name + star;			
//		};};
		
//		System.out.println(d3.hi(3, ", Sally")); //hi sally ★★★    
		 //hi alpha sally ★★★          
		 //hi alpha sally ★★★★  
		

	}
}






