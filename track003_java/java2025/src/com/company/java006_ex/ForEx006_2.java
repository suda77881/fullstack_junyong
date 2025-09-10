package com.company.java006_ex;
import java.util.Scanner;
public class ForEx006_2 {

		public static void main(String[] args) {
			// 변수 초기값을 잡아야한다.
			int num1=-1, num2 =-1; double result = 0;
			
			char op = ' ';  double str = 0.0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. 정수를 하나 입력해주세요 >"); num1 = sc.nextInt();
			
			
			for(;;) { 
				if (!(num1 >= 0 && num1 <= 100)) {	//	1-1. 0~100범위가 아니라면 10
					System.out.print("숫자1 입력 >");	//	1-2. 입력받기
					num1 = sc.nextInt();
					continue;	//	1-3. 아래쪽 진행하지 말것! skip 건너뚜기 ! 잘입력받았는지 체크
				}
				if (!(num2 >= 0 && num2 <= 100)) {
					System.out.print("숫자2 입력 >");
					num2 = sc.nextInt();
					continue;
				}
				if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
					System.out.print("연산자 입력 >");
					op = sc.next().charAt(0);
					continue;
				}
				break;

			}
			
			// 처리
			
			switch (op) {
			
			case '+' : {result = num1 + num2;}break;
			case '-' : {result = num1 - num2;}break;
			case '*' : {result = num1 * num2;}break;
			case '/' : {result = num1 / num2;}break;
			

//			System.out.println("" + num1 + op + num2 + "=" + 
//								(op!='/'? "" +(int)result : String.format("%.2f", result)));
		}
}
		
}
