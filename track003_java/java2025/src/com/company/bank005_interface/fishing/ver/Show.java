package com.company.bank005_interface.fishing.ver;

import java.util.List;

public class Show implements F_Controller {

	@Override
	public int exec(List<UserInfo> users, int find) {


		UserInfo info = users.get(0);
		System.out.println("낚시꾼 정보");
		System.out.println(" 사용자이름 > " + info.getId());
		System.out.println(" 비밀번호  > " + info.getPass());
		System.out.println(" 잔액 	 > " + info.getBalance());
		System.out.println(" 현재낚시대 > " + info.getRod());
		return find;
	}

}
