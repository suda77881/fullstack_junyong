package com.company.java006_ex;
import java.util.Scanner;
public class ForEx007 {
	public static void main(String[] args) {
		
		int kor=-1, eng=-1, mat=-1, total; double avg;
		String jang= "", pass = " ", level="", num="";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학번 입력 >"); num = sc.next();
		
		for (;;) {
			if (!(kor > 100 || kor < 0 )) {break;}
			else System.out.println("국어점수 입력 >"); kor = sc.nextInt(); continue;
		}
		// kor <= 100 && kor >= 0
//		System.out.println("영어점수 입력 >"); eng = sc.nextInt();
		for (;;) {
			if (!(eng > 100 || eng < 0 )) {break;}
			else System.out.println("영어점수 입력 >"); eng = sc.nextInt(); continue;
		}
//		System.out.println("수학점수 입력 >"); mat = sc.nextInt();
		for (;;) {
			if (!(mat > 100 || mat < 0 )) {break;}
			else System.out.println("수학점수 입력 >"); mat = sc.nextInt(); continue;
		}
		
		
		
		
		total = kor + eng + mat ;
		
		avg = total / 3.0;
		
//		System.out.println(total+ " " + avg);
		
		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40 ) {pass="합격";}
		
		if (avg >= 95) {jang = "장학생";}
		
			 if (avg >= 90) {level = "수";}
		else if (avg >= 80) {level = "우";}
		else if (avg >= 70) {level = "미";}
		else if (avg >= 60) {level = "양";}
		else {level = "가";}
			 
		System.out.println("============================================================== ");
		System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s \n" ,"학번","국어", "영어", "수학", "총점", 
				"평균", "합격여부", "레벨", "장학생");
		System.out.printf("%-5s %-5d %-5d %-5d %-5d %-5.2f %-5s %-5s %-5s \n",num, kor, eng, mat, total, avg, pass, level, jang);
		System.out.println("============================================================== ");
		
			 
			 
	}

}
