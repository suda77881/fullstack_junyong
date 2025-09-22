package com.company.java009_ex;


//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class Student001{
	//멤버변수
	String name; int no, kor, eng, math;
	//멤버함수
	void info(){
		System.out.println("이름 : " + this.name);
		System.out.println("총점 : " + (this.kor + eng + math));
		System.out.printf("평균 : %.2f" , (this.kor + eng + math)/3.0);
	}
	
	
}

////////////////////////////////////////////////////////////////////////////

public class ClassEx001{
	   public static void main(String[] args) {
	      Student001   s1 = new Student001();
	     s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
	     s1.info();
	   }
	}
////////////////////////////////////////////////////////////////////////////
/*	■	Student001	 s1 = new Student001();
----------------------------[runtime data area]
[method: 정보, static, final : 공용정보]
	Student001.class , classEx001.class			1)
-----------------------------------------------
[heap: 동적]			  						 | [stack : 잠깐빌리기]
												s1.info(){}
1번지 {name=first, no11, kor=100, eng=100, math=99} ← s1[1번지]
s1.name = "first", s1.name
					   			 			 | main 2)
-----------------------------------------------
*/
