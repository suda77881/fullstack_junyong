package com.company.bank005_interface.copy;

import java.util.List;
import java.util.Scanner;

public class Login implements BankController {
	


	@Override
	public void exec(List<UserInfo> users) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요 >"); String tempId = sc.next();
		System.out.println("로그인입니다.");
		
	}

}
