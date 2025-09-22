package com.company.java009_ex;
import java.util.Scanner;

class AnimalCharacter {
	
	 String name;  
     String type;  // 육식 or 초식  
     int baseSpeed;  
     int specialBoost;  
     double finalSpeed;
     

   public AnimalCharacter(
		   String name, String type, int baseSpeed, 
		   int specialBoost) {
		super();
		this.name = name;
		this.type = type;
		this.baseSpeed = baseSpeed;
		this.specialBoost = specialBoost;

	}
   public AnimalCharacter() {}

   //  행위 - 멤버함수  
    void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println();
    	System.out.print("동물 이름 > "); this.name = sc.next();
    	System.out.print("동물 타입(육식/초식) > "); this.type = sc.next();
    	System.out.print("기본 속도 > "); this.baseSpeed = sc.nextInt();
    	System.out.print("특수 능력치 > "); this.specialBoost = sc.nextInt();
    	
    	
    	//사용자 입력 받기  
    }
    void calculateSpeed()
    {
    	
    	if (this.type.equals("육식")) {this.finalSpeed = this.baseSpeed + (this.specialBoost * 0.2);
    }else {
    	this.finalSpeed = this.baseSpeed + (this.specialBoost * 0.1);
    	}// 타입에 따라 속도 계산 
    	
    	
    	 
    }
    void show() 
    
    {
    	calculateSpeed();
    	System.out.print("\n동물 캐릭터 : " + this.name); 
	System.out.print("\n타입 : " + this.type);
	System.out.printf("\n최종 속도 : %.2f", this.finalSpeed); }
    // 캐릭터 정보 출력

}

public class ClassEx008 {
    public static void main(String[] args) {
        AnimalCharacter a1 = new AnimalCharacter("치타", "육식", 100, 30);
        a1.show();

        AnimalCharacter a2 = new AnimalCharacter();
        a2.input();
        a2.show();
    }
}



//■ 출력내용 
//🦁 동물 캐릭터: 치타
//🌿 타입: 육식
//🚀 최종 속도: 106.00
//
//동물 이름> 토끼
//동물 타입(육식/초식)> 초식
//기본 속도> 60
//특수 능력치> 40
//🦁 동물 캐릭터: 토끼
//🌿 타입: 초식
//🚀 최종 속도: 64.00



