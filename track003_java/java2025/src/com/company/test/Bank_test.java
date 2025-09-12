package com.company.test;

import java.util.Scanner;

public class Bank_test {

	public static void main(String[] args) {
		// 변수
		int select = 0, age = 0, login = 0, input = 0, money = 0;

		String id = "";
		String pass = "";

		double balance = 0.0;

		String menu = "\n======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* " 
		+ "4.출금\n* 5.삭제\n* 9.종료\n😎😎무엇을 도와드릴까요? >>> ";
		String menu1 = "\n======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* " 
		+ "4.출금\n* 5.삭제\n* 9.종료\n👶🧒무엇을 도와드릴까요? >>> ";
		String menu2 = "\n======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* " 
		+ "4.출금\n* 5.삭제\n* 9.종료\n👨👩무엇을 도와드릴까요? >>> ";
		String menu3 = "\n======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* " 
		+ "4.출금\n* 5.삭제\n* 9.종료\n👨👩무엇을 도와드릴까요? >>> ";
		String tempid = "", temppass = "";

		Scanner sc = new Scanner(System.in);
		// 입력 + 처리+ 출력

//		int scc = (int)(Math.random() * 9000) + 1000; // 1000 ~ 9999
//		System.out.println("보안문자: " + scc);

		System.out.println("WELCOME! (주)CODEJOHNS BANK");

		for (;;) {
//			System.out.println("현재나이 : "+age); // 디버그용
			System.out.print("" + (age <= 13 && age >= 6 ? menu1 : 
				age >= 18 ? menu2 : age >= 30 ? menu3 : menu));
			select = sc.nextInt();

			switch (select) {

			case 1:
				System.out.println("추가기능입니다.");
				System.out.print("아이디 입력: >");
				id = sc.next();
				System.out.print("비밀번호 입력: >");
				pass = sc.next();
				System.out.print("나이 입력 : >");
				age = sc.nextInt();
				System.out.print("잔액 입력 : >");
				balance = sc.nextDouble();
				int bnkbook = (int) (Math.random() * 90000000) + 10000000;
				if (balance >= 100000) {
					System.out.print("회원가입을 축하합니다. \n당신은 VIP입니다");
				} else {
					System.out.println(
							"반갑습니다." + (age <= 13 ? "어린이 고객님" : 
								age <= 20 ? "학생 고객님" : age <= 50 ? "성인 고객님" : "고객님"));
				}
				;
				System.out.print("고객님의 통장이 개설 되었습니다.\n계좌번호는 : " + bnkbook + "입니다.");

				break;

			case 2:
			case 3:
			case 4:
			case 5:
				if (login == 1) {
				} else {
					System.out.println("로그인이 필요한 기능입니다.");
					System.out.print("아이디를 입력해주세요 >");
					tempid = sc.next();
					System.out.print("비밀번호를 입력해주세요 >");
					temppass = sc.next();

					if (tempid.equals(id) && pass.equals(temppass)) {
						login = 1;
						System.out.println("╔════════════════╗");
						System.out.println("║ 🎉로그인 성공!🎉 ║");
						System.out.println("╚════════════════╝");
						;
						try {
							Thread.sleep(2000); // 2초 동안 멈춤
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						System.out.println("정보를 확인해주세요.");
					}
					continue;
				}
			}

			switch (select) {

			case 2:
				System.out.print("🧨🧨🧨🧨🧨🧨\n아이디 : " + id + "\n비밀번호 : " + pass);
				double chance = (Math.random());
				if (chance < 0.5) {
					System.out.print("이자가 입금되었습니다. + " + (balance / 1000) + "원");
					balance += (balance / 1000);
				}
				System.out.printf("\n나이 : %d\n잔액 : %.2f", age, balance); {
				break;
			}

			case 3:
				for (;;) {
					System.out.println("입금하실 금액을 입력해주세요");
					money = sc.nextInt();
					if (money < 0)
						continue;
					else {
						balance += money;
						money = 0;
						System.out.println("현재 잔액은 : " + balance + "입니다");
						System.out.println("입금이 완료되었습니다! 👍");
						System.out.println("  _____ ");
						System.out.println(" /     \\");
						System.out.println("| () () |  입금 완료!");
						System.out.println(" \\  ^  /");
						System.out.println("  |||||");
						System.out.println("  |||||");
						try {
							Thread.sleep(2000); // 2초 동안 멈춤
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}
				}
				break;

			case 4:
				for (;;) {
					System.out.print("현재 잔액은 : " + "" + balance + "원 입니다." 
				+ "\n출금하실 금액을 입력해주세요 : ");
					money = sc.nextInt();
					if (money > balance) {
						System.out.println("잔액이 부족합니다.");
						continue;
					}
					balance -= money;
					System.out.println("┌────────────┐");
					System.out.println("│ ₩ 출금 완료! │");
					System.out.println("└────────────┘");
					System.out.printf("현재 통장 금액은 : %.2f 원 입니다.", balance);
					try {
						Thread.sleep(2000); // 2초 동안 멈춤
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					money = 0;
					break;
				}
				break;
			case 5:
				System.out.println("5을 입력하면 삭제기능입니다.");
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
				}
				continue;

			case 9: {
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
