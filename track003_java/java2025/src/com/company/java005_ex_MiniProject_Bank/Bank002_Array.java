package com.company.java005_ex_MiniProject_Bank; 
import java.util.Scanner;

public class Bank002_Array {
   public static void main(String[] args) {
      //변수
      String []id=new String[3];
      String []pass = new String[3];
      double []balance = new double[3];
      
      int sct = 0, money = 0 ;
      
      Scanner sc = new Scanner(System.in);
      
      
      //menu 6
      char sct2 = ' '; 
      
      
      for (;;) {
      System.out.print("반갑습니다. 무엇을 도와드릴까요? >_"); sct = sc.nextInt();
      
      switch (sct) {
      //추가
      if (sct == 1) System.out.println("아이디 추가 기능입니다. 미구현입니다.");
      
      
      for (int i = 0; i < id.length; i++ )
      {
    	  System.out.println("사용하실 아이디를 입력해주세요>_"); id[i] = sc.next(); 
      }
      for (int i = 0; i < pass.length; i++ )
      {
    	  System.out.println("사용하실 비밀번호를 입력해주세요>_"); pass[i] = sc.next(); 
      }
      for (int i = 0; i < balance.length; i++ )
      {
    	  System.out.println("금액을 입력해주세요 >_"); balance[i] = sc.nextDouble(); 
      }
 
      
    
      //조회
      if (sct == 2) {
    	  
    	  System.out.println("통장 조회 기능입니다. 미구현입니다.");}
      //입금
      if (sct == 3) {System.out.println("입금 기능입니다. 미구현입니다.");}
      {
    	  System.out.println("입금하실 금액을 입력해주세요");
      }
      }
      //출금
      if (sct == 4) {System.out.println("출금 기능입니다. 미구현입니다.");}
      //삭제
      if (sct == 5) {System.out.println("삭제 기능입니다. 미구현입니다.");}
      //종료
      if (sct == 9) {System.out.println("종료 기능입니다. 미구현입니다.");}
      	}
      break;}
      
   }// end main
}//end class