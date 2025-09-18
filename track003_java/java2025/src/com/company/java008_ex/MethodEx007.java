package com.company.java008_ex;

public class MethodEx007 {
	
	
	
		   public class Method007_ex {
		   public static int  add(int x, int y) {return x+y;} //1
		   public static int  add(byte x, byte y)   {return x+y;} //2   
		   public static int  add(short x, short y) {return x+y;} //3  
		   public static long add(int  x, int y)    {return x+y;} //4  
		   public static long add(long  x, long y)  {return x+y;} //5 
		   
		   public static void main(String[] args) { 
			   //Q1. 메서드 오버로딩? : 비슷한 목적의 메서드 이름을 같게 하는것
			   // (동일한 메서드 명을 공유하지만 다른 내용의 작업을 할 수 있는 구조)
			   //Q2. 왜 오류나는지? 이유 : 파라미터의 개수와 자료형으로 구분
			   // 자료형과 이름은 같아도 괜찮지만, 파라미터가 다른 값이 되어야 오류가 나지않는다.
			   // 1, 4 번의 파라미터의 자료형이 같음!
		   }
		}

}
