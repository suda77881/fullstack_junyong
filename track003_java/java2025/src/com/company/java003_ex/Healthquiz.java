package com.company.java003_ex;

import java.util.Scanner;

public class Healthquiz {

	public static void main(String[] args) {
		
		int walk, health, sleep, score1, score2, score3, result;
		double avg;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하루 걸음 수를 입력하세요(번)"); walk = sc.nextInt();
		System.out.print("운동 시간을 입력하세요(분)"); health = sc.nextInt();
		System.out.print("수면 시간을 입력하세요(시간)"); sleep = sc.nextInt();
		
		score1 = walk / 1000;
		score2 = health / 10;
		score3 = sleep * 2 ;
		result = score1 + score2 + score3;
		avg = (double)result / 3.0;
		int level = (int)avg / 2;
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::                      HEALTH TRACKER                      ::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("걸음수 운동시간 수면시간 총점 평균 건강레벨");
//		System.out.printf("%d     %d     %d" , score1, score2,score3  );
		System.out.printf("%d     %d     %d     %d  %.2f %d" , walk, health, sleep, result, avg, level );
	}
}
