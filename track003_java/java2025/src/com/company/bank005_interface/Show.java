package com.company.bank005_interface;

import java.util.List;

public class Show implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
//		System.out.println("입금하기 기능입니다.");
		
		UserInfo info = users.get(find);
		System.out.println(" ID      > " + info.getId());
		System.out.println(" PASS    > " + info.getPass());
		System.out.println(" BALANCE > " + info.getBalance());
		
		return 1;
		
	}

}
