package com.company.java004_ex;
import java.util.Scanner;
public class SwitchEx001 {
	
	public static void main(String[] args) {
		
		int num ;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		switch(num) {
		
		case 3 : System.out.println("봄"); /* num == 3 */ break; 
		case 6 : System.out.println("여름"); /* num == 6 */ break; 
		case 9 : System.out.println("가을"); /* num == 9 */ break; 
		case 12 : System.out.println("겨울"); /* num == 12 */ break; 
		
		
		
		}
		
		
	}
	
}


//연습문제1)  
//패키지명 : com.company.java004_ex
//클래스명 :  SwitchEx001
//출력내용 :  switch 이용
//     숫자한개 입력받아
//     3이면 봄
//     6이면 여름
//     9이면 가을
//     12이면 겨울