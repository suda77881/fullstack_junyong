package com.company.bank005_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank_Main {
	// 멤버변수
	private List <UserInfo> users;	// add, get, size, remove, contains
	private BankController [] controller;
	public int find;
	public static int login = -1; 
	public static String veh = "";
	
	public List<UserInfo> getUsers() { return users; } public void setUsers(List<UserInfo> users) { this.users = users; } public BankController[] getController() { return controller; } 
	public void setController(BankController[] controller) { this.controller = controller; }
	public Bank_Main() { 
		users		= new ArrayList<>();	
		controller  = new BankController[]{
				new Login() , new Add(), new Show(), new Deposit(),
			//        0           1          2     			3
				 new Withdraw(), new Delete(), new Shopping(), new Chatting()
				//    4               5				6				7
		};
	}
	// 멤버함수	(메뉴판)
	public void menu() {
		//변수
		
		//입력 + 처리
			// 1. 유저추가
			// 2,3,4,5,
			// 1) Login 2) 2,3,4,5 각각에서 처리해야할일
			//	각각의 기능 2 SHow(),  3. Deposit  4. Withdraw, 5. Delete()
		
		
//		while(!(num == 9)){
//			
//		}
		int num =-1;
		Scanner sc = new Scanner(System.in);
		while ((!(num == 9))) {
			num = -1;
			System.out.print(
					veh + "\n[1] 계좌 추가\n[2] 계좌 조회\n[3] 입금하기\n[4] 출금하기\n[5] 계좌 삭제\n[6] 쇼핑\n[7] 채팅상담\n[9] 종료\n메뉴를 선택해주세요 > ");
			num = sc.nextInt();
			
			// 찾은 유저번호 or 0 로그인 1 계좌추가
			
			//add, get(번호), size, remove(번호), contatins()
			//추가         :
			// 1번 호출 : controller[1].exec(users, 1); > users.add(new UserInfo("id", "pw" , 1));
			// 2번 로그인해서 해당유저가 번호 필요 : exec(users, index);
			// 3번 controller[2].exec(users, index); 		users.get(번호); 	/users.remove(번호);
			// 조회 : users.get(번호)
			// 입금 : users.get(번호) / user.setBalance(입금받은돈)
			// 삭제 : users.remove(번호)
			
			switch(num) {
			
			case 1: {
//				System.out.println("계좌 추가 기능입니다.");
				controller[num].exec(users, 0);}break;
			case 2 : case 3: case 4 : case 5: case 6: case 7: {
				
				// add, get(번호), size, remove(번호), contatins()
				// Add		: users.add(	new UserInfo("id", "pw", 1) );
				// Show		: users.get(유저번호)
				// Desposit : users.get(유저번호)
				//1. parameter	- 넘겨받아야할 데이터 users, 유저번호
				//2. 리턴값 		- 위의 사용법에서 show, deposit 부분등에서 유저번호가 필요한다.
				//				  로그인시 찾은 유저의 번호를 넘겨주려고.
				//3. int (찾은 유저번호) 	exec(users, index);

//				if(num>=2 && num <= 4) {controller[0].exec(users);}
				
				controller[0].exec(users, 0);
				
				if (login != 1) {break;}
				
				switch(num) {	
				
				case 2: {controller[num].exec(users, find);}break;
				case 3: {controller[num].exec(users, find);}break;
				case 4: {controller[num].exec(users, find);}break;
				case 5: {controller[num].exec(users, find);}break;
				case 6: {controller[num].exec(users, find);}break;
				case 7: {controller[num].exec(users, find);}break;
				case 9: {System.out.println("");}break;
				default : {System.out.println("잘못된 입력입니다.");}continue;
				}
				
			}break;	// login or menu
			
			
					
			
			}// 1 or another 
			
		}// while end
		System.out.println("종료되었습니다.");
		
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
