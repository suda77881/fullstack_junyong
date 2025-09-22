package com.company.java009_ex;

import java.util.Scanner;

class Calc{
	   int num1, num2;  char op;  double result;
	   
	   public Calc(int num1, int num2, char op) {
		   

		   
		   
		   this.num1 = num1;
		   this.num2 = num2;
		   this.op  = op;
		   
		   switch (this.op) {
		   case '+' : this.result = this.num1 + this.num2;
		   case '-' : this.result = this.num1 - this.num2;
		   case '*' : this.result = this.num1 * this.num2;
		   case '/' : this.result = (double)this.num1 / this.num2;
		   
		   //+더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
//		   if(op == '/') {System.out.printf("%d %s %d = %f", 
//				   this.num1, this.op, this.num2, this.result);}
//		   else {System.out.printf("%d %s %d = %d", 
//				   this.num1, this.op, this.num2, (int)this.result);}
//		   System.out.println();
	   }
	   }
	   public Calc() {
		   
		   this.op = '+';
		   this.num1 = 10;
		   this.num2 = 3;
		   this.result = 3;
		   
	   }
	   
	   
	   void input()   {//입력받기
		   Scanner sc = new Scanner(System.in);
		   System.out.print("숫자1 > "); num1 = sc.nextInt();
		   System.out.print("숫자2 > "); num2 = sc.nextInt();
		   System.out.print("연산자 > "); op = sc.next().charAt(0);
	   }

	   void opcalc() {
		   op  = this.op;
		   switch (this.op) {
		   case '+' : this.result = this.num1 + this.num2;
		   System.out.println
		   ("" + this.num1 +" + "+ this.num2 + " = " + (int)this.result);break;
		   case '-' : this.result = this.num1 - this.num2;
		   System.out.println
		   ("" + this.num1 +" - "+ this.num2 + " = " + (int)this.result);break;
		   case '*' : this.result = this.num1 * this.num2;
		   System.out.println
		   ("" + this.num1 +" * "+ this.num2 + " = " + (int)this.result);break;
		   case '/' : this.result = (double)this.num1 / this.num2;
		   System.out.printf
		   ("%d / %d = %.2f", this.num1, this.num2, this.result);break;
		   }
		   //+더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
	   }
	   //    
	   void show(){
		   

		   opcalc(); 
		   //연산출력 
	   }
			     
	}
	public class ClassEx007{
	   public static void main(String[] args) {
	   Calc  c1= new Calc(10,3,'+');  
	   c1.show();
	   
	   Calc  c2= new Calc();  
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