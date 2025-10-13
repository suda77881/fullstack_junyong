package com.company.java014_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class ListEx003 {
	// 아이스크림 가게
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<IceCreamDTO> ice = new ArrayList<>();
		
			System.out.println("❄️🍦 Welcome to the Magical IceCream Land 🍦❄️\r\n"
				+ "✨ 오늘도 달콤한 하루가 시작됩니다! ✨\r\n"
				+ "🛎️ 손님~ 어떤 아이스크림을 원하시나요?");
	    
		
		int select= -1;
				 
		while(!(select == 0)) {
			
			System.out.println("🍧 IceCream Menu 🍧");
			System.out.println("1️ 아이스크림 추가");
			System.out.println("2️ 아이스크림 목록 보기");
			System.out.println("3️ 아이스크림 제거");
			System.out.println("4️ 아이스크림 존재 확인");
			System.out.println("5️ 총 아이스크림 개수");
			System.out.println("0️ 종료");
			System.out.print("👉 선택:");select = sc.nextInt();
					
	    switch(select) {
	    
	    case 1: {	// 아이스크림 추가
	    	
	    	System.out.println("아이스크림 추가 ");
	    	System.out.print("아이스크림 이름: "); String name = sc.next();
	    	System.out.print("가격: "); int price = sc.nextInt();
	    	System.out.println(name + "추가 완료!"); 
	    	ice.add(new IceCreamDTO(name, price)); } break;
	    
	    case 2 : {
	    	System.out.println(ice);}break;	// toString 호출
	    
	    //X
	    case 3 : {
	    	System.out.println("제거할 아이스크림 이름: "); String tempName = sc.next();
	    	int no=-1;
	    		for (IceCreamDTO i : ice) {
//	    			System.out.println("ice.size : " + ice.size() + "\ni.getNo" + i.getNo());
	    			if (i.getName().equals(tempName)) 
	    			{
	    				 no = i.getNo();
	    				}
	    		}
	    		if (!(no == -1)) {ice.remove(no); 
    			System.out.println("제거완료!");}
	    		else {System.out.println("해당 아이스크림이 존재하지 않습니다.");
    			}break;
	    }
			
	    case 4 : { 	// 리스트 안에있나 찾기
	    			System.out.println("5-4. 아이스크림 존재 확인\n");
	    			System.out.println("확인할 아이스크림 이름: "); 
	    			
	    			String name = sc.next();
	    					

	    					for (IceCreamDTO i : ice) {
	    							
		    					if (i.getName().equals(name)) {
			    					System.out.println("존재합니다!");
			    					break;}
			    				else if (ice.size()-1 == i.getNo()) {System.out.println("존재하지않습니다.");}
	    					}
	    		}break;
	    
	    case 5 : {System.out.println("총 아이스크림 개수: " + ice.size());    }	// 길이
	    
	    case 0 : {System.out.println("아이슼크림 가게를 닫습니다. 다음에 또 만나요!");}break;
	    default : {System.out.println("잘못된 입력입니다. 다시 선택해주세요.");}
	    			
	    }	// switch end
	    
		}	// while end
	    
		
		
		
	}

}

class IceCreamDTO{
	
	private String		  name;
	private int  		 price;
	private final  int 		no;
	private static int cnt = 0;
	
	
	public IceCreamDTO() { 	super(); this.no = cnt++;  }
	public IceCreamDTO(String name, int price) { this.no = cnt++;
	this.name = name; this.price = price; }
	

	public String getName() { return name; }  public void setName(String name) { this.name = name; }


	public double getPrice() {
		return price;
	}

	public void setPrice(int price) { this.price = price; }  public static int getCnt() { return cnt; }

	public static void setCnt(int cnt) { IceCreamDTO.cnt = cnt; }  public int getNo() { return no; }


	@Override public String toString() { return name + " ( " + price + " ) "; }
	
	
	public int menu (int select) {
						
		return select;
	}
	
}

