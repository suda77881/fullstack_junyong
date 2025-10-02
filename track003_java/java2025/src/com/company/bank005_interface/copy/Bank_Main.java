package com.company.bank005_interface.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank_Main {
	// 멤버변수
	private List <UserInfo> users;	// add, get, size, remove, contains
	private BankController [] controller;
	
	
	public List<UserInfo> getUsers() { return users; } public void setUsers(List<UserInfo> users) { this.users = users; } public BankController[] getController() { return controller; } 
	public void setController(BankController[] controller) { this.controller = controller; }
	public Bank_Main() { 
		users		= new ArrayList<>();	
		controller  = new BankController[]{
				new Login() , new Add(), new Show(),
				new Deposit(), new Withdraw(), new Delete()
		};
	}
	// 멤버함수	(메뉴판)
	public void menu() {
		//변수
		
		//입력 + 처리
			// 1. 유저추가
			// 2,3,4,5,
			// 1) Login 2) 2,3,4,5 각각에서 처리해야할일
		
		
//		while(!(num == 9)){
//			
//		}
		int num =-1;
		Scanner sc = new Scanner(System.in);
		while ((!(num == 9))) {
			
			System.out.println(
					"메뉴를 선택해주세요 > \n[1] 계좌 추가 \n[2] 계좌 조회 \n[3] 입금하기 \n[4] 출금하기 \n[5] 계좌 삭제");
			num = sc.nextInt();
			
			switch(num) {
			
			case 1: {System.out.println("계좌 추가 기능입니다.");controller[num].exec(users);}break;
			case 2 : case 3: case 4 : case 5: {
				
//				if (!(login == 1)) {
				controller[0].exec(users);
//				}
				
				switch(num) {
				
				case 2: {controller[num].exec(users);}break;
				case 3: {controller[num].exec(users);}break;
				case 4: {controller[num].exec(users);}break;
				case 5: {controller[num].exec(users);}break;
				
				}
				
			}break;	// login or menu
			
			default : {System.out.println("잘못된 입력입니다.");}continue;
					
			
			}// 1 or another 
			
		}// while end
		System.out.println("EXIT");
		
//		if (num == 1) {
//			System.out.println("계좌 추가 기능입니다.");
//	    
//		}
//		else {controller[num-1].exec();}
		
//	    Q1. 무한반복 + 각번호 입력받으면 ~ 기능입니다. 출력
//	    Q2. 입력받은 번호가 1번이면 유저추가
//	    Q2. 입력받은 번호가 2,3,4,5 이면
//	    		1) Login
//				2) 2,3,4,5 각각에서 처리해야할일

	}	// menu end

	public static void main(String[] args) {
		new Bank_Main().menu();

	}

}
