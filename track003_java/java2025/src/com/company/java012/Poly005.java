package com.company.java012;


/*
			Object
			  ↑
			Animal	{ name; age;	}
			 ↑  ↑
		   Cat	{number; show()}
 */

/*
Object
  ↑
Animal	{ name; age;	}
 ↑  ↑
Person		{jumin; show()}				하나의 타입으로 여러변수를 관리하려고.
*/   

class Animal{
     String name; int age;
	 public Animal() { super();  }	// Object() 컴파일러가 자동생성 X > 오버로딩과 상속시
	 public Animal(String name, int age) { super(); this.name = name; this.age = age; } 
	 public void show() {System.out.println("Animal");}
}	// 
class Cat	 extends Animal{
	String number;
	public void show() {System.out.println("CAT > " + super.name + "/" + super.age);}
}
class Person extends Animal{
	String jumin;
	public void show() {System.out.println("Person > " + super.name + "/" + super.age);}
	
}
/////////////////////////////////////////////
public class Poly005 {
	public static void main(String[] args) {
		// 하나의 타입(부모)으로 여러타입의 객체(자식들)를 관리
		// 부모               = 자식 / 업캐스팅 / 타입캐스팅 X
		Animal [] anis = {	new Cat() , new Cat() , new Person(), new Person()	}; 
		//1. 보장 : { name ; age; / show()}
		//2. 			= new Cat { number ,   @show() } - Animal{name; age; / show()}
		//1. 보장 : { name ; age;}
		//				= new Person { jumin , @show() } - Animal{name; age; / -------}
		Animal controller = null;
		controller = anis[0]; controller.show();
		controller = anis[1]; controller.show();
		controller = anis[2]; controller.show();
		controller = anis[3]; controller.show();
	}
}
//////////////////////////////////////////////