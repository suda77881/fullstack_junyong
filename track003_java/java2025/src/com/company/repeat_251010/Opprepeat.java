package com.company.repeat_251010;

class A{
	int a;	// 인스턴스변수	-	heap area - new 0	-	this관련있음 - 각각 지번
	static String company="풀스택개발자과정";	// 클래스변수	-	method area - new X - A.company - this X
	static {	company="MSA풀스택개발자과정";	}
	//void method() {int la;}
	// 지역변수 ★ {}안에서만 사용가능 // 오류나는 위치는 여기~~ 초기화한적이 없음
	// 해결)
	void method() {	int la = 0; System.out.println(la);}	
	
		
	}	// class end
/////////////////////////////////////////
public class Opprepeat {

	public static void main(String[] args) {
//		1. 사용방법 : 설계도 - 장난감조립(new 생성자불러서) - 갖고놀기
//		2. 위의 사용방법 룰이 깨짐.
	System.out.println(A.company);	// 1번만 메모리공간이 만들어지고 바로 직접적으로 사용가능
		
	}

}

////////////////////////////////////
/*	초기화 순서 		:				기본값 			명시적초기화		초기화블록			생성자
시점1) 지금바로사용가능-    company				null			풀스택개발자과정		MSA풀스택개발자과정	
시점2) 필요시 객체만들때마다 생성 - a				0				X 값은 0			x 값은 0			x 값은 0
시점3) 메서드변수 int a					    쓰레기값o			X 쓰레기값o		X 쓰레기값o		x 쓰레기값o
	 new하고 나서 
	 method() 사용할지 말지 모름. - ★지역변수는 개발자가 직접 초기화
[method : 정보보관-공용] A.class, public Repeat002.class / static A.company
-------------------------------------------------------------------------- 
 
 
  
*/