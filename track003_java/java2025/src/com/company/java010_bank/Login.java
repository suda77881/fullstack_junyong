package com.company.java010_bank;

import java.util.Scanner;

public class Login {
	
	
	//상태 : 멤버변수
	UserInfo userinfo;
	
	
	// 상태 : 멤버변수
	
	public Login() { super(); }
	public Login(UserInfo userinfo) { super(); this.userinfo = userinfo;}
	
	public int exec() {
		// setter / getter 이용해서 유저정보 확인
		//변수
		int find=-1;
		Scanner sc = new Scanner(System.in);
		//입력 -  사용자에게 아이디입력받기 / 비밀번호 입력받기
		System.out.println("아이디를 입력해주세요 >"); String tempId = sc.next();
		System.out.println("비밀번호를 입력해주세요 >"); String tempPass = sc.next();
		//처리 - 입력한 아이디와 userinfo.id가 같고 입력한 비밀번호와 userinfo.pass가 같다면 find=1; 찾으면 1
		
		
		if (tempId.equals(userinfo.getId()) && tempPass.equals(userinfo.getPass())) 
		{System.out.println("로그인에 성공했습니다.");find = 1; 
		}
		else {System.out.println("로그인에 실패했습니다.");}; 
		//출력 - 
		return find;
	}


}


/* 기능 : 유저정보 대조 후 로그인
 *  [ -id:String, -pass:String, -balance:double] 
 * 
 */