package com.company.java005_ex_MiniProject_Bank;

import java.util.Scanner;

public class Ex2_array {

	public static void user(int find) {
		if (find == 1) {
			System.out.print("안녕하세요 어린이 친구 👶🧒");
		} else if (find == 2) {
			System.out.print("안녕하세요 청소년 👦👧");
		}
	}
	
	public static void logino(int find, String[] id, String[] pass, int[] login, int []bnkbook) {	if (login[find] == 0) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 인증이 필요한 기능입니다.");
		System.out.print("사용자 이름을 입력해주세요 >");String tempid = sc.next();
		System.out.print("사용자 번호를 입력해주세요 >");String temppass = sc.next();

		if (tempid.equals(id[find]) && pass[find].equals(temppass)) {

			System.out.println("╔═══════════════════╗");
			System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
			System.out.println("║  인   증   완   료  ║");
			System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
			System.out.println("╚═══════════════════╝");
			System.out.println("🤸‍♂️ " + bnkbook[find] + "번째 회원님 반갑습니다 🤸‍♂️");
			login[find] = 1; // 로그인 성공
			try {
				Thread.sleep(2000); // 2초 동안 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("사용자 정보를 확인해주세요.");
		}

	}
	}
	

	public static void main(String[] args) {
		// 변수
		int []login = new int[3];
		

//		String id = "";
//		String pass = "";
		double per = 0.5;
		int j = 0, j1 = 0, j2 = 0, j3 = 0;
		int fish = 0;
//		double balance = 0.0;

		int find = -1;
		int find2 = -1;

		int fmenu = 0;

		int[] number = { 1, 2, 3 };

		int[] bnkbook = { 1, 2, 3 };
		int[] blowfish = new int[3];
		int[] carp = new int[3];
		int[] shrimp = new int[3];
		int[] shark = new int[3];
		int[] whale = new int[3];

		String[] id = new String[3];
		String[] pass = new String[3];
		double[] balance = new double[3];
		
//		int[] login1 = new int[3];

		int select1 = 0;
		int select = 0, age = 0, input = 0, money = 0;

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

		while (select1 != 9) {
//			System.out.println("현재나이 : "+age); // 디버그용
			System.out.print("" + (age <= 13 && age >= 6 ? menu1 : age >= 18 ? menu2 : age >= 30 ? menu3 : menu));
			select1 = sc.nextInt();

			
			switch (select1) { 
			
			// 메인메뉴 선택

			case 1:
				for (int i = 0; i < id.length; i++) {
					if (id[i] == null) {
						find = i;
						break;
					}
				} // 빈배열을 찾기 = 아이디를 넣을 자리
				System.out.println("낚시꾼 등록");
				System.out.print("사용자 이름 입력: >");
				id[find] = sc.next();
				System.out.print("사용자 번호 입력: >");
				pass[find] = sc.next();
//				System.out.print("당신의 나이 입력 : >");
//				age[find] = sc.nextInt();
				balance[find] += 10000000;
				System.out.println("낚시꾼 초기 자본 입금");
				System.out.println(balance[find] + "원");
//				balance[find] = sc.nextDouble();
//				bnkbook[find] = (int) (Math.random() * 9) + 1; // 회원번호

//				if (balance[find] >= 100000) {
//					System.out.print("회원가입을 축하합니다. \n당신은 부자 낚시꾼 입니다");
//				} else {
//					System.out.println(
//							"낚시꾼으로 등록되었습니다." + (age <= 13 ? "어린이 낚시꾼" : 
//								age <= 20 ? "어린이 낚시꾼" : age <= 50 ? "어린이 낚시꾼" : "어린이 낚시꾼"));
//				}
				System.out.println("╔═══════════════════╗");
				System.out.println("║ 🎉🎉🎉🎉🎉🎉🎉🎉 ║");
				System.out.println("║  가   입   완   료  ║");
				System.out.println("║ 🎉🎉🎉🎉🎉🎉🎉🎉 ║");
				System.out.println("╚═══════════════════╝");
				 
				for (int i = 0; i < bnkbook.length; i++) {
					if (bnkbook[i] == 0) {
						find2 = i;
						break;
					}
				} // 빈배열을 찾기 = 아이디를 넣을 자리
				
				System.out.print("낚시꾼으로 등록되었습니다.\n당신은 " + bnkbook[find] + "번째 회원 입니다.");
				select1 = 0;
				try {
					Thread.sleep(2000); // 2초 동안 멈춤
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;


				

			


			case 2:
				logino(find, id, pass, login, bnkbook);
				if (login[find] == 0) {System.out.println("로그인 실패 메뉴로");break;}
				int retry = 0;
				while (retry != 2) {
					System.out.println("미끼를 던졌습니다.");
					try {
						Thread.sleep(1000); // 2초 동안 멈춤
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("무언가 걸렸습니다.");
					try {
						Thread.sleep(1000); // 2초 동안 멈춤
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					int scc2 = (int) (Math.random() * 9000) + 1000;

					System.out.println("낚시대를 잡아당겨주세요 > " + scc2);
					int checkscc2 = sc.nextInt();
					double chance = (Math.random());
					if (chance < per && scc2 == checkscc2) {

						double height = Math.random() * 10000;
						String[] ft = { "🐡복어🐡", "🐟잉어🐟", "🦐새우🦐", "🦈상어🦈", "🐳고래🐳", "👢버러진 장화👢" };
						// 🦈🐬🐳🐋🐟🐠🐡🦐🦈🐬🐳🐋🐟🐠🐡🦐
						String fishName = ft[(int) (Math.random() * ft.length)];

						System.out.println("╭────────────────────╮");
						System.out.println("│      ><(((º>       │");
						System.out.println("╰────────────────────╯");

						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						int fishSize = 0;

						if (fishName == "🐡복어🐡") {
							System.out.println("복어");
							blowfish[find] += 1;
							fishSize = (int) (Math.random() * 500);
						} else if (fishName == "🐟잉어🐟") {
							System.out.println("잉어");
							carp[find] += 1;
							fishSize = (int) (Math.random() * 300);
						} else if (fishName == "🦐새우🦐") {
							System.out.println("새우");
							shrimp[find] += 1;
							fishSize = (int) (Math.random() * 100);
						} else if (fishName == "🦈상어🦈") {
							System.out.println("상어");
							shark[find] += 1;
							fishSize = (int) (Math.random() * 5000);
						} else if (fishName == "🐳고래🐳") {
							System.out.println("고래");
							whale[find] += 1;
							fishSize = (int) (Math.random() * 50000);
						} else if (fishName == "👢버러진 장화👢") {
							System.out.println("낚시줄이 망가져 500원이 감소했다. 😖😖");

						}
						;
						balance[find] -= 500;
						System.out.println("🤘🤘🤘 낚시에 성공했습니다! 🤘🤘🤘");
						System.out.println("🎣 잡은 물고기: " + fishName);
						System.out.println("📏 크기: " + fishSize + "mm");
//					fish += 1;
						try {
							Thread.sleep(1000); // 2초 동안 멈춤
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						System.out.println("1. 계속");
						System.out.println("2. 메뉴로");
						System.out.print("선택해주세요>");
						retry = sc.nextInt();
						if (retry == 1) {
							select = 1;
							continue;
						} else if (retry == 2)
							select = 0;
						break;
						// balance += (balance / 1000);

					} else {

						System.out.println("╭────────────────────╮");
						System.out.println("│     물고기가  도망쳤다  │");
						System.out.println("╰────────────────────╯");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						System.out.println("1. 계속");
						System.out.println("2. 메뉴로");
						System.out.print("선택해주세요>");
						retry = sc.nextInt();
						if (retry == 1) {
							select = 1;
							continue;
						} else if (retry == 2)
							select = 0;select1 = 0;break;

					} // else end
				}break;
					// whlie end

			case 3:
				logino(find, id, pass, login, bnkbook);
				if (login[find] == 0) {System.out.println("로그인 실패 메뉴로");break;}
				int slt = 0;
				double price = 0;
				for (;;) {
					System.out.println("1. 낡은 낚시대 (확률 50 %) 5,000원");
					System.out.println("2. 평범한  (확률 70 %) 200,000원 ");
					System.out.println("3. 비싼 낚시대 (확률 95 %) 1,000,000원");
					System.out.println("4. 나가기");
					System.out.print("\n구입할 낚시대를 선택해주세요");
					slt = sc.nextInt();

					switch (slt) {

					case 1:
						price = 5000;
						j1 = 1;
						balance[find] -= price;
						System.out.println("남은 잔액 : " + balance[find]);
						continue;
					case 2:
						price = 200000;
						j2 = 1;
						balance[find] -= price;
						System.out.println("남은 잔액 : " + balance[find]);
						continue;
					case 3:
						price = 1000000;
						j3 = 1;
						balance[find] -= price;
						System.out.println("남은 잔액 : " + balance[find]);
						continue;
					case 4:
						break;
					default:
						continue;
					}
					break;
				}
				continue;
			case 4:
				logino(find, id, pass, login, bnkbook);
				if (login[find] == 0) {System.out.println("로그인 실패 메뉴로");break;}
				char ch = ' ';

				System.out.println("현재 물고기 ");
				System.out.println("================================== ");
				System.out.println("복어 : " + blowfish[find] + "마리 (1500원)");
				System.out.println("잉어 : " + carp[find] + "마리 (500원)");
				System.out.println("새우 : " + shrimp[find] + "마리 (200원)");
				System.out.println("상어 : " + shark[find] + "마리 (8000원)");
				System.out.println("고래 : " + whale[find] + "마리 (50000원)");
				System.out.println("================================== ");
				System.out.println("모두 판매 하시겠습니까? (Y/N) >");
				ch = sc.next().charAt(0);
				if (ch == 'y' || ch == 'Y') {
					System.out.println("모두 판매되었습니다.판매한 금액 :" + ((carp[find] * 500) + (blowfish[find] * 1500)
							+ (shrimp[find] * 200) + (shark[find] * 8000) + (whale[find] * 50000)) + "원");
				}
				balance[find] += (carp[find] * 500) + (blowfish[find] * 1500) + (shrimp[find] * 200)
						+ (shark[find] * 8000) + (whale[find] * 50000);
				System.out.println("현재 잔액 : " + balance[find]);
				carp[find] = 0;
				blowfish[find] = 0;
				shrimp[find] = 0;
				shark[find] = 0;
				whale[find] = 0;
				break;

			case 5:
				logino(find, id, pass, login, bnkbook);
				if (login[find] == 0) {System.out.println("로그인 실패 메뉴로");break;}
				System.out.println("5을 입력하면 이용자 삭제 기능입니다.");
				System.out.println("😥😥😥😥😥😥😥😥😥😥");
				System.out.println("정말로 삭제하겠습니까? (Y/N)");
				String delete = sc.next();
				int scc = (int) (Math.random() * 9000) + 1000;

				System.out.println("보안문자를 따라 입력해주세요. : " + scc);
				int checkscc = sc.nextInt();

				if (scc == checkscc) {

					if (delete.equals("Y") || delete.equals("y")) {
						for (int i = 0; i < id.length; i++) {
							id[i] = "";
							pass[i] = "";
							balance[i] = 0.0;

						}
						tempid = "";
						temppass = "";
						age = 0;
						delete = "N";
						login[find] = 0;
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
					continue;
				}break;
			case 6:
				logino(find, id, pass, login, bnkbook);
				if (login[find] == 0) {System.out.println("로그인 실패 메뉴로");break;}

				if (j1 == 1) {
					System.out.print("1.낡은낚시대\n");
				}
				if (j2 == 1) {
					System.out.print("2.평범한낚시대\n");
				}
				if (j3 == 1) {
					System.out.print("3.비싼낚시대\n");
				}
				System.out.println("어떤 낚시대를 고르시겠습니까?");
				j = sc.nextInt();

				switch (j) {

				case 1: {
					System.out.println("낡은 낚시대로 변경되었습니다.(확률 50 %)");
					per = 0.5;
				}
					break;
				case 2: {
					System.out.println("평범한 낚시대로 변경되었습니다. (확률 70 %)");
					per = 0.7;
				}
					break;
				case 3: {
					System.out.println("비싼 낚시대로 변경되었습니다. (확률 95 %)");
					per = 0.95;
				}
					break;
				default: {
					System.out.println("맨손으로 바뀜");
					per = 0;
				}
					break;
				}break; // ✅ 이거 없으면 case 9로 넘어가서 login = 0 됨!

			case 9: {

				login[find] = 0;
				break;
			}
			default:
				continue;
			}
		}
		System.out.println("종료되었습니다."); // exit? // end while 종료
	} // end main
} // end class
