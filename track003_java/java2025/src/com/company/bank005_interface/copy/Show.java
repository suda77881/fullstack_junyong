package com.company.bank005_interface.copy;

import java.util.List;

public class Show implements BankController {

	@Override
	public void exec(List<UserInfo> users) {
		System.out.println("입금하기 기능입니다.");
		
	}



}
