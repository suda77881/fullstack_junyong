package com.company.bank005_interface.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add implements BankController {
	
	UserInfo Id;
	UserInfo Pass;
	
	
	@Override
	public void exec(List<UserInfo> users) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n사용하실 아이디를 입력해주세요 > ");  
		String Id = sc.next();
		System.out.print("\n사용하실 비밀번호를 입력해주세요 > "); 
		String Pass = sc.next();


		
	}


			
			

}
