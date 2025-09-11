package com.company.java007_ex;

public class ArrayEx008_2 {
	
	public static void main(String[] args) {
		
		String []name = {"아이언맨","헐크","캡틴","토르","호크아이"}; //new String [5];
		
		String []pass = new String [5];
		String []jang = new String [5];
		int []kor = {100,20,90,70,35}; //new int [5];
		int []eng = {100,50,95,80,100}; //new int [5]; 
		int []mat = {100,30,90,60,100}; //new int [5];
		
		int []rank = {1,1,1,1,1};
		int []rankdata = new int[5];
		
		int[]aver= new int[5];
		
		int []total = new int [5];
		
		int i2 = 1;
		
		for (int i=0 ; i < name.length; i++)
		{
			i2++;
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
			
			
//			if (i < name.length -1 ) {rank[i] = aver[i] > aver[(i+1)] ? 0 : +1;
//				System.out.print(rank[i]+ "현재 vs 다음\n"+aver[i]+" vs "+aver[(i+1)]+"\n");
//			}
//			else {}
//			System.out.println(rank[i] +"="+ aver[i] +"<"+ aver[(i+=1)] +"+"+ rank[i]++);
//			if (!(rank[i]++ == rank[4])) {rank[i] = aver[i] < aver [i++] ? rank[i]++ : -0;
//			System.out.println(rank[i] +"="+ aver[i] +"<"+ aver[i++] +"?"+ rank[i]++ +":"+ -0);}
//			rank[i] = aver[i] < aver [1] ? rank[0]++ : -0;
//			rank[i] = aver[i] < aver [2] ? rank[0]++ : -0;
//			rank[i] = aver[i] < aver [3] ? rank[0]++ : -0;
//			rank[i] = aver[i] < aver [++i] ? rank[0]++ : -0;
			
//			System.out.println(rank[i]);
//			System.out.println(rank[i] + " " + rank[0]++ +" " + aver[1]);
//			rank[i] = aver[i] < aver[(i++)] ? +1 : -0;
//			System.out.printf("%d += %d < %d ? %d",rank[i],aver[i],aver[(i++)],(rank[i]++),0);
			
//			System.out.println(rank[0] +"="+ aver[0] +"<"+ aver[1] +"+"+ rank[0]++);
			
//			aver[i] < aver[1++] ? rank[i]++ : -0;
			
//			(aver[i] < aver [1] ? {rank[i2];} +1 : -0;)

			
		}
		
		

		
		
		
		
		
		

		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s\n"
				,"이름", "국어", "영어", "수학", "평균","등수", "합격여부", "장학생");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (int i=0 ; i< name.length; i++)
		{
			
			System.out.printf("%-5s %-5d %-5d %-5d %-5d %-5d %-5s %-5s\n"
					,name[i], kor[i], eng[i], mat[i], aver[i],rank[i], pass[i], jang[i]);
			
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

}
