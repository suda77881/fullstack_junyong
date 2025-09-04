package com.company.java004_ex;
import java.util.Scanner;
public class IfEx002 {
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오"); num = sc.nextInt();
		
		if ( 0 > num ) {System.out.println("당신이 입력한 숫자는 음수");}
		
		else if ( num == 0){System.out.println("zero");}
		
		else if ( num > 0) {System.out.println("당신이 입력한 숫자는 양수");}
		
		//0 을 입력했을때는 양수?
	}
}
