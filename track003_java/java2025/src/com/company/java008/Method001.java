package com.company.java008;

public class Method001 {
	    //(1) 마법상자 - 코드 재사용
	    //public static 리턴값(결과물) 메서명 (파라미터) {	} 
		public static 	void smile() {	System.out.print(":)");       }
		public static   void hello() {	System.out.println("Hello");	}
		public static   void line()  {	System.out.println();			} 
		////////////////////////////////////////
		public static void main(String[] args) {
			 //(2) 마법상자사용
			smile(); hello();
			hello();
			line();
			smile(); hello();
			line();
			hello();
			smile(); hello();
			
		}// end main
		////////////////////////////////////////
}// end class