/*
🍨 연습문제) List와 DTO를 활용한 아이스크림 가게 시뮬레이션
패키지명 : com.company.java014_ex 
클래스명 : ListEx003

1. 문제 개요
아래 조건에 맞게 ListEx003.java 파일을 작성하고, 콘솔에서 실행되는 결과를 예측하시오. 
이 프로그램은 아이스크림 가게를 운영하는 시뮬레이션으로, 
사용자의 입력에 따라 아이스크림을 추가, 제거, 확인, 출력하는 기능을 포함한다.

2. 클래스 구조
클래스명   역할   주요 메서드
IceCreamDTO   아이스크림 정보 저장 DTO      / getName(), getPrice(), toString()
ListEx004   메인 실행 클래스   main(), List 활용

- IceCreamDTO는 이름과 가격을 저장하는 데이터 객체
- ListEx004                클래스는 List<IceCreamDTO>를 활용하여 아이스크림을 추가, 출력, 제거, 검색
- add, get, size, remove, contains 메서드를 모두 활용

3. 요구사항
- IceCreamDTO 클래스를 정의하고, 
이름과 가격을 저장할 수 있도록 생성자 및 getter 작성
- ListEx004 클래스에서 List<IceCreamDTO>를 생성하고, add() 메서드로 아이스크림 추가
get() 메서드로 목록 출력, size()로 개수 확인
contains() 또는 stream().anyMatch()로 특정 아이스크림 존재 여부 확인
removeIf()로 특정 아이스크림 제거
메뉴는 무한 반복 구조로 구성되어 사용자가 0을 입력할 때까지 계속 실행됨
각 메뉴 선택 시 출력되는 메시지를 보고 프로그램의 흐름을 이해할 것

4. 콘솔 출력 흐름
🎉 프로그램 시작 시 
❄️🍦 Welcome to the Magical IceCream Land 🍦❄️  
✨ 오늘도 달콤한 하루가 시작됩니다! ✨  
🛎️ 손님~ 어떤 아이스크림을 원하시나요?  
--------------------------------------------------
📋 메뉴판 
🍧 IceCream Menu 🍧  
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택:

5. 각 메뉴 선택 시 출력 메시지
5-1. 아이스크림 추가 
아이스크림 이름: [사용자 입력]  
가격: [사용자 입력]  
[입력한 이름] 추가 완료!

5-2. 아이스크림 목록 보기
리스트가 비어있을 경우:
현재 아이스크림 목록:  
아직 등록된 아이스크림이 없습니다.

아이스크림이 있을 경우:
현재 아이스크림 목록:  
- 초코 (1500원)  
- 바닐라 (1300원)

5-3. 아이스크림 제거 
제거할 아이스크림 이름: [사용자 입력]  
제거 완료!   또는   해당 아이스크림이 존재하지 않습니다.

5-4. 아이스크림 존재 확인

확인할 아이스크림 이름: [사용자 입력]  
존재합니다!   또는   존재하지 않습니다.

5-5. 총 아이스크림 개수
총 아이스크림 개수: [리스트 크기]

5-6. 종료
아이스크림 가게를 닫습니다. 다음에 또 만나요!

6. 추가 조건 (선택 사항)
Scanner를 사용하여 사용자 입력을 처리할 것
ArrayList<IceCreamDTO>를 사용하여 아이스크림 목록을 저장할 것
toString() 메서드를 오버라이드하여 출력 형식을 예쁘게 만들 것
이모지를 활용하여 콘솔 출력이 재미있고 직관적으로 보이도록 할 것


전체출력화면 ) 
❄️🍦 Welcome to the Magical IceCream Land 🍦❄️
✨ 오늘도 달콤한 하루가 시작됩니다! ✨
🛎️ 손님~ 어떤 아이스크림을 원하시나요?
--------------------------------------------------

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 1
🍓 아이스크림 이름: white
💰 가격: 1500
✅ white 추가 완료!

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 1
🍓 아이스크림 이름: choco
💰 가격: 1800
✅ choco 추가 완료!

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 1
🍓 아이스크림 이름: mango
💰 가격: 2000
✅ mango 추가 완료!

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 2
🍨 현재 아이스크림 목록:
- white (1500원)
- choco (1800원)
- mango (2000원)

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 3
🗑️ 제거할 아이스크림 이름: mango
🧹 제거 완료!

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 2
🍨 현재 아이스크림 목록:
- white (1500원)
- choco (1800원)

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 4
🔍 확인할 아이스크림 이름: mango
❌ 없습니다!
 

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 4
🔍 확인할 아이스크림 이름: white
✅ 존재합니다!

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 5
📦 총 아이스크림 개수: 2

🍧 IceCream Menu 🍧
1️ 아이스크림 추가
2️ 아이스크림 목록 보기
3️ 아이스크림 제거
4️ 아이스크림 존재 확인
5️ 총 아이스크림 개수
0️ 종료
👉 선택: 0
👋 아이스크림 가게를 닫습니다. 다음에 또 만나요!

 */ 
