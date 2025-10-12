package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Chatting implements BankController {

	@Override public int exec(List<UserInfo> users, int find) {
		Scanner sc = new Scanner(System.in);
		int menu  = -1;
		int menu2 = -1;
		System.out.println("안녕하세요 (●'◡'●)");
		System.out.println("챗봇 서비스 입니다.");
		System.out.println("무엇을 도와드릴까요"); 
		System.out.println("1. 대출상담\n2. 환전\n3. 카드발급\n4. 통장관련문의\n0. 상담원연결\n"); 
		menu = sc.nextInt();
		UserInfo u = users.get(find);

		switch (menu) {
		
		case 1:System.out.print("반갑습니다 대출 상담 서비스입니다. ^_^ \n현재 고객님의 이용가능 상품은 `1천만원 대출, 금리 16%` 상품입니다. \n이용하시겠습니까? 이용하시려면 1번을 취소하시려면 2번 > ")
		;menu2 = sc.nextInt();  if (menu2 == 1) {u.setBalance(u.getBalance() + 10000000);System.out.println("현재 잔액 : " + u.getBalance() + " 원");
		Bank_Main.veh = "채무 -11,600,000";break;}else {System.out.println("취소");break;}
		case 2:System.out.print("환전서비스 입니다 1달러(1,418.97원)입니다 환전 하시겠습니까? :-D \n이용하시려면 1번을 취소하시려면 2번 > ");menu2 = sc.nextInt();
		if (menu2 == 1) {u.setDbalance(u.getBalance() / 1418.97);
		u.setBalance(0);
		System.out.printf("현재 잔액 : %.2f 달러\n", u.getDbalance());
		break;}else {System.out.println("취소");break;}
		case 3:System.out.print("카드를 발급 받으시겠습니까? (쇼핑 적립금 5% 교통카드 5% 환급) \n이용하시려면 1번을 취소하시려면 2번 > ")
		;menu2 = sc.nextInt();  if (menu2 == 1) {Bank_Main.veh = "🎴🎴🎴🎴";System.out.println("카드발급이 완료되었습니다.");break;}else {System.out.println("취소");break;}
		case 4:System.out.println("통장 관련 문의는 상담원 연결 서비스를 이용해주세요.");break;
//		case 5:System.out.println();
//		case 6:System.out.println();
//		case 7:System.out.println();
//		case 8:System.out.println();
		case 9:System.out.println("상담종료 메인메뉴로 돌아갑니다.");break;
		case 0:System.out.println("공휴일에는 상담 서비스를 지원하지 않습니다.");break;
		default:System.out.println("잘못된 입력입니다.");break;
		
		}
		
		return find;
	}

}
