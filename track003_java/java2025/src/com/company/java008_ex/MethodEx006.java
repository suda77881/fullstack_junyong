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
		
//		String name = "";  
//		int []atk = {0,0,0}; int[]dfs = {0,0,0}; int[]spd = {0,0,0};  
//		int total = 0 ;  
//		float avg = 0.0f;   
//		String grade = "", star = "", quest = "", type = "" ;  
//		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("이름_"); name = sc.next();
//		System.out.print("공격력_"); atk = sc.nextInt();
//		System.out.print("방어력_"); dfs = sc.nextInt();
//		System.out.print("민첩성_"); spd = sc.nextInt();
		
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
//		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
//		System.out.println("캐릭터   공격력   방어력   민첩성   총합   평균   등급   랭킹   추천퀘스트   캐릭터타입");
//		System.out.println("-------------------------------------------------------------------------------------------------");
//		System.out.printf("%s %d %d %d %d %.1f %s %s %s %s", name, atk,dfs, spd, total, avg, grade, star, quest, type);	;
		
//		ranka[i] = atk[i]; 
//		rankb[i] = dfs[i]; 
//		rankc[i] = spd[i]; 
//		rankt[i] = total[i]; 
//		
		
		}
//		
//		if(ranka[0] > ranka[0+1]) {ranka[0+2] += 1;} else if (ranka[i] > ranka[0]) {ranka[0] += 1;}
//		if(rankb[i] > rankb[i]) {rankb[i] += 1;} else if (rankb[i] > rankb[0]) {rankb[0] += 1;}
//		if(rankc[i] > rankc[i]) {rankc[i] += 1;} else if (rankc[i] > rankc[0]) {rankc[0] += 1;}
//		if(rankt[i] > rankt[i]) {rankt[i] += 1;} else if (rankt[i] > rankt[0]) {rankt[0] += 1;}
//		
//		
//		System.out.print("이름 :");
//		for (int i = 1; i < name.length+1; i++)
//		{ 
//		else if(ranka[i] > ranka[0]) {ranka[0] += 1;}}  
//		for (int i = 1; i < name.length+1; i++)
//		{ if(rankb[0] > rankb[i]) {rankb[i] += 1;} 
//		else if(rankb[i] > rankb[0]) {rankb[0] += 1;}} 
//		for (int i = 1; i < name.length+1; i++)
//		{ if(rankc[0] > rankc[i]) {rankc[i] += 1;} 
//		else if(rankc[i] > rankc[0]) {rankc[0] += 1;}} 
//		for (int i = 1; i < name.length+1; i++)
//		{ if(rankt[0] > rankt[i]) {rankt[i] += 1;} } 
		
		
//		for (int i = 0 ; i < name.length ; i++)
//		{
//			for (int j = 0 ; j < name.length; j++) {
//				
//				if (ranka[i] > ranka[j]) {ranka[i] -= 1;}
//				if (rankd[i] > rankd[j]) {rankd[i] -= 1;} 
//				if (ranks[i] > ranks[j]) {ranks[i] -= 1;} 
//				if (rankt[i] > rankt[j]) {rankt[i] -= 1;} 
//			}
//			
//		}
//		
//		
//		for (int i = 0 ; i < name.length ; i++)
//		{
//			System.out.print("이 름 : " + name[i] + "\t");
//			System.out.print("공격력 : " + atk[i] +"("+ ranka[i] +"위) \t" );
//			System.out.print("방어력 : " + dfs[i] +"("+rankd[i] +"위) \t" );
//			System.out.print("민첩성 : " + spd[i] +"("+ranks[i] +"위) \t" );
//			System.out.print("총 합 : " + total[i] +"("+rankt[i] +"위) \t" );
//			
//		}
		
		
		
		
		
		
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
	

}
