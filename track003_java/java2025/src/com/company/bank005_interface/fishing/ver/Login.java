package com.company.bank005_interface.fishing.ver;

import java.util.List;
import java.util.Scanner;

public class Login implements F_Controller {
	
	@Override public int exec(List<UserInfo> users, int find) {	
		Scanner sc = new Scanner(System.in);
//		Bank_Main bm = new Bank_Main ();
		if (F_Main.login == -1) {	// 로그인이 필요한 경우
			System.out.println("사용자 인증이 필요한 기능입니다.");
			System.out.print("사용자 이름을 입력해주세요 >");String tempId = sc.next();
			System.out.print("사용자 번호를 입력해주세요 >");String tempPass = sc.next();
			//처리 - users에서 아이디와 비밀번호가 맞는 유저번호 찾기 - 찾았으면 나오기 / 못찾았으면 -1
			// 내가입력받은 아이디와 유저1번째 users.get(0)의 아이디 , 0번이 유저번호
			for(int i=0; i<users.size(); i++) {	// size , 배열의 길이
				//System.out.println("현재 인덱스 = " + find);
				if (tempId.equals(users.get(i).getId()) && tempPass.equals(users.get(i).getPass()))	
				// login success
				{ 
				  System.out.println("╔═══════════════════╗");
				  System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
				  System.out.println("║  확   인   완   료  ║");
				  System.out.println("║ 🐟🐠🐡🦐🦑🐙🦞🦀 ║");
				  System.out.println("╚═══════════════════╝"); 
			 //   System.out.println("로그인 성공"); 
				  
				  F_Main.login = 1; // 로그인에 성공 (기본값:-1)
				  
					  try {
							Thread.sleep(2000); // 2초 대기 (=sleep)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				  	  
					  return find; // 로그인에 성공한 경우 find 인덱스를 반환
				}	//	users arraylist에서 find 인덱스로 조회했을때, 아이디와 비밀번호가 일치하는 경우
				else	// Id Pass 불일치
				{ System.out.println("로그인 실패");return find;}	// 로그인에 실패한 경우 find 인덱스 반환
				
			}return find;// for end users 리스트에서 입력된 아이디와 패스워드 조회 마침
		}// if end login
		else {	// 로그인이 필요없는 경우 스킵 (로그인된 경우 : login = 1)
//			System.out.println("로그인 스킵");
			};return find;	// 인덱스 반환
		
	} // exec method end
	
} // class end
