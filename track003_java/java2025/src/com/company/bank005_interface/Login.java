package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Login implements BankController {
	
	@Override public int exec(List<UserInfo> users, int find) {
		Scanner sc = new Scanner(System.in);
//		Bank_Main bm = new Bank_Main ();
		if (Bank_Main.login == -1) {
		System.out.print("[1]아이디를 입력해주세요 >"); String tempId = sc.next();
		System.out.print("[2]비밀번호를 입력해주세요 >"); String tempPass = sc.next();
		//처리 - users에서 아이디와 비밀번호가 맞는 유저번호 찾기 - 찾았으면 나오기 / 못찾았으면 -1
		// 내가입력받은 아이디와 유저1번째 users.get(0)의 아이디 , 0번이 유저번호
		for(int i=0; i<users.size(); i++) {
		if (tempId.equals(users.get(i).getId()) && tempPass.equals(users.get(i).getPass()))
		{ 
//		  System.out.println("╔═══════════════════╗");
//		  System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
//		  System.out.println("║  확   인   완   료  ║");
//		  System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
//		  System.out.println("╚═══════════════════╝"); 
		  System.out.println("로그인 성공"); 
		  Bank_Main.login = 1; 
		  	  
		  return find; 
		}
		else
		{ System.out.println("로그인실패");return find;}	// else end
		
		}return find;// for end
		}// if end login
		else {
//			System.out.println("로그인 스킵");
			};return find;
		
	} // exec end
} // controller end
