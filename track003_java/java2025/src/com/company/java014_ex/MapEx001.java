package com.company.java014_ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapEx001 {
	// Q1. map 에 데이터 추가 - 피구왕 통키, 제빵왕 김탁구, 요리왕 비룡
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		System.out.println("==========\r\n" + "KING\tNAME\r\n" + "==========");
		for( Entry<String, String> k: map.entrySet()) {
			System.out.println(k.getKey() + "\t" + k.getValue());
		}
		System.out.println("KING의 정보를 제공중입니다\r\n"
				+ "이름을 입력하세요 > ");
		String find = sc.next();
		// 		제빵왕 : 김탁구
		//				  유저있어?					 유저정보						없음
		System.out.println( map.containsKey(find)? 	find + "-" + map.get(find) : "찾는 왕 없음!");
	}

}
