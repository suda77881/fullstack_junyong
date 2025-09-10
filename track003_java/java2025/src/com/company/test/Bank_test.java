package com.company.test;
import java.util.Scanner;

public class Bank_test {
	
	public static void main(String [] args) {
		
		int num = 0, select = 0 ;  double balance=0.0;
		
		String menu = "======bank======\n1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료" , id = "", pass = "";
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
				System.out.println(menu + "");
			switch (select) {
				
			case 1 : {System.out.println("메뉴1입니다.");System.out.println("아이디를 입력해주세요 : "); id = sc.next();}break;
			case 2 : {System.out.println("메뉴2입니다.");}break;
			case 3 : {System.out.println("메뉴3입니다.");}break;
			case 4 : {System.out.println("메뉴4입니다.");}break;
			case 5 : {System.out.println("메뉴5입니다.");}break;
			case 9 : {System.out.println("메뉴9입니다.");}break;
			
			}
			
		}
		
		
	}

}
