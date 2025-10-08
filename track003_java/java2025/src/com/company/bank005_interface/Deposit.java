package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Deposit implements BankController {


	@Override
	public int exec(List<UserInfo> users, int find) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("입금하실 금액 입력"); double money = sc.nextDouble();
		
//		for (int i = 0; i<users.size(); i++) {
//		if (users.get(i).getBalance() >= 1) {
			UserInfo u = users.get(find);
		    u.setBalance(u.getBalance() + money) ;
//		    System.out.println("입금이 완료되었습니다.\n" + u);
		    System.out.println("현재 잔액 : " + u.getBalance() + " 원");
//			};
//			}
		
		return find;
		
	}
}
