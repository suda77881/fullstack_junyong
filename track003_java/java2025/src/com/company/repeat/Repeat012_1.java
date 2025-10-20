package com.company.repeat;
import java.util.Scanner;
public class Repeat012_1 {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력 해주세요_"); num = sc.nextInt();
		
	    if (num == 1) {System.out.println("one");}
	    else if (num == 2) {System.out.println("two");}
	    else if (num == 3) {System.out.println("three");}
	    else {System.out.println("1,2,3이 아니다.");}
	    
	}

}
