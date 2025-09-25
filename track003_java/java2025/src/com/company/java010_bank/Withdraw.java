package com.company.java010_bank;

import java.util.Scanner;

public class Withdraw {
	
	
	//상태 : 멤버변수
		UserInfo userinfo;
		
		
		// 상태 : 멤버변수
		
		public Withdraw() { super(); }
		public Withdraw(UserInfo userinfo) { super(); this.userinfo = userinfo;}

		public void exec() {
			
			// 변수선언
			double money = 0;
			Scanner sc = new Scanner(System.in);
			
			// setter / getter 이용해서 사용자에게 출금받기 ###
			System.out.println("출금할 금액입력 > "); money = sc.nextDouble();
			System.out.println("출금하실 금액은 :" + money + "원 입니다.");
			this.userinfo.setBalance(this.userinfo.getBalance() - money);
			System.out.println("잔액은 : " + this.userinfo.getBalance() + "원 입니다.");
			
			
		}
}

/* 기능 : 계좌에서 출금 
 *  [ -id:String, -pass:String, -balance:double] 
 * 
 */