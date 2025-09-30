package com.company.java012_ex;

//Q1. 상속도 그리기


//	Object
//    ↑
//   Papa	{money = 10000 / sing - GOD}
//    ↑
//   Son	{money = 1500  / sing - 빅뱅}


//Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
// Papa - money | sing(); / 
// Son - money | @sing(); - Papa.money, Papa.sing();



class Papa extends Object{  
	   int money = 10000;     
	   public Papa() { super(); }
	   public void sing() {  System.out.println("GOD-거짓말");  }
	}// end class
	class Son extends Papa{ 
	   int money = 1500;
	   public Son() { super(); }
	   @Override public void sing() {  System.out.println("빅뱅-거짓말"); }
	} // end class


///////////////////////////////////////////////////////////
	public class PolyEx004 {
	   public static void main(String[] args) { 
	      Papa mypapa = new Son(); // 부모 = 자식 (업캐스팅 / 타입캐스팅 필요없음)
	      
	      // Q3. Papa mypapa 의미?
	      // Papa 자료형 쓸 수 있어! 
	      // Q4. 인스턴스화한 실제 메모리 빌려온 그림
	      // Son 객체
	      //  ㄴ  Papa | money = 10000
	      //  ㄴ  Son  | money = 1500
	      //  ㄴ       | sing  = 빅뱅-거짓말(@Override)
	      
	      System.out.println(mypapa.money); // Q5.  출력   : money = 10000
	      mypapa.sing();  //Q6. 출력  : sing = 빅뱅 - 거짓말
	       //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.  
	        System.out.println(((Son)mypapa).money); 
	        // 타입캐스팅을 통해 자식 변수에도 접근가능
	   }
	}
////////////////////////////////////////////////////////////