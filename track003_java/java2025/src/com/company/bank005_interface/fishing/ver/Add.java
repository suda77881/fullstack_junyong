package com.company.bank005_interface.fishing.ver;

import java.util.List;
import java.util.Scanner;

public class Add implements F_Controller {
	
	@Override public int exec(List<UserInfo> users, int find) {
		

		find = users.size();  //System.out.println("인덱스번호 = " + (users.size())); 
			
	
		Scanner sc = new Scanner(System.in);
		Rod rod = new Rod();
		
		System.out.println("낚시꾼 등록");
		System.out.print("사용자 이름 입력: > ");
		String id = sc.next();
		System.out.print("사용자 번호 입력: > ");
		String pass = sc.next();
		System.out.print("\n초기 자본 입금완료\n"); 
		Double balance = 10000000.0;
		
		users.add(new UserInfo(id,pass,balance,rod));
		UserInfo u = users.get(find);
		System.out.println("🎁 " + u.getBalance() +"원");
		System.out.println("🎁 " + u.getRod() + "지급");
				
//	    u.setBalance(u.getBalance() + money) ;
//	    System.out.println("현재 잔액 : " + u.getBalance() + " 원");
	    
//		users.get(find).getBalance();	// list 에서 (find) 인덱스번호 리스트를 찾아. getBalance 메서드 실행
		
		
		System.out.println("╔═══════════════════╗");
		System.out.println("║ 🎉🎉🎉🎉🎉🎉🎉🎉 ║");
		System.out.println("║  가   입   완   료  ║");
		System.out.println("║ 🎉🎉🎉🎉🎉🎉🎉🎉 ║");
		System.out.println("╚═══════════════════╝");
		
		  try {
				Thread.sleep(2000); // 2초 대기 (=sleep)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		;	//	인덱스값 = 배열의 크기를 find에 대입
//		System.out.println("현재 인덱스 = " + (find));
		return find;

	}

}
