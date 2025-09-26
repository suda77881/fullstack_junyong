package com.company.java011;

//1. 클래스는 부품객체
//2. 클래스는 상태와 행위
/*  				기본값 	명시적기화  				초기화블록					  생성자
(static)company		null 	="(주) 703toyland"	"(주) 703toyland"				X	Toy.name
(static)num				0	X		0			O 0							X	Toy.age
------------------------------------------------------------------------------------------------
		kitty {name=null, age=0}	유지	                 유지							유지						this.name
		gundam{name=null, age=0}    유지					 유지							{name="건담", age=47}		this.name
*/
// [설계도] 1단계
//class Toy{
//	//상태 : 멤버변수
//	private String  name;	//	인스턴스변수 - heap area - new  O - 생성자 O - this( 각각 )
//	private int 	age;	//  인스턴스변수
//	static final String company="(주) 703toyland";	// Toy.company 	클래스.변수	,	클래스변수 - method - new X- ( now )
//	static int    num;		//	클래스변수	(공용)
//	static { num=0; }
//	//행위 : 멤버함수
//	public void show() {
//		System.out.println("NAME : " + this.name);
//		System.out.println("AGE : " + this.age);
//	}
//	//getter + setter
//	public String getName() { return name; } public void setName(String name) { this.name = name; }
//	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
//	
//	public Toy() { super();  }
//	public Toy(String name, int age) { super(); this.name = name; this.age = age; }	
//}
////////////////////////////////////////////////
public class Class_Repeat {
	public static void main(String[] args) {
		Toy kitty = new Toy();  	// [장난감]2단계 	1)new 메모리, 객체생성 2)생성자호출 3) kitty 번지
//		kitty.name="할로윈키티"; 						// [갖고놀기] 3단계
		kitty.setName("할로윈키티"); kitty.setAge(52); kitty.show();
		Toy gundam = new Toy("건담", 47);	//	[장난감] 갖고놀기 2단계
		gundam.show();
		
	}
}
/////////////////////////////////////////////////
/*	
-------------------------------------------------  
method[클래스정보]
> Toy.class   ,	Class_Repeat.class, Toy.company="(주) 703toyland" , Toy.num=0
-------------------------------------------------
heap[동적]					|  stack [임시저장공간]
2번지 {name="건담", age=47}}		←  gundam (2번지)
1번지 {name="할로윈키티", age=3}}	←  kitty (1번지)
							|	main  
-------------------------------------------------


 */
