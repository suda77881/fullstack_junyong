package com.company.test;

import java.util.Scanner;

class Calc{
	   //상태-멤버변수  :  int num1, num2;  char op;  double result;
	
	int num1, num2;  char op;  double result;
	
	public Calc (int num1, int num2, char op)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	   //행위-멤버함수  :  void input()   입력받기
	   //               void opcalc() +더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
	   //                      void show()    연산출력  
	void input() {
		//입력받기
	}
	void opcalc() {
		//+더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산
		
				 if (op == '+') {}
			else if (op == '-') {}
			else if (op == '*') {}
		    else if (op == '-') {}
	}
	void show() {
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