package com.company.test;
import java.util.Scanner;
public class bank2 {
	
	public static void main(String[] args) {
		//변수  int num 
		int select = 0, age = -1, money= 0, input=0; double balance = 0.0;
		
		char id = ' ', pass=' ';
		
		
		String menu = "\n======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력 >>> ";
		
		Scanner sc = new Scanner(System.in);
		// 입력 + 처리+ 출력
		
		System.out.println("WELCOME! (주)CODEJOHNS BANK");

		System.out.print(menu); select = sc.nextInt();
		
		for (;;) {
		switch (select) 
		{
		
		case 1 :  System.out.print("아이디 입력:"); id = sc.next().charAt(0); 
					 if (id == 'a') {System.out.print("비밀번호 입력:"); pass = sc.next().charAt(0); }
				else if (pass == 'a') {System.out.print("나이"); age = sc.nextInt();}
					 
				else if (!(id == 'a')) {System.out.print("다시 확인해주세요(아이디)");}
				   System.out.print(menu); select = sc.nextInt();
				  break;
		
		case 2 : { System.out.println("2을 입력하면 조회기능입니다. 출력구문 까지만");
					System.out.print(menu); select = sc.nextInt();
					
				//아이디 입력 >_ 입력받기
					
					String tempid, temppass;
					
					System.out.println("아이디입력 >"); tempid=sc.next();
					System.out.println("비밀번호입력 >"); temppass = sc.next();
				//비밀번호입력 >_ 입력받기
				//잔액입력    >_ 입력받기
					
					if ( tempid.equals(id) && temppass.equals(pass) ) {
						System.out.println("사용자정보");
						System.out.println("id > " + id);
						System.out.println("pass > " + pass);
						System.out.println("balance > " + balance);
					}else {System.out.println("정보를 확인해주세요.");}
		}break;
		case 3 : { System.out.println("3을 입력하면 입금기능입니다. 출력구문 까지만");
					System.out.print(menu); select = sc.nextInt();
			
		}
		case 4 : { System.out.println("4을 입력하면 출금기능입니다. 출력구문 까지만");
					System.out.print(menu); select = sc.nextInt();
			
		}
		case 5 : { System.out.println("5을 입력하면 삭제기능입니다. 출력구문 까지만");
					System.out.print(menu); select = sc.nextInt();
			
		}
		case 9 : { System.out.println("9을 입력하면 종료 입니다. 출력구문 까지만");break;
			
		}
			default : continue;
		}
			break;
		}// end for

			
		
		
	
			
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
