package com.company.java005_ex;


public class ForEx004_2 {
	
	public static void main(String[] args) {
		
		int num1=0, cnt = 0;
		String result="";


	
			
			for (int i = 1; i <= 10; i++) {
				if (i % 3 == 0 ) {cnt ++; result += (i==3? "" : ",") + i ; }
			}
			
			

			
//			switch (i) {case 3 : case 6 : {cnt++;} ; System.out.print(i + ","); break;
//						case 9 : {cnt++;} ; System.out.println(i);}
			
		
		System.out.print("\n갯수 : " + cnt + "개");
	}

}



// 변수

//1~10까지 3의 배수의 갯수 카운트 담을 변수
// 입력 + 처리(1)
// 1이 3의 배수라면 카운트
//2이 3의 배수라면 카운트
//3이 3의 배수라면 카운트

// 입력 + 처리(2)
// if(1이3의 배수라면) {카운트}
//if(2가3의 배수라면) {카운트}
//if(3이3의 배수라면) {카운트}

//입력 + 처리(3)
//if(1%3의 배수라면) {cnt++;}
//if(2%3의 배수라면) {cnt++;}
//if(3%3의 배수라면) {cnt++;}