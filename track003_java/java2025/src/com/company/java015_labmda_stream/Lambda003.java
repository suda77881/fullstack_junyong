package com.company.java015_labmda_stream;

class RefClass{		void method(String str) {System.out.println(str);}	}
interface InterUsing{ void inter( RefClass c , String str);	}

public class Lambda003 {
	public static void main(String[] args) {
		//#1. 익명클래스
		InterUsing a1 = new InterUsing() {
			
			@Override public void inter(RefClass c, String str) {c.method(str);}
		};
//		InterUsing a0 = new InterUsing() {
//		
//		c.inter( new RefClass(), "Hello :)");
//		};
		
		
		// InterUsing a1 = (RefClass c, String str)-> {c.method(str);};
		//#2. 람다 ()->{} - [RefClass 클래스] 의 [method 사용]
		//InterUsing a2 = (RefClass c, String str)->{	c.method(str);	};	// 자료형 생략가능
		InterUsing 	 a2 = (	        c,		  str)->{	c.method(str);	};  // 직접 구현
		a1.inter( new RefClass() , "Hello :):)");	// RefClass클래스의 method 사용

		//#3. :: 표현식 (참조)
		InterUsing 	 a3 = 	RefClass::method; //단축 가능		//  자동연결 1) RefClass 2) method
		a3.inter( new RefClass(), "Hello :):):)");
		
		//#4. interface InterBasic{ int method(int a, int b);}
		InterBasic basic = (int a, int b) -> { return Math.max(a, b); }; // Math.max 둘중에 하나 큰거 리턴
		System.out.println(basic.method(10,3));
		
		InterBasic basic2 = (a, b) -> Math.max(a, b); // 자료형 생략가능 리턴값 한줄이면 return, {} 구현부 생략가능
		System.out.println(basic2.method(100,3));
		
		InterBasic basic3 = Math::max; // :: 쓰면 또 생략가능 (리턴값 파라미터?)
		System.out.println(basic3.method(1000,3));
		
		InterBasic basic4 = (a,b)-> Math.min(a, b); // () -> return  뭘받아서 뭘 처리해줄게 패턴만 숙지하면됨
		System.out.println(basic4.method(10, 3));
		
		InterBasic basic5 = Math::min; // ()-> return
		System.out.println(basic5.method(10, 3));
		
		////////////
		//#4. interface					//순서2 ) 어떤클래스 갖고선 어떤거 사용했다.
		InterString basic6 = (a,b) -> a.compareTo(b);	// java.lang.String.compareTo
		System.out.println( basic6.compare("apple", "banana"));	// 음수
		// 문자열이 같으면 0 , a<b 앞 글자 "a"<"b", a가 b보다 앞에온다.(작은것, 음수가 나오는경우), (양수 반환) a>b a가 b보다 뒤에옴
		

		InterString basic7 = String::compareTo;	// java.lang.String.compareTo 순서3)
		System.out.println( basic7.compare("coconut", "banana"));	// 양수
		// 문자열이 같으면 0 , a<b 앞 글자 "c">"b", a가 b보다 (양수 반환) a>b a가 b보다 뒤에옴
		
		InterParse basic8 = s -> Integer.parseInt(s); //Integer paseInt
		System.out.println( basic8.parse("10") + 3);  //13
		
		InterParse basic9 = Integer::parseInt; //Integer parseInt
		System.out.println( basic9.parse("10") + 3);  //13
		
//		InterAbs basic10 = (a)-> {return Math.abs(a);}; // 절대값 반환 = 10 , Math abs 사용
//		InterAbs basic10 =  a ->          Math.abs(a);  // 절대값 10
		InterAbs basic10 =  Math::abs;
		System.out.println( basic10.apply(-10));
		
		//InterPrint basic11 = (s) -> {	System.out.println("Hello Lambda");	};
//		InterPrint basic11 = s -> 	System.out.println(s);
		InterPrint basic11 = System.out::println;	//System.out    println
		basic11.print("Hello Lambda");
		
		// ex1) 람다식을 구현해주세요
		// 힌트 ) System.out.println("hi".length());
		//System.out.println(ex1.getLength("hello"));
		
//		Ex1 ex1 = (s)-> s.length();
		Ex1 ex1 = String::length;
		System.out.println(ex1.getLength("hello")); // 결과 5
		
//		Ex1 ex1 = System.out::println;
//		System.out.println(ex1.getLength("hello"));
		
		// ex2) 람다식을 구현해주세요
		// ex2.getLength("lambda:)");				//결과 출력 - 		lambda:)
		// Ex2 ex2 = (String s) -> {System.err.println(s);};
		Ex2 ex2 = s -> System.out.println(s);
		ex2.print("lambda:) ");					//결과 lambda:)
//		Ex2 ex2.print("");};
		
		
	}
}


interface InterBasic { int method(int a, int b);	    } //(a,b) -> return
interface InterString{ int compare(String a, String b); } //순서1) (a,b) -> return
interface InterParse { int parse(String s);				} //(s) -> return 
interface InterAbs 	 { int apply(int a);				} //(a) -> return
interface InterPrint { void print(String s);				} //(a) -> return
		
interface Ex1        {int getLength (String s); };
interface Ex2 		 {void print(String s); };