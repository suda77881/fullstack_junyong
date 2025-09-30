package com.company.java012_ex;


// 상속도

// Object
//   ↑
// Parent7	{x = 100; method()}
//   ↑
// Child7	{x = 200; @method()} - {x = 100; method()}


class Parent7  extends Object{
	   int x = 100;
	   public Parent7() { super(); }
	   void method() { System.out.println("Parent Method"); }
	} 
	class Child7 extends Parent7 {
	   int x = 200;
	   public Child7() { super(); }
	   @Override  void method() { System.out.println("Child Method"); }
	   void papaMethod() {super.method();}
	}
	public class PolyEx005 {
	   public static void main(String[] args) {
	      Parent7 p = new Child7();     
	      // Q3.  Parent7 p   보장하는 범위      {x= 100; method()}
	      // Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()   
	      // {x = 200; @method()} - {x = 100; method()}
	      // System.out.println(((Parent)c).x); // 부모의 x 출력 (100) (자식기준으로 부모 타입캐스팅)
	      
	                            Child7 c = new Child7();     
	      System.out.println("p.x = " + p.x);  // Q5. 출력되는 내용   100
	      p.method();  // Q6. 출력되는 내용     	Child Method(Override) > 호출은 Parent7.method(); 실제 출력은 Child.method();
	      System.out.println("c.x = " + c.x);   // Q7. 출력되는 내용  200
	      c.method();   // Q8. 출력되는 내용   		Child Method
	      //Q9. main 에서 부모메서드 호출하기? - Parent Method
	      //	       ((Parent7)p).method(); // X 오버라이딩 된 메서드를 직접호출하는건 불가( 덮어썼기 때문에 불가능)
	      ((Parent7)p).method();
	      c.papaMethod();	// 자식에서 부모호출가능
	      ((Child7)p).papaMethod();	// 타입 캐스팅 - 부모가 자식클래스 호출가능 (자식생성자를 호출시)
	   }
	}