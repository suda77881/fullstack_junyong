package com.company.test;

import java.util.Scanner;

public class Bank4 {


	public static void main(String[] args) {
		// 변수 int num
		int select = 0, age = 0, login = 0, input = 0, money = 0;
		
		String id = "";
		String pass = "";

		double balance = 0.0;

		String menu = "\n======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력 >>> ";
		String tempid = "" , temppass = "";
		
		Scanner sc = new Scanner(System.in);
		// 입력 + 처리+ 출력

		System.out.println("WELCOME! (주)CODEJOHNS BANK");

		

		for () {
			
			System.out.print(menu); select = sc.nextInt();
			
			switch (select) {
			
				case 1 :  
					System.out.println("추가기능입니다.");System.out.print("아이디 입력: >");id = sc.next();
					System.out.print("비밀번호 입력: >");pass = sc.next();
					System.out.print("나이 입력 : >");age = sc.nextInt();
					System.out.print("잔액 입력 : >");balance = sc.nextDouble();
				  break;
			
			
			case 2 : case 3 : case 4 : case 5 : {
				
				System.out.print("아이디를 입력해주세요 >");	tempid = sc.next();
				System.out.print("비밀번호를 입력해주세요 >");temppass = sc.next();
				
				if (tempid.equals(id) && pass.equals(temppass)) 
				{
				
				switch (select) {
				
				case 2 : System.out.print("🧨🧨🧨🧨🧨🧨\n아이디 : " + id + "\n비밀번호 : " + pass);
						System.out.printf("\n나이 : %d\n잔액 : %.2f", age, balance); {break;}
							
				
				case 3 : for (;;) {
							System.out.println("입금하실 금액을 입력해주세요");
							money = sc.nextInt();
							if (money < 0)continue;
							else {
							balance += money; 
							money = 0;
							System.out.println("현재 잔액은 : " + balance + "입니다");
							break;}}break;
														
				
				case 4 : for (;;) {System.out.print("현재 잔액은 : "+""+balance+"원 입니다."
													+ "\n출금하실 금액을 입력해주세요 : ");
							money = sc.nextInt();
							if (money > balance) {continue;}
							balance -= money;
							System.out.println("남은 금액은 : " + balance + "원 입니다.");
							money = 0;
							break;
							}
							break;
				case 5 : System.out.println("5을 입력하면 삭제기능입니다.");
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
					System.out.println("삭제되었습니다.");break;}
					else if (delete.equals("n") || delete.equals("N"))
					{System.out.println("취소되었습니다.");break;}
					else {System.out.println("취소되었습니다.");break;}
				
				}
				}else {System.out.println("정보를 확인해주세요.");}break;}
					
				
			
			case 9: {
				System.out.println("9을 입력하면 종료 입니다. 출력구문 까지만");
				login = 0;
				break;}
			default:break;
				} // switch			
			} // end for
		} // end main

	}// end class

