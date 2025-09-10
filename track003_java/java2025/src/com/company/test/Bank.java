package com.company.test;

import java.util.Scanner;

public class Bank {


	public static void main(String[] args) {
		// 변수 int num
		int select = 0, age = 0, login = 0, input = 0, money = 0;
		
		

		String id = "", pass = "";

		double balance = 0.0;

		String menu = "\n======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력 >>> ";
		String tempid = "" , temppass = "";
		
		Scanner sc = new Scanner(System.in);
		// 입력 + 처리+ 출력

		System.out.println("WELCOME! (주)CODEJOHNS BANK");

		

		for (;;) {
			
			System.out.print(menu); select = sc.nextInt();
			
			switch (select) {
			
			
//			case 2 : case 3 : case 4 : case 5 : {
//				System.out.print("아이디를 입력해주세요 >");	tempid = sc.next();
//				System.out.print("비밀번호를 입력해주세요 >");temppass = sc.next();
//				
//				switch (select) {
//				
//				case 2 : System.out.println("2을 입력하면 조회기능");
//				case 3 : 
//				case 4 : 
//				case 5 :
//			}
			case 1:
				if (login == 1) {System.out.println("현재 로그인중 입니다.");}
				else 
				System.out.println("추가기능입니다.");System.out.print("아이디 입력: >");id = sc.next();
				System.out.print("비밀번호 입력: >");pass = sc.next();
				System.out.print("나이 입력 : >");age = sc.nextInt();
				System.out.print("잔액 입력 : >");balance = sc.nextDouble();
			break;
			
			case 2:
				System.out.println("2을 입력하면 조회기능입니다. 출력구문 까지만");

				// 변수

				// 입력 2-1. 사용자에게 임시 아이디와 임시 비밀번호 입력받기
				
//				if (login == 0) {
				System.out.print("아이디를 입력해주세요 >");
				tempid = sc.next();
				System.out.print("비밀번호를 입력해주세요 >");
				temppass = sc.next();
//				}
				
				

				// 2-2. 아이디와 임시아이디가 같아야하고 비번과 임시비밀번호가 같다면 사용자정보출력
				
				if (tempid.equals(id) && pass.equals(temppass)) {login = 1;
					System.out.print("🧨🧨🧨🧨🧨🧨\n아이디 : " + id + "\n비밀번호 : " + pass);
					System.out.printf("\n나이 : %d\n잔액 : %.2f", age, balance);

				// 2-3. 다르면 정보를 확인해주세요.
					
				}else {System.out.println("정보를 확인해주세요.");}
			break;

			// 아이디 입력 >_ 입력받기
			// 비밀번호입력 >_ 입력받기
			// 잔액입력 >_ 입력받기

			case 3 :
			
				
				if (login == 0) {
					System.out.print("아이디를 입력해주세요 >");
					tempid = sc.next();
					System.out.print("비밀번호를 입력해주세요 >");
					temppass = sc.next();}
					
				
if (id.equals(tempid) && pass.equals(temppass)) {login = 1;
		for (;;) {System.out.println("입금하실 금액을 입력해주세요");
						money = sc.nextInt();
						if (money >= 1);
						else if (money < 0) continue;
						break;
						
					}
					balance += money; 
					money = 0;
					
					System.out.println("현재 잔액은 : " + balance + "입니다");
				} else {
					System.out.println("정보를 확인해주세요.");
				}
				
//				System.out.println("3을 입력하면 입금기능입니다. 출력구문 까지만");
				
				
				

			break;
					// 변수
				// 입력	사용자에게 임시아이디와 임시비밀번호 입력받기
				// 처리	if (아이디와 임시아이디가 같고 비번과 임시비밀번호가 같다면 ){돈입력받아서, 잔애겡 추가}
				// 출력  else {아니라면}
			
			case 4 : 
				
				if (login == 0) {
					System.out.print("아이디를 입력해주세요 >");
					tempid = sc.next();
					System.out.print("비밀번호를 입력해주세요 >");
					temppass = sc.next();}
					
				
				for (;;) {
				if (id.equals(tempid) && pass.equals(temppass)) 
				{login = 1;System.out.print("현재 잔액은 : "
						+ ""+balance+"원 입니다.\n출금하실 금액을 입력해주세요 : ");
				money = sc.nextInt();
				if (money > balance) {continue;}
				balance -= money;
				System.out.println("남은 금액은 : " + balance + "원 입니다.");
				money = 0;
				break;
				}
				else {System.out.println("정보를 확인해주세요.");}
				break;
				}
				break;
			
			case 5: 
				System.out.println("5을 입력하면 삭제기능입니다.");
				//변수
				
				//입력
				System.out.print("아이디를 입력해주세요 >");
				tempid = sc.next();
				System.out.print("비밀번호를 입력해주세요 >");
				temppass = sc.next();
				
				if(id.equals(tempid) && pass.equals(temppass)) {login = 1;
					System.out.println("정말로 삭제하겠습니까? (Y/N)"); String delete = sc.next();
					if (delete.equals("Y") || delete.equals("y") ) { 
					id = "";
					pass= "";
					balance = 0.0;
					tempid = "";
					temppass = "";
					age = 0;
					delete = "N";
					login = 0;
					System.out.println("삭제되었습니다.");}
					else if (delete.equals("n") || delete.equals("N")) 
					{System.out.println("취소되었습니다.");}
					else {System.out.println("취소되었습니다.");}
				}
					
				//정보 리셋?

			break;
			case 9: {
				System.out.println("9을 입력하면 종료 입니다. 출력구문 까지만");
				login = 0;
				break;

			}
			default:
				break;
			}
		} // end for

//		if (!(id == "a")){System.out.println("아이디 입력 : "); id = sc.next();
//		}
//		break;
//		
//		if (!(pass == "a")) {System.out.println("비밀번호 입력"); pass = sc.next();
//		}
//		break;

		// Step1. 무한반복으로 만드는 메뉴만들기

		// for(;;){ // 1-1 무한반복
		// 1-2 빠져나올 조건 9
		// 1-3 입력받은 번호가 if or switch (메뉴선택)
		//

		// 1을 입력하면 추가기능입니다. 출력구문 까지만
		// 2을 입력하면 조회기능입니다. 출력구문 까지만
		// 3을 입력하면 입금기능입니다. 출력구문 까지만
		// 4을 입력하면 출금기능입니다. 출력구문 까지만
		// 5을 입력하면 삭제기능입니다. 출력구문 까지만
		// 9을 입력하면 종료입니다. 출력구문 까지만
//		}

//		System.out.println("나이 입력"); age = sc.nextInt();
//		System.out.println("잔액 입력"); money = sc.nextInt();

		// 입력 >> 1 >> 아이디>> 비밀번호 >> 나이 >> 잔액
		// 입력 >> 2 >> 아이디 >> 비밀번호 >> 나이 >> 잔액

	}// end main

} // end class
