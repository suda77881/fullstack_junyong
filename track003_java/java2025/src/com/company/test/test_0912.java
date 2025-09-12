package com.company.test;
import java.util.Scanner;
public class test_0912 {
	
	public static void main(String[] args) {
		
		char ch = ' '; int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해주세요>_"); ch = sc.next().charAt(0);
		
		
		
		if (ch == 'm') {System.out.println("mango");}
		else if (ch == 'n') {System.out.println("noodle");}
		else if (ch == 'o') {System.out.println("orange");}
		else {System.out.println("m,n,o가 아닙니다.");}
		
		System.out.print("숫자를 입력해주세요>_"); num = sc.nextInt();
		
		switch (num) {
		case 1 : {System.out.println("mango");}break;
		case 2 : {System.out.println("noodle");}break;
		case 3 : {System.out.println("orange");}break;
		default : {System.out.println("1,2,3이 아닙니다.");}break;
		
		}
		
		
		for (int i = 5 ; i >= 1; i--)
		{
			System.out.print(i + " ");
			
		}
		
		System.out.println();
		int num1 = 5;
		while(num1 >= 1) {
			System.out.print(num1 + " ");
			
			num1--;}
		
		System.out.println();
		int num2 = 5;
		do {
			System.out.print(num2 + " ");
			
			num2--;}while(num2 >= 1);
		
		int []nums = new int[3];
		
		int num21 = 10;
		System.out.println();
		for (int i2 = 0; i2 < nums.length; i2++)
		{
			nums[i2] = num21 ; num21 += 10;
			
			if (i2 == 2) {System.out.print(nums[i2]);}
			else	System.out.print(nums[i2] + ",");
			
			
		}
		
	}

}
