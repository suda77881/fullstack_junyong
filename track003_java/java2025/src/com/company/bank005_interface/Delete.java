package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Delete implements BankController {

	@Override public int exec(List<UserInfo> users, int find) {
//		System.out.println("계좌 삭제 기능입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제하시겠습니까? ( Y / N ) "); char ch = sc.next().charAt(0);
//		char choise = Character.toUpperCase(ch);	//	toUpperCase 강제 대문자 변환 str.toUpperCase(); or Character.toUpperCase(ch)
		if (ch == 'Y' || ch == 'y') {users.remove(find);
		System.out.println("정보가 삭제되었습니다."); 
		Bank_Main.login = 0;	//	login reset
		return -1;	// index reset
		}	// if Y delete
		else {
			System.out.println("취소되었습니다."); 
			return find;	// cancel
		}	// else end

//		UserInfo u = users.remove(find);
//		System.out.println("정보를 삭제했습니다. > " + u);
		
		
	}

}
