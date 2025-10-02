package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Delete implements BankController {


	@Override
	public int exec(List<UserInfo> users, int find) {
//		System.out.println("계좌 삭제 기능입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하시겠습니까?"); char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {users.remove(find);}
		
//		UserInfo u = users.remove(find);
//		System.out.println("정보를 삭제했습니다. > " + u);
		return 1;
		
	}

}
