package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;


public class Shopping implements BankController {
	
	String ob1;
	double balance;
	int cs = -1;

	@Override
	public int exec(List<UserInfo> users, int find) {
		
		Scanner sc = new Scanner(System.in);
		while(!(cs == 4)){
			UserInfo u = users.get(find);
			System.out.println("자동차 10,000,000원");
			System.out.println("오토바이 8,000,000원");
			System.out.println("컴퓨터  5,000,000원");
			
			System.out.print("사고싶은 물건 선택 > " + users.get(find));int num = sc.nextInt();
			
			switch (num) {
			case 1: {System.out.println("자동차 구입");  double balance  = 10000000; u.setBalance(u.getBalance() - balance);
			System.out.println("잔액 : " + u.getBalance());}
			case 2: {System.out.println("오토바이 구입"); double balance  = 8000000; u.setBalance(u.getBalance() - balance);
			System.out.println("잔액 : " + u.getBalance());}
			case 3: {System.out.println("컴퓨터 구입");  double balance  = 5000000; u.setBalance(u.getBalance() - balance);
			System.out.println("잔액 : " + u.getBalance());}
			case 4: {break;}
			}
			
			
		}
		
		return 1;
	}

}
