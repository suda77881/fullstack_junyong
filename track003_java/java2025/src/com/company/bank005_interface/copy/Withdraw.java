package com.company.bank005_interface.copy;

import java.util.List;

public class Withdraw implements BankController {

	@Override
	public void exec(List<UserInfo> users) {
		System.out.println("출금하기 기능입니다.");
		
	}

	
	
}
