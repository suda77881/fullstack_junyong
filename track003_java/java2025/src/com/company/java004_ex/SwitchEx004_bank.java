package com.company.java004_ex;
import java.util.Scanner;
public class SwitchEx004_bank {
	
	public static void main(String[] args) {
		
		int select, age, money, result;
		String id, pass;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("=====bank=====\n"
				+ "* 1. 추가\n* 2. 조회\n* 3. 입금\n* 4. 출금\n* 5. 삭제\n* 9. 종료\n입력>>> "); 
		
		select = sc.nextInt();
		
		System.out.print("아이디 입력 : ");	id = sc.next();				
		System.out.print("비밀번호 입력 : "); pass = sc.next();				
		System.out.print("나이 입력 : "); age = sc.nextInt();		
		System.out.print("잔액 입력 : "); money = sc.nextInt();
		

		
		
	}

}
