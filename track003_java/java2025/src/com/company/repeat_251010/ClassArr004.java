package com.company.repeat_251010;

import com.company.repeat_251010_2.Score1;
import com.company.repeat_251010_2.ScorePrint1;
import com.company.repeat_251010_2.ScoreProcess1;



public class ClassArr004 {

	public static void main(String[] args) {
		
		Score1[] std = new Score1[3];
		std[0] = new Score1("아이언맨", 100, 100, 100);
		std[1] = new Score1("헐크", 90, 60, 80);
		std[2] = new Score1("블랙펜서", 20, 60, 90);
		
		ScoreProcess1 process = new ScoreProcess1();
		process.process_avg(std);
		process.process_pass(std);
		
		ScorePrint1 print = new ScorePrint1();
		print.show(std);
	}
}
