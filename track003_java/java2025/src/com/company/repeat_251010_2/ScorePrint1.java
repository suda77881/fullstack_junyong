package com.company.repeat_251010_2;

public class ScorePrint1{
	
//	public void show(Score1 std) {}
	public void show_title() {
			
			System.out.print("::::::::::::::::::::::::::::::::::::");
			System.out.printf("\n%-5s %-5s %-5s %-5s %-5s %-5s\n", "이름", "국어", "수학", 
					"영어", "평균", "패스");
			System.out.print("::::::::::::::::::::::::::::::::::::");
	}
	public void show(Score1[] std) {
		for (int i = 0; i<std.length; i++) {
			
			if (i == 0) {
				show_title();
				}
			System.out.println();
		System.out.printf("%-5s %-5d %-5d %-5d %-5.2f %-5s", std[i].getName(), std[i].getKor(), std[i].getMath(), 
				std[i].getEng(), std[i].getAvg(), std[i].getPass());
		}
	}
	
	
}