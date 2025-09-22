package com.company.java009_ex;

import java.util.Scanner;

class Calc2{
	// 상태 - 멤버변수 :
	int num1, num2;  char op;  double result;
	// 행위 - 멤버함수 : void input() 입력받기
	// 			  void opcalc() +더하기계산, -라면 -계산 , *라면 *계산, /라면 /계산	   
	   
	   void input()   {//입력받기
		   Scanner sc = new Scanner(System.in);
		   System.out.print("숫자1 > "); num1 = sc.nextInt();
		   System.out.print("숫자2 > "); num2 = sc.nextInt();
		   System.out.print("연산자 > "); op = sc.next().charAt(0);
	   }
	   
	   void opcalc() {
		   switch (this.op) {
		   case '+' : this.result = this.num1 + this.num2;break;
		   case '-' : this.result = this.num1 - this.num2;break;
		   case '*' : this.result = this.num1 * this.num2;break;
		   case '/' : this.result = (double)this.num1 / this.num2;break;}
		   //+더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
	   }
	   
	   
	   //    
	   void show(){
		   this.opcalc();
		   if (this.op == '/') {
			   System.out.printf("%d %c %d = %.2f" , this.num1, this.op, this.num2, this.result);}
		   else {
			   System.out.printf("%d %c %d = %d" , this.num1, this.op, this.num2, this.result);
		   }
	   }
	   public Calc2() {super();}
	   public Calc2(int num1, int num2, char op) {super(); this.num1 = num1; this.num2 = num2; this.op = op;}
	   
			     
	}
	public class ClassEx007_2{
	   public static void main(String[] args) {
	   Calc2  c1= new Calc2(10,3,'+');  
	   c1.show();
	   
	   Calc2  c2= new Calc2();  
	   c2.input();   
	   c2.show(); 
	    
	   }
	}

//	출력내용)
//	10+3=3
//
//	숫자1> 10
//	숫자2> 3
//	연산자> /
//	10/3=3.33