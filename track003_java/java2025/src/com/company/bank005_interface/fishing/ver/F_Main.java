package com.company.bank005_interface.fishing.ver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F_Main {
	private List <UserInfo> users;	// add, get, size, remove, contains
	private F_Controller [] controller;
	public int find= -1;	// index save
	public int num = -1;	// 메뉴선택 초기값
	public static int login = -1; 	// login setting
	public static String veh = "";	// 머리말
	
	public F_Main(int find) { super(); this.find = find; }
	public List<UserInfo> getUsers() { return users; } public void setUsers(List<UserInfo> users) { this.users = users; } public F_Controller[] getController() { return controller; } 
	public void setController(F_Controller[] controller) { this.controller = controller; }
	public F_Main() { 
		users		= new ArrayList<>();	
		controller  = new F_Controller[]{
				new Login() , new Add(), new Show(), new Fishing(),
			//        0           1          2     			3
				 new FishSell(), new Delete(), new RodUpgrade()//, new Chatting()
				//    4               5				6				7
		};
	}
	public void menu() {	// 메뉴 메서드
		
		
		Scanner sc = new Scanner(System.in);
		while ((!(num == 9))) {	// 9가아니면 진입 9가 눌리면 end
			num = -1;
//			System.out.println("현재 인덱스 = " + find);
			System.out.println("WELCOME! (주)낚시연맹");
			System.out.print("\n1.사용자등록\n2.사용자정보\n3.낚시\n4.물고기판매\n5.사용자삭제\n6.낚시대 강화\n9.종료\n무엇을 도와드릴까요? >>>");
			num = sc.nextInt();
			
			switch(num) {
			
			case 1: {
					find = controller[num].exec(users, 0);}break; // 사용자 추가 실행
			case 2 : case 3: case 4 : case 5: case 6: case 7: {	// login need menu
				
					find = controller[0].exec(users, find);
				
				if (login != 1) {break;}
				
				{find = controller[num].exec(users, find);}break;
				

			} // break;	// login or menu
			case 9 : {continue;}	//	종료선택
			default : {System.out.println("잘못된 입력입니다.");}continue;
				
			
			}// 1 or another 
			
		}// while end
		System.out.println("종료되었습니다.");
		

	}	// menu end

	public static void main(String[] args) {
		new F_Main().menu();

	}

}
