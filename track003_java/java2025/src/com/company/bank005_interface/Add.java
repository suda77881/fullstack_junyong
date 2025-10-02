package com.company.bank005_interface;


import java.util.List;
import java.util.Scanner;

public class Add implements BankController {
	
	@Override
	public int exec(List<UserInfo> users, int find) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("\n사용하실 아이디를 입력해주세요 > ");  
		String id = sc.next();
		System.out.print("\n사용하실 비밀번호를 입력해주세요 > "); 
		String pass = sc.next();
		System.out.print("\n입금할 금액 > "); 
		Double balance = sc.nextDouble();
		
		users.add(new UserInfo(id,pass,balance));
		
//		System.out.println("배열번호" + users.size()); //1
		
		System.out.println("아이디 추가완료");
		
		return users.size();

	}

}
