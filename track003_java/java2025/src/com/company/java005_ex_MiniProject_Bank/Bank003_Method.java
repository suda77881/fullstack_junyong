package com.company.java005_ex_MiniProject_Bank;

import java.util.Scanner;

public class Bank003_Method {
	public static void logon_msg() {System.out.println("╔════════════════╗");
									System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
									System.out.println("║ 확   인   완   료 ║");
									System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
									System.out.println("╚════════════════╝");}
	public static void main(String[] args) {
		// 변수
		int select = 0, age = 0, login = 0, input = 0, money = 0;

		String id = "";
		String pass = "";
		double per = 0.5;	
		int j = 0, j1 = 0, j2 = 0, j3 = 0;
		int fish =0;
		double balance = 0.0;

		String menu = "\n======낚시======\n* 1.사용자등록\n* 2.낚시\n* 3.낚시대 구입\n* " 
		+ "4.물고기판매\n* 5.사용자삭제\n* 6.낚시대 변경\n* 9.종료\n😎😎무엇을 도와드릴까요? >>> ";
		String menu1 = "\n======낚시======\n* 1.사용자등록\n* 2.낚시\n* 3.낚시대 구입\n* " 
		+ "4.물고기판매\n* 5.사용자삭제\n* 6.낚시대 변경\n* 9.종료\n👶🧒무엇을 도와드릴까요? >>> ";
		String menu2 = "\n======낚시======\n* 1.사용자등록\n* 2.낚시\n* 3.낚시대 구입\n* " 
		+ "4.물고기판매\n* 5.사용자삭제\n* 6.낚시대 변경\n* 9.종료\n👨👩무엇을 도와드릴까요? >>> ";
		String menu3 = "\n======낚시======\n* 1.사용자등록\n* 2.낚시\n* 3.낚시대 구입\n* " 
		+ "4.물고기판매\n* 5.사용자삭제\n* 6.낚시대 변경\n* 9.종료\n👨👩무엇을 도와드릴까요? >>> ";
		String tempid = "", temppass = "";

		Scanner sc = new Scanner(System.in);
		// 입력 + 처리+ 출력

//		int scc = (int)(Math.random() * 9000) + 1000; // 1000 ~ 9999
//		System.out.println("보안문자: " + scc);

		System.out.println("WELCOME! (주)낚시연맹");

		for (;;) {
//			System.out.println("현재나이 : "+age); // 디버그용
			System.out.print("" + (age <= 13 && age >= 6 ? menu1 : 
				age >= 18 ? menu2 : age >= 30 ? menu3 : menu));
			select = sc.nextInt();

			switch (select) {

			case 1:
				System.out.println("낚시꾼 등록");
				System.out.print("사용자 이름 입력: >");
				id = sc.next();
				System.out.print("사용자 번호 입력: >");
				pass = sc.next();
				System.out.print("당신의 나이 입력 : >");
				age = sc.nextInt();
				System.out.print("당신의 잔액 입력 : >");
				balance = sc.nextDouble();
				int bnkbook = (int) (Math.random() * 90000000) + 10000000;
				if (balance >= 100000) {
					System.out.print("회원가입을 축하합니다. \n당신은 부자 낚시꾼 입니다");
				} else {
					System.out.println(
							"낚시꾼으로 등록되었습니다." + (age <= 13 ? "어린이 낚시꾼" : 
								age <= 20 ? "어린이 낚시꾼" : age <= 50 ? "어린이 낚시꾼" : "어린이 낚시꾼"));
				}
//				System.out.print("낚시꾼으로 등록되었습니다. : " + bnkbook + "입니다.");

				break;

			case 2:
			case 3:
			case 4:
			case 5:
				if (login == 1) {
				} else {
					System.out.println("사용자 인증이 필요한 기능입니다.");
					System.out.print("사용자 이름을 입력해주세요 >");
					tempid = sc.next();
					System.out.print("사용자 번호를 입력해주세요 >");
					temppass = sc.next();

					if (tempid.equals(id) && pass.equals(temppass)) {
						
						
						logon_msg();
//						System.out.println("╔════════════════╗");
//						System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
//						System.out.println("║ 확   인   완   료 ║");
//						System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
//						System.out.println("╚════════════════╝");
						;
						try {
							Thread.sleep(2000); // 2초 동안 멈춤
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						System.out.println("사용자 정보를 확인해주세요.");
					}
					continue;
				}
				login = 1; // 로그인 성공
			}

			switch (select) {
			
			

			case 2:
				String[] ft = {"붕어", "잉어", "송사리", "금붕어", "피라냐"};
//				System.out.print("🧨🧨🧨🧨🧨🧨\n사용자 이름 : " + id + "\n사용자 번호 : " + pass);
				double chance = (Math.random());
				if (chance < per) {
					System.out.print("🐟🐟🐟🐟🐟🐟🐟🐟🐟🐟🐟🐟\n");
					System.out.print("🐟🐟🐟낚시에 성공했습니다🐟🐟🐟 + \n" + (int)(Math.random() * ft.length)  
									+ " " + (balance / 1000) + "mm\n"); fish += 1;
					System.out.print("\n🐟🐟🐟🐟🐟🐟🐟🐟🐟🐟🐟🐟\n");break;
					//balance += (balance / 1000);
				}
				else {System.out.print("\n🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨");
				System.out.print("🧨🧨🧨🧨🧨🧨낚시 실패🧨🧨🧨🧨🧨🧨\n");
				System.out.print("🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨🧨\n");}
				System.out.printf("\n나이 : %d\n잔액 : %.2f", age, balance);break;
				

			case 3:
//				for (;;) {
//					System.out.println("입금하실 금액을 입력해주세요");
//					money = sc.nextInt();
//					if (money < 0)
//						continue;
//					else {
//						balance += money;
//						money = 0;
//						System.out.println("현재 잔액은 : " + balance + "입니다");
//						System.out.println("입금이 완료되었습니다! 👍");
//						System.out.println("  _____ ");
//						System.out.println(" /     \\");
//						System.out.println("| () () |  입금 완료!");
//						System.out.println(" \\  ^  /");
//						System.out.println("  |||||");
//						System.out.println("  |||||");
//						try {
//							Thread.sleep(2000); // 2초 동안 멈춤
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//						break;
//					}
//				}
				
				int slt = 0;
				double price = 0;
				System.out.println("1. 비싼 낚시대 5,000원"); 
				System.out.println("2. 비싼 낚시대 200,000원"); 
				System.out.println("3. 비싼 낚시대 1,000,000원");
				System.out.print("\n구입할 낚시대를 선택해주세요"); slt = sc.nextInt();
				switch (slt)
				{
					case 1 : price = 5000; j1= 1;break;
					case 2 : price = 200000; j2= 1;break;
					case 3 : price = 1000000; j3= 1;break;
					default: continue;
				}
				balance -= price;
				System.out.println("남은 잔액 : "+ balance);
				break;

			case 4:
//				for (;;) {
//					System.out.print("현재 잔액은 : " + "" + balance + "원 입니다." 
//				+ "\n출금하실 금액을 입력해주세요 : ");
//					money = sc.nextInt();
//					if (money > balance) {
//						System.out.println("잔액이 부족합니다.");
//						continue;
//					}
//					balance -= money;
//					System.out.println("┌────────────┐");
//					System.out.println("│ ₩ 출금 완료! │");
//					System.out.println("└────────────┘");
//					System.out.printf("현재 통장 금액은 : %.2f 원 입니다.", balance);
//					try {
//						Thread.sleep(2000); // 2초 동안 멈춤
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					money = 0;
//					break;
//				}
//				break;
				char ch = ' ';
				System.out.println("현재 물고기는 : " + fish + "마리입니다.");
				System.out.println("모두 판매 하시겠습니까?");ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y') {System.out.println("모두 판매되었습니다.판매한 금액 :" + fish * 500 + "원");}
				balance += fish * 500;
				fish = 0;
				break;
				
			case 5:
				System.out.println("5을 입력하면 이용자 삭제 기능입니다.");
				System.out.println("😥😥😥😥😥😥😥😥😥😥");
				System.out.println("정말로 삭제하겠습니까? (Y/N)");
				String delete = sc.next();
				int scc = (int) (Math.random() * 9000) + 1000;

				System.out.println("보안문자를 따라 입력해주세요. : " + scc);
				int checkscc = sc.nextInt();

				if (scc == checkscc) {

					if (delete.equals("Y") || delete.equals("y")) {
						id = "";
						pass = "";
						pass = "";
						balance = 0.0;
						tempid = "";
						temppass = "";
						age = 0;
						delete = "N";
						login = 0;
						scc = 0;
						checkscc = 0;
						System.out.println("╭────────────────────╮");
						System.out.println("│ 계정이 삭제되었습니다   │");
						System.out.println("│   다음에 또 만나요 　  │");
						System.out.println("╰────────────────────╯");

						try {
							Thread.sleep(2000);
							break; // 2초 동안 멈춤
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else if (delete.equals("n") || delete.equals("N")) {
						System.out.println("취소되었습니다.");
						break;
					} else {
						System.out.println("취소되었습니다.");
						break;
					}
				} else {
					System.out.println("보안문자를 잘못 입력되었습니다.");
					continue;}
			case 6 : 
				
				if (j1 ==1) {System.out.print("1.낡은낚시대\n");}
				if (j2 ==1) {System.out.print("2.평범한낚시대\n");}
				if (j3 ==1) {System.out.print("3.비싼낚시대\n");}	
					System.out.println("어떤 낚시대를 고르시겠습니까?");j = sc.nextInt();
				
				
				switch (j) {
				
				case 1: {System.out.println("낡은 낚시대로 변경되었습니다."); per = 0.5;}break;
				case 2: {System.out.println("평범한 낚시대로 변경되었습니다."); per = 0.7;}break;
				case 3: {System.out.println("비싼 낚시대로 변경되었습니다."); per = 0.95;}break;
				default : {System.out.println("맨손으로 바뀜"); per = 0;}break;
				}
				
			case 9 : {
				System.out.println("9을 입력하면 종료 입니다. 출력구문 까지만"); // exit?
				login = 0;
				break;
			}
			default:
				break;
			} // switch
		} // end for
	} // end main
} // end class
