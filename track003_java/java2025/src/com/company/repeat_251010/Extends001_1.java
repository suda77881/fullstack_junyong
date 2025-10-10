package com.company.repeat_251010;

class A1 extends Object{
	
	int a;
	public A1() {super();}
	public A1(int a) {super(); this.a = a;}

}
class B1 extends A1{
	
	int b;

	public B1() { super();  }

	public B1(int a) { this.b = b;}

	public B1(int a, int b) { super(a); this.b = b; }
	
}

class C1 extends B1{
	int c;

//	public C1() { super();  }
//	
//	public C1(int a) { super(a);  }
//
//	public C1(int a, int b) { super(a, b);  }

	public void showC() {
		System.out.println("상속받은 A클래스의 a:" + a);
		System.out.println("상속받은 B클래스의 b:" + b);
		System.out.println("자신의 멤버 C클래스의 c:" + c);	
	}	
}

public class Extends001_1{
	
	public static void main(String[] args) {
		C1 myc = new C1();
		myc.a = 10; myc.b=20; myc.c=30; myc.showC();
	}
}


// q1 자식 클래스에서 부모 클래스의 모든 멤버변수와 메서드를 사용하기위해
// q2 class 자식 extends 부모 
// q3 extends