package com.company.java014_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ListEx002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <String>numbers = new ArrayList<String>();	// add, get, size, remove, contains(유무참거짓)
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		System.out.println("번호 입력 1~3"); int num = sc.nextInt();
		System.out.println(numbers.get(num-1));
		
		//처리 - if/ swich /for
		// if(만약 입력한값이 1이라면) {one}
		// if( num == 1 ){list.get(0);}
		// if( num == 1 ){list.get(1);}
		// if( num == 1 ){list.get(2);}
		
//		switch(num) {
//		
//		case 1  : {System.out.println(numbers.get(0));} break;
//		case 2  : {System.out.println(numbers.get(1));} break;
//		case 3  : {System.out.println(numbers.get(2));} break;
//		default : {System.out.println("1,2,3이 아닙니다.");}break;
//		}
		
		
	}

}
