package com.company.java007_ex;

public class ArrayEx008 {
	
	public static void main(String[] args) {
		
		String []name = {"아이언맨","헐크","캡틴","토르","호크아이"}; //new String [5];
		
		String []pass = new String [5];
		String []jang = new String [5];
		int []kor = {100,20,90,70,35}; //new int [5];
		int []eng = {100,50,95,80,100}; //new int [5]; 
		int []mat = {100,30,90,60,100}; //new int [5];
		int[]aver= new int[5];
		
		int []total = new int [5];
		
		for (int i=0 ; i< name.length; i++)
		{
			
			total[i] = (kor[i] + eng[i] + mat[i]); 
			aver[i] = total[i] / 3;
			
//			if (aver[i] >= 95) {jang[i] = "장학생"; }
//			else {jang[i] = "---";}		
//			if (aver[i] >= 60) {pass[i] = "합격" ;}
//			else {pass[i] = "불합격" ;}
			jang[i] = (aver[i] >= 95 ? "장학생" : "---");
			pass[i] = (aver[i] >= 60 ? "합격" : "불합격");
//			pass[i] = (aver[i] >= 60 ? "합격" + (aver[i] > 95 ? "\t장학생" : "\t---") : "불합격");
			//수우미양가 때만 사용가능? 연속등급 매기기
			
			
			
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s %-5s\n"
				,"이름", "국어", "영어", "수학", "평균", "합격여부", "장학생");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (int i=0 ; i< name.length; i++)
		{
			System.out.printf("%-5s %-5d %-5d %-5d %-5d %-5s %-5s\n"
					,name[i], kor[i], eng[i], mat[i], aver[i], pass[i], jang[i]);
			
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

}
