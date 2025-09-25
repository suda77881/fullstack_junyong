package com.company.java010_bank;

import java.util.Scanner;


// 1. 클래스는 부품객체
// 2. 상태와 행위


public class Deposit {
	//상태 : 멤버변수
	UserInfo userinfo;
	
	
	// 상태 : 멤버변수
	
	
	
	public Deposit() { super(); }
	public UserInfo getUserinfo() { return userinfo; }
	public void setUserinfo(UserInfo userinfo) { this.userinfo = userinfo; }
	public Deposit(UserInfo userinfo) { super(); this.userinfo = userinfo;}

	public void exec() {
		// setter / getter 이용해서 사용자에게 입금받기 ###
		Scanner sc = new Scanner(System.in);
		// 변수
		double money = 0;
		// 입력	- 사용자에게 입금할 금액입력받기
		System.out.println("입금할 금액입력 > "); money = sc.nextDouble();
		// 처리	- setter를 이용해서 입금한 금액 셋팅하기
		this.userinfo.setBalance(this.userinfo.getBalance() + money);
		// 출력	- 입금이 완료되었습니다. 출력
		System.out.println("입금이 완료되었습니다. \n잔액 : " + this.userinfo.getBalance() + "(+ " + money + ")원 " );
	}
	
	
	
}


/* 기능 : 계좌에 입금
 */