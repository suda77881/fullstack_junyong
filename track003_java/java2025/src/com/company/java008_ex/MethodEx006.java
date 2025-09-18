package com.company.java008_ex;
import java.util.Scanner;
public class MethodEx006 {
	public static int process_total(int atk, int dfs, int spd, int total) {return total = atk+dfs+spd;}
	public static float process_avg(int total, float avg) {return avg = total/3.0f;}  
	public static String process_grade(float avg)
	{String grade; return grade = avg >= 90 ? "S등급" : avg >= 80 ? "A등급" : avg >= 70 ? "B등급" : avg >= 60 ? "C등급" : "D등급";}  
	public static String process_star(float avg) 
					{String result=""; for (int i = 1; i <= (int)(avg/10.0f); i++) 
					{result += "*";} return result;}  
	public static String process_quest(float avg) 
	{return (int)avg >= 90 ? "전설의 용 퇴치" : (int)avg >= 80 ? "A등급 퀘스트" : 
		(int)avg >= 70 ? "B등급 퀘스트" : (int)avg >= 60 ? "C등급 퀘스트" : "D등급 퀘스트";}   
	public static String process_type(int atk, int dfs, int spd) 
	{ 
		if (atk > dfs && atk > spd) {
			return "전사형";
		}
		else if (dfs > atk && dfs > spd) {
			return "기사형";
		}
		else return "도적형";
	}
	
	public static void main(String[] args) {
		
		String []name = {"","",""};  
		int []atk = {0,0,0}; int[]dfs = {0,0,0}; int[]spd = {0,0,0};  
		int []total = {0,0,0} ;  
		float []avg = {0.0f,0.0f,0.0f};   
		String []grade = {"","",""}; String []star = {"","",""}; 
		String []quest = {"","",""}; String []type = {"","",""};  
		Scanner sc = new Scanner(System.in);
		
		int []ranka = {3,3,3};
		int []rankd = {3,3,3};
		int []ranks = {3,3,3};
		int []rankt = {3,3,3};
		

		for (int i = 0; i < name.length; i++ )
		{
			System.out.print("이름_"); name[i] = sc.next();
			System.out.print("공격력_"); atk[i] = sc.nextInt();
			System.out.print("방어력_"); dfs[i] = sc.nextInt();
			System.out.print("민첩성_"); spd[i] = sc.nextInt();
		
		
		System.out.println("| 총합 계산 |" + process_total(atk[i], dfs[i], spd[i], total[i]) +" | 공격력 + 방어력 + 민첩성 |");
		total[i] = process_total(atk[i], dfs[i], spd[i], total[i]);
		System.out.println("| 평균 계산 |" + process_avg(total[i], avg[i])+ "| 총합 ÷ 3 |");
		avg[i] = process_avg(total[i], avg[i]);
		System.out.println("| 등급 처리 |" +process_grade(avg[i])+ "| 평균에 따라 S~D 등급 |");
		grade[i] = process_grade(avg[i]);
		System.out.println("| 별표 처리 |" +process_star(avg[i])+ "| 평균 점수대별 별 개수 |");
		star[i] = process_star(avg[i]);
		
		System.out.println("| 퀘스트 추천 |" +process_quest(avg[i])+ "| 평균에 따라 추천 퀘스트 |");
		quest[i] = process_quest(avg[i]);
		System.out.println("| 캐릭터 타입 |" +process_type(atk[i], dfs[i], spd[i])+ "| 가장 높은 능력치 기준 |");
		type[i] = process_type(atk[i], dfs[i], spd[i]);
	
		process_show(name[i],atk[i],dfs[i],spd[i],total[i],avg[i],grade[i],star[i],quest[i],type[i]);

		}
		
		vs(name,atk,dfs,spd,total);
		
		
	}
	
	
	
	public static void process_show
	(String name, int atk, int dfs, int spd, int total, float avg, String grade, String star, String quest, String type) 
	{
		if (avg == 100) {name = "전설의 영웅 " + name;}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("캐릭터   공격력   방어력   민첩성   총합   평균   등급   랭킹   추천퀘스트   캐릭터타입");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.printf("%s %d %d %d %d %.1f %s %s %s %s\n", name, atk,dfs, spd, total, avg, grade, star, quest, type);
		System.out.println("-------------------------------------------------------------------------------------------------");
		}
	
	
	public static void vs(String[] name, int[] atk, int[] dfs, int[] spd, int[] total  ) 
	{
		int atk1 = 3, atk2 = 3, atk3 = 3;
		int dfs1 = 3, dfs2 = 3, dfs3 = 3;
		int spd1 = 3, spd2 = 3, spd3 = 3;
		int to1 = 3, to2 = 3, to3 = 3;
		for (int i = 0;  i < name.length; i++)
		{
			if (atk[0] > atk[i]) {atk1-- ;}
			if (dfs[0] > dfs[i]) {dfs1-- ;}
			if (spd[0] > spd[i]) {spd1-- ;}
			if (total[0] > total[i]) {to1-- ;}
			if (atk[1] > atk[i]) {atk2-- ;}
			if (dfs[1] > dfs[i]) {dfs2-- ;}
			if (spd[1] > spd[i]) {spd2-- ;}
			if (total[1] > total[i]) {to2-- ;}
			if (atk[2] > atk[i]) {atk3-- ;}
			if (dfs[2] > dfs[i]) {dfs3-- ;}
			if (spd[2] > spd[i]) {spd3-- ;}
			if (total[2] > total[i]) {to3-- ;}
					
		}
		System.out.printf("이 름 : %s %s %s \n", name[0],name[1],name[2]);
		System.out.printf("공격력 : %s위 (%d) %s위 (%d) %s위 (%d)\n", atk1,atk[0],atk2,atk[1],atk3,atk[2]);
		System.out.printf("방어력 : %s위 (%d) %s위 (%d) %s위 (%d)\n", dfs1,dfs[0],dfs2,dfs[1],dfs3,dfs[2]);
		System.out.printf("민첩성 : %s위 (%d) %s위 (%d) %s위 (%d)\n", spd1,spd[0],spd2,spd[1],spd3,spd[2]);
		System.out.printf("총 합 : %s위 (%d) %s위 (%d) %s위 (%d)\n", to1,total[0],to2,total[1],to3,total[2]);
		
	}
	
	
//	String []name = {"","",""};  
//	int []atk = {0,0,0}; int[]dfs = {0,0,0}; int[]spd = {0,0,0};  
//	int []total = {0,0,0} ;  
//	float []avg = {0.0f,0.0f,0.0f};   
//	String []grade = {"","",""}; String []star = {"","",""}; 
//	String []quest = {"","",""}; String []type = {"","",""};  
//	Scanner sc = new Scanner(System.in);
//	
//	int []ranka = {3,3,3};
//	int []rankd = {3,3,3};
//	int []ranks = {3,3,3};
//	int []rankt = {3,3,3};

}
