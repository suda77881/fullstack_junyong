package com.company.java011;	//##2

import com.company.java011_ex.Milk; //##3

//다음과 같이 코드를 작성하시오.
//ㅁ출력된화면
//   Milk [mno=0, mname=null, mprice=0]
//   Milk [mno=0, mname=null, mprice=2000]
//   
//ㅁ주어진조건


public class ModifierEx002{ // java011 패키지에 설정해주세요.
   public static void main(String[] args) {
      Milk m1 = new Milk();  
      System.out.println( m1 );  
      m1.setMprice(2000);       
      System.out.println( m1 );
   } // end main
} // end class
