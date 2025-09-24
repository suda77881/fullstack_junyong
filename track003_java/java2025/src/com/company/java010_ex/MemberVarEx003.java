package com.company.java010_ex;

//- 문제 1. 다음 코드에서 인스턴스변수, 클래스변수, 지역변수를 구분하시오.  ( 보관되는 영역도 추가 )
// 클래스 (method) trayCount, totalFood, maxRice / 인스턴스 (heap) owner, rice, soup,  / 지역 (stack) tray1, tray2
//- 문제 2. 인스턴스메서드와 클래스메서드를 구분하시오.  
// 인스턴스 getFoodAmount, showTray  / 클래스 showTrayCount, showOwner
//- 문제 3. 오류가 발생하는 이유를 설명하시오.
// 클래스 변수에서는 인스턴스 변수를 사용 / 대입 받을 수 없다, 우회필요
//- 문제 4. runtime data area 위치영역 그림그리기
//   method (클래스정보)
// heap(인스턴스정보) | stack(지역정보)
//- 문제 5. 다음과 같이 출력되도록 코드를 작성하시오.
//:: 주인 이름: std-1
//총 음식량: 175
//전체 급식판 수: 1
//
//
//:: 주인 이름: std-2
//총 음식량: 175
//전체 급식판 수: 2
/*
				초기값	명시적초기화	초기화블록		생성자
//////////////////////////////////////////////////////
trayCount         0			=0		   x0      1  공용으로사용관련X
maxRice           0         =100       x100       생성자안에서 클래스변수 사용가능
//////////////////////////////////////////////////////
owner           null      x null     


*/

class LunchTray {
  static String owner;        
  int rice = 90;               
  int soup = 85;      
  
  static int num = 0;
  
  static int trayCount = 0;      

//  static int totalFood = rice + soup;

  static int maxRice = 100;       

  public int getFoodAmount() {
      return rice + soup;         
  }

  public static void showTrayCount() {
      System.out.println("전체 급식판 수: " + ++trayCount);  
      
  }

//  public static void showOwner() { 
//     System.out.println(owner);
//  }

  public void showTray() {
	  
      System.out.println("\n\n:: 주인 이름: " + (owner = "std-" + ++trayCount ));                
      System.out.println("총 음식량: " + getFoodAmount());     
  }
}


public class MemberVarEx003 {
 public static void main(String[] args) {
	 
	 
      LunchTray tray1 = new LunchTray();   // 1. new(메모리,객체) 2) 생성자(인스턴스변수초기화사용가능) 3) tray1 주소
      tray1.showTray();                    
      LunchTray.showTrayCount();         // 클래스, 메서드

      LunchTray tray2 = new LunchTray();   
      tray2.showTray();                   
      LunchTray.showTrayCount();         
 }
} 

/*
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보]
> 1. LunchTray.class , MemberVarEx003.class
> 2. LunchTray.trayCount		, LunchTray.maxRice ,
	 LunchTray.showTrayCount()	, LunchTray.showOwner()
------------------------------------
[heap: 동적]                      | [stack : 잠깐빌리기]
									tray2(2번지).showTray();
2번지{owner=std-2,rice=90,soup=85} ← tray[2번지] 
								    tray(1번지).showTray();
1번지{owner=null.rice=90,soup=85}  ← tray1[1번지]
						         | main
------------------------------------
*/




