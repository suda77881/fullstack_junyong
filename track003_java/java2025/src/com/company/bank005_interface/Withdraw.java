package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Withdraw implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
//		System.out.println("출금하기 기능입니다.");
		
		// 변수
		Scanner sc = new Scanner(System.in);
		// 입력 - 사용자한테 입금할 금액입력받기
		System.out.println("출금할 금액을 입력해주세요 >"); double balance = sc.nextDouble();

		
		// 처리
		UserInfo u = users.get(find);
		u.setBalance(u.getBalance() - balance);
		// 출력
		return 1;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출금하실 금액 입력"); double money = sc.nextDouble();
//		
//		UserInfo u = users.get(find);
//	    u.setbalance(u.getBalance() - money) ;
//	    System.out.println("출금이 완료되었습니다." + u);
//		
//		return 1;
//		
	}



	
	
}
