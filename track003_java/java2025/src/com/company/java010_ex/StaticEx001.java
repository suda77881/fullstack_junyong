package com.company.java010_ex;

//-- class Area1 작성해주세요   ※ pi값은 3.14159

class Area1 {
	
	//멤버변수
	
	static double pi = 3.141569;
	
	//멤버함수
	
//	int a;
//	int b;
	

	
	public static double rect(int a, int b) {
		
		return (a * b);
	}

	public static double triangle(int i, int j) {
		
		return (i * j / 2);
	}
	

}


public class StaticEx001{
	
  public static void main(String[] args) {  
	  
	  
   System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
   // public static 리턴값 메서드명(파라미터) {	해야할일	}
   // public static double rect(int a, int b){	return a*b;	}
   // public static double triangle(파라미터) {return a*b*0.5;}
   System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
   System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
  }
}

//출력내용 : 
//원의 면적    : 314.159
//사각형의 면적 : 50.0
//삼각형의 면적 : 25.0
