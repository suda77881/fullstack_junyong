package com.company.test;

interface InterC2{ String hi(); }			// 파라미터x, 리턴O 	- () -> {return}
interface Ex2 { void print(String s);	}	// 파라미터o, 리턴x 	- (S) -> {	x	}

public class Repeat_251017 {

	public static void main(String[] args) {
		//1-1. 익명객체 (1회성)
		InterC2 ex1 = new InterC2() {
			@Override public String hi() {
				return "Good :Day";
			}
		};
		
		InterC2 ex2 = new InterC2() {
			@Override public String hi() {
				return "Good :Day";
			}
		};
		System.out.println(ex1.hi());
		
		//1-2 람다 () -{}
		InterC2 ex3 = () -> {return "Good:Day";};
		
		//2. 
//		Ex2 ex4 = (s) -> {System.out.print("Good :Day");};
		Ex2 ex4 = System.out::println;	// 어떤클래스의 , 어떤 메서드
		ex4.print("Good :Day");
		
		Ex2 ex5 = s -> System.out.println("1" + s); ex5.print("안녕");

	}

}




//
//



//interface Ex2 { void print(String s); } // (String s) -> x
//
//Ex2 ex2 = (String s) -> {Override void print() {System.out.println("1");}}; ex2.print();



