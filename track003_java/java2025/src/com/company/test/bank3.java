package com.company.test;

import java.util.Scanner;

public class bank3 {
   public static void main(String[] args) {
      // 변수
      int num; String id, pass; double balance; 

      Scanner scanner = new Scanner(System.in);
      // 입력+처리+출력

      for (;;) {
         System.out.println("====== BANK ======\n*" + "1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n* 입력>>>");

         int a = scanner.nextInt();
         if (a == 9) { System.out.println("atm을 종료합니다.");break;}

         switch (a) {
         case 1: 
            System.out.println("1을 입력하면 추가기능입니다.");
            
            System.out.println("아이디 입력>");
             id = scanner.next();
            //아이디입력 > _입력받기
             System.out.println("비밀번호 입력>");
             pass = scanner.next();
            //비밀번호입력 > _입력받기
             System.out.println("잔액 입력>");
             balance = scanner.nextDouble();
            //잔액입력 > _입력받기
            break;
            
         case 2: 
            System.out.println("2를 입력하면 조회기능입니다.");
            //변수
            String tempid, temppass;
            //입력 2-1 사용자에게 임시아이디와 임시비밀번호 입력받기
            System.out.println("임시아이디 입력>");
            tempid = scanner.next();
            //    2-2 아이디와 임시아이디가 같아야하고 비번과 임시비밀번호가 같다면 사용자 정보출력
            //    2-3 다르면 정보를 확인해주세요
            //처리 
            //출력
         break;
         
         case 3:
            System.out.println("3을 입력하면 입금기능입니다.");            
            break;
            
         case 4:
            System.out.println("4를 입력하면 출금기능입니다.");            
            //잔액입력 > _입력받기
            break;
            
         case 5:
            System.out.println("5을 입력하면 삭제기능입니다.");
            break;

         
         }

      } // end for

   } // end main
} // end class

/*
 * 하루에 하나씩 힌트
 * 
 * 
 * Step1. 무한반복으로 만드는 메뉴 만들기
 * 
 * for(;;){//1-1 무한반복} 1-2 빠져나올조건 9 1-3 입력받은 번호가 if or switch 1을 입력하면 추가기능입니다.
 * 출력구문까지만 2를 입력하면 조회기능입니다. 출력구문까지만 3을 입력하면 추가기능입니다. 출력구문까지만 4를 입력하면 조회기능입니다.
 * 출력구문까지만 5을 입력하면 추가기능입니다. 출력구문까지만 9를 입력하면 조회기능입니다. 출력구문까지만
 * 
 * Step2. 무한반복으로 만드는 메뉴 만들기 //아이디입력 > _입력받기 //비밀번호입력 > _입력받기 //잔액입력 > _입력받기 ///
 * Step2
 */