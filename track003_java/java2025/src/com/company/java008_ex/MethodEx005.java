package com.company.java008_ex;
import java.util.Scanner;
public class MethodEx005 {
	
	
	
	public static int process_total (int kor,int eng,int math) {return kor + eng + math;}
	public static float process_avg (int total) {return total / 3.0f;}
	public static String process_pass (float avg, int kor, int eng, int math) 
	{ if (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {return "합격";} else {return "불합격" ;} }
	public static String process_scholar (float avg) 
	{if (avg >= 95){return"장학생";}else{return"---";}}
	public static String process_star (float avg) 
	
	{if (avg >= 70 && avg < 80)       {return "*******";}
	else if (avg >= 10 && avg < 20)  {return "*";}
	else if (avg >= 20 && avg < 30)  {return "**";}
	else if (avg >= 30 && avg < 40)  {return "***";}
	else if (avg >= 40 && avg < 50)  {return "****";}
	else if (avg >= 50 && avg < 60)  {return "*****";}
	else if (avg >= 60 && avg < 70)  {return "******";}
	else if (avg >= 80 && avg < 90)   {return "********";}
	else if (avg >= 90 && avg < 100)  {return "*********";}
	else if (avg == 100)              {return "**********";}
	else {return "---";}
	}
	
//	public static String process_star (float avg) 
//	{String result = ""; 
//	for (int i = 1; i < avg / 10.0; i++ ) { result += "*";} return result;}
//	
	
	
	public static void main(String [] args) {
		
		 /////////////////////(1)  변수
	      String name  = ""; 
	      int kor, eng, math, total ;
	      float avg = 0.0f; 
	      String pass = "";
	      String jang = "";
	      String star= "";  
	      Scanner sc = new Scanner(System.in);
	      
	      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
	      System.out.print("이름 입력 >"); name = sc.next();
	      System.out.print("국어 입력 >"); kor = sc.nextInt();
	      System.out.print("영어 입력 >"); eng = sc.nextInt();
	      System.out.print("수학 입력 >"); math = sc.nextInt();
	      /////////////////////(3) 처리 : 
	      total = process_total(kor , eng, math);    // 1. 총점처리
	      avg = process_avg(total);    //2.  평균처리
	      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
	      pass = process_pass(avg , kor, eng, math);  
	      
	      //////// 4. 평균이 95점이상이면 장학생
	      jang = process_scholar(  avg  ); 
	      
	      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
	      star = process_star(avg);  
	      
	      
	      /////////////////////(4) 출력
	      process_show(name, kor, eng, math, total, avg, pass, jang, star);
	      
	      
	}// end main
	public static void process_show (String name, int kor, int eng, int math, 
	  		  int total, float avg, String pass, String jang, String star){
	    System.out.println(":::::::::::::::::::::::::::::::"
	    		+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	    System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n"
	  		  , "NAME", "KOR", "ENG", "MATH", "TOTAL", "AVG", "PASS", "장학생", "LEVEL");
	    System.out.println("----------------------------------------------------------");
	    System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n"
	  		  , name, kor, eng, math, total, avg, pass, jang, star);
	    System.out.println("----------------------------------------------------------");}
	

}// class
