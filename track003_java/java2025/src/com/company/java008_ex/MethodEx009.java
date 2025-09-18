package com.company.java008_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 변수
		String[][] users = { { "aaa", "111", "한국" }, // 00 01 02
				{ "bbb", "222", "호주" }, // 10 11 12
				{ "ccc", "333", "중국" } }; // 20 21 22
		// 입력

		who_are_you(users);
		// public static void who_are_you(String [][] users){ 아이디를입력받아서 나라조회 }
		who_pass_change(users);
		// public static void who_pass_change(String [][] users)
		// { 아이디,비밀번호가 맞으면 비밀번호 바꾸기}

	}

	public static void who_are_you(String[][] users) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 > ");
		String tempid = "";
		tempid = sc.next();

		for (int i = 0; i < users.length; i++) {
			for (int j = 0; j < users[i].length - 1; j++) {
				if (users[i][j].equals(tempid)) {
					System.out.println(tempid + "는 " + users[i][2] + " 사람 입니다.");
					break;
				}
			}
		}
	}

	public static void who_pass_change(String[][] users) {
		int num = 1;
		String tempid = "";
		String temppass = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력해주세요 > ");
		tempid = sc.next();
		System.out.print("비밀번호를 입력해주세요 > ");
		temppass = sc.next();
		int findIndex = -1;
		for (int i = 0; i < users.length; i++) {
			

			if (users[i][0].equals(tempid) && users[i][1].equals(temppass)) {
				System.out.print("변경하실 비밀번호를 입력해주세요 > ");
				String inputpass = "";
				inputpass = sc.next();
				users[i][1] = inputpass;
				findIndex = i;
				break;
			}
		}
		if(findIndex != -1) {System.out.println(Arrays.deepToString(users[findIndex]));}
		else{System.out.println("유저를 확인해주세요!");;}

	}

}