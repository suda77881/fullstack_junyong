package com.company.java005;

public class Repeat001_For {
	public static void main(String[] args) {
		// step1	System.out.print() 3번 사용해서 123
		System.out.println("step1");
		System.out.print(	1 + "\t");	//	복사할 구문 → {	}
		System.out.print(	2 + "\t");	// ctrl + c , ctrl + v 2번	{ 구문	}
		System.out.print(	3 + "\t");	// 안에 숫자 2, 3		→	{	구문 변수 } 
		// for(시작; 종료; 변화) {구문}
		
		// step2
		System.out.println("\nstep2");	// {} {변수} for(시작; 종료; 변화)
		for(int i=1; i<=3; i++){
			System.out.print(	i + "\t");
		}
		
		// step3
		System.out.println("\nstep3"); 
		//	1	~ 5
		for(int i=1; i<=5; i++){{System.out.println( i + "\t");}
		System.out.println();
		}
		
		//	11	~ 20
		for(int i=11; i<=20; i++){{System.out.println( i + "\t");}
		System.out.println();
		}
			
		//	3	~ 8
		for(int i=3; i<=8; i++){{System.out.println( i + "\t");}
		System.out.println();
		}
		
		//	1 3 5
		for(int i=1; i<=5; i=i+2){{System.out.println( i + "\t");}
		System.out.println();
		}
		
		//	HELLO1 HELLO2 HELLO3
//		for(int i=1; i <= 3; i++)
//		System.out.print("hello" + 1 + "\t");
//		System.out.print("hello" + 2 + "\t");
//		System.out.print("hello" + 3 + "\t"); System.out.println();
//		
//		{ System.out.println("Hello" + i + "\t");}
		
		
		
	}	// end main

}	// end class
