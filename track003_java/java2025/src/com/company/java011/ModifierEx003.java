package com.company.java011;

import com.company.java011_ex.Score;

public class ModifierEx003{    // java011 패키지에 설정해주세요.
	   public static void main(String[] args) {
	      Score iron = new Score();     	//	Score 메서드 
	      Score hulk = new Score("hulk" , 20,50,30);    
	      
	      // Score.info()위에 메서드작성해주세요!  ##
	      // setter를 이용해주세요!
	      iron.setName("iron"); iron.setKor(100); iron.setEng(100); iron.setMath(100);
	      
	      Score.info();     // 클래스메서드
	      iron.show();          
	      hulk.show();   
	   }

	}