package com.company.bank005_interface.copy;

import java.util.List;

public class Delete implements BankController {


	@Override
	public void exec(List<UserInfo> users) {
		System.out.println("계좌 삭제 기능입니다.");
		
	}
}
