package com.company.repeat_251010_2;

public class ScoreProcess1{
	
	public void process_avg(Score1[] std) {
		
		for (int i = 0;  i<std.length; i++) {
			
		std[i].setAvg((std[i].getKor()+std[i].getEng()+std[i].getMath())/3.0);
		}
	}

	
	public void process_pass(Score1[] std) {
		
		for (int i = 0; i<std.length; i++) {	
			
		std[i].setPass(std[i].getAvg() > 70 ? "합격" : "불합격");
		}
			
	}

}