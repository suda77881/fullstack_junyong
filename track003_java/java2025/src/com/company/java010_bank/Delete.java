package com.company.java010_bank;

import java.util.Scanner;

public class Delete {
	
	
	//상태 : 멤버변수
	UserInfo userinfo;
	
	
	// 상태 : 멤버변수
	
	public Delete() { super(); }
	public Delete(UserInfo userinfo) { super(); this.userinfo = userinfo;}
	
	public void exec() {
		
		char chk = ' ';
		Scanner sc = new Scanner(System.in);
		// setter / getter 이용해서 사용자정보 삭제 ###
		
		for (;;) {
		System.out.println("사용자 정보를 삭제하시겠습니까? (Y/N)");  chk = sc.next().charAt(0);
		
		
		
		if (Character.toUpperCase(chk) == 'Y') {System.out.println("사용자 정보가 삭제되었습니다.");
		
			this.userinfo.setId(null);
			this.userinfo.setPass(null);
			this.userinfo.setBalance(0);
			this.userinfo.setFind(-1);

			
			break;}// if end
		else if (Character.toUpperCase(chk) == 'N') {System.out.println("취소되었습니다.");break;
		
		}// else if end
		} // for end
		
	}

}


/* 기능 : 유저삭제 
 *  [ -id:String, -pass:String, -balance:double] 
 * 
 */