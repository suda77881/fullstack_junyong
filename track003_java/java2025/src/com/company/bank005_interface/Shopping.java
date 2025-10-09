package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;


public class Shopping implements BankController {
	
	String ob1;
	double balance;
	int cs = -1;

	@Override public int exec(List<UserInfo> users, int find) {
		Scanner sc = new Scanner(System.in);
		while(!(cs == 4)){
			UserInfo u = users.get(find);
			System.out.println("1.자동차  30,000원");
			System.out.println("2.오토바이 20,000원");
			System.out.println("3.자전거  10,000원");
			System.out.println("4.나가기");
			System.out.print("사고싶은 물건 선택 > " 
			// + users.get(find)
			);int num = sc.nextInt();
			String vh = Bank_Main.veh;
			switch (num) {
			case 1: {System.out.println("자동차 구입");  double balance  = 30000; u.setBalance(u.getBalance() - balance);
			System.out.println("잔액 : " + u.getBalance());
			Bank_Main.veh = "🚗🚗🚗🚗";}continue;		
			case 2: {System.out.println("오토바이 구입"); double balance  = 20000; u.setBalance(u.getBalance() - balance);
			System.out.println("잔액 : " + u.getBalance());
			Bank_Main.veh = "🏍🏍🏍🏍";}continue;		
			case 3: {System.out.println("자전거 구입");  double balance  = 10000; u.setBalance(u.getBalance() - balance);
			System.out.println("잔액 : " + u.getBalance());
			Bank_Main.veh = "🚲🚲🚲🚲";}continue;		
			case 4: {break;}
			}break;
		}
		
		return find;
	}

}
