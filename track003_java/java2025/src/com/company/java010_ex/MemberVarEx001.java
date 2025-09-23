package com.company.java010_ex;

//-- class Sawon3작성해주세요 
//1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오. 
// pay / su, basicpay, basicpay2 / sola, args
//2. 인스턴스메서드, 클래스메서드 구분하시오.
//showAll001(),  / showAll002() , showSu(), main()
//3. 오류나는 이유는?
// 클래스변수는 this를 사용하여 대입할수없다.

class Sawon3{ 
    int pay      =10000;        // 인스턴스변수 - heap area - new O - 생성자 
    static int su=10;     		// 클래스변수 - method area - new x - 생성자 x this x > 바로사용가능
//    static int basicpay=pay;    // 클래스 변수 - method area - new x - 생성자 x > 바로사용 클래스명.basicpay
        					    // ※ static은 this사용 불가 / 당장 사용해야하는데, this를 쓰려면 new 하고 난다음에 
    static int basicpay2;		// 클래스변수 	- method area - new x - 생성자 X > 바로 사용가능하게
    
    //	클래스 메서드 - method area - new X - 생성자 X - Sawon3.showSu() > 바로사용
    public static void showSu() {   System.out.println(su);  }          
    //	클래스 메서드 - method area - new X - 생성자 X - Sawon3.showPay() > 바로사용
    // ※ static은 this 사용 불가 / this. (각각) new 사용
    // public static void showPay() {   System.out.println(this.pay);  }    
  
    // 인스턴스메서드 - heap area - new O - 생성자
    public  void  showAll001() {   
       System.out.println(su);  // static 사용가능 - new 전에 메모리상에 static 올라가 있어서
       System.out.println(this.pay);  // this 사용가능
    } 
    // 클래스 메서드 - method area - new x - 생성자 x - Sawon3.
    public static  void  showAll002() {   
       // showAll001();    // ※	static은 this 사용(인스턴스) 불가
       // System.out.println(this.pay);  
    } 
} 
public class MemberVarEx001{
  public static void main(String[] args) { //args 지역변수
	  	Sawon3   sola = new Sawon3();  //1) new 번지, 객체생성 2) 생성자초기화 3) sola 번지 (지역변수)
	  	sola.showAll001();
  }
}

/*
 * ------------------------[ runtime data area]
 * [method 정보, static, final : 공용정보] 
 * > Sawon3.class / MemberVarEx001.class
 * > static : Sawon3.su , Sawon3.basicpay2 , Sawon3.showSu() , Sawon3. showAll002()
 * ---------------------------------------------------------------------------------
 * [heap : 동적]					| [stack : 잠깐빌리기]
 * 								  showAll001();
 * 1번지{pay , showAll001() }    ← sola[1번지]  32번째줄
 * 					 			| main
 * ---------------------------------------------------------------------------------
 */

