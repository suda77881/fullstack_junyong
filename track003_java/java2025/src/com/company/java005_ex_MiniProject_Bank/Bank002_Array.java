package com.company.java005_ex_MiniProject_Bank;

import java.util.Scanner;

public class Bank002_Array {
	public static void menu() {System.out.print("\n\n== BANK ==\n1. 추가"
					+"\n2. 조회\n3. 입금\n4. 출금\n5. 삭제 > ");}
	public static void main(String[] args) {
      //변수
      String []id=new String[3];
      String []pass = new String[3];
      double []balance = new double[3];
      
      int find = -1;
      int sct = 0, money = 0 ;
      int login = 0;
      Scanner sc = new Scanner(System.in);
      
      
      //menu 6
      char sct2 = ' '; 
      
      
      while(sct != 9){	//	메뉴에서 종료가 눌릴때 까지;
    	  
    	  		menu();
    	  		System.out.print("\n반갑습니다. 무엇을 도와드릴까요? >_"); sct = sc.nextInt();
    	  		
      
      
      //추가
      
      if( sct == 1) { // 아이디 추가 기능
     
  	  for(int i=0; i<id.length; i++) { if(id[i]==null) {find = i; break;}}	// 빈배열을 찾기 = 아이디를 넣을 자리
  			
	  System.out.print("사용하실 아이디를 입력해주세요>_"); 
	  id[find] = sc.next(); // 생성 아이디 입력
  
	  System.out.print("사용하실 비밀번호를 입력해주세요>_"); 
	  pass[find] = sc.next(); // 생성 비밀번호 입력

	  System.out.print("최초 입금 금액을 입력해주세요 >_"); 
	  balance[find] = sc.nextDouble(); // 생성할때 들어가는돈
	  
	  System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊"); 
	  System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊"); 
      System.out.println("🎊🎊🎊🎊가입완료🎊🎊🎊🎊"); 
      System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
	  System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
	  continue;}  // if 1 아이디생성 end find 값 소멸 
      
      
      
      if (sct == 2 ||sct == 3 ||sct == 4 ||sct == 5) {
//    	   System.out.println(id[find] == tempid && pass[find] == temppass);
      if (login == 0) { System.out.println("로그인이 필요한 기능입니다.");
      System.out.print("아이디 입력 >_"); String tempid = sc.next();
      System.out.print("비밀번호 입력 >_"); String temppass = sc.next();
      
      if (id[find] == tempid && pass[find] == temppass) 
      {System.out.println("로그인 성공 🔎🔍🔎🔍"); login = 1;}
      else if (login == 1){    	  
    	  switch (sct) { // 스위치 on
      	  case 2 : { //System.out.println("통장 조회 기능입니다. 미구현입니다.");
      		System.out.print("아이디 : " + id[find] + "\n");
      		System.out.print("비밀번호 : " + pass[find] + "\n");
      		System.out.print("잔액 : " + balance[find] + "\n");}break;

      	  case 3 : { // System.out.println("입금 기능입니다. 미구현입니다.");
      		System.out.println("입금하실 금액을 입력해주세요"); 
      		int inmoney = sc.nextInt(); balance[find] += inmoney;
      		System.out.println("현재 잔액 : " + balance + " + ( " + inmoney +"원 )"); 
      		}break;
          
      	  case 4 : { //System.out.println("출금 기능입니다. 미구현입니다."); 
      		System.out.println("출금하실 금액을 입력해주세요");
      		 int outmoney = sc.nextInt(); balance[find] -= outmoney;
      		System.out.println("현재 잔액 : " + balance + " - ( " + outmoney +"원 )"); }break;
          //삭제
      	  case 5 : {System.out.print("계정 삭제 입니다 \n정말 삭제하시겠습니까?"); 
      	  			String choose = sc.next();
      	  	if (choose.toLowerCase() == "y") {
	      	  	
      	  		for (int i = 0; i<id.length; i++) {
      	  			id[i]= "null";
      	  			pass[i] = "null";
      	  			balance[i] = 0;
      	  			}
	            
	            find = -1;
	            sct = 0;
	            money = 0;
	            login = 0;
      	  		}
      	  }break;
      	  
      	  default : {System.out.println("메뉴로 돌아갑니다.");}break;
      	  
          	}// switch end
    	  
      }
      else {System.out.println("비밀번호가 일치하지 않습니다.");}break;
      
      
      
  	  
      } //login 요구
      
      } //if 2/3/4/5 일때
      System.out.println("종료되었습니다.");
      } // while 메뉴 선택
      

	}// end main
}// end class