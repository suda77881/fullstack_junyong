package com.company.java011_ex;
import java.util.Scanner;
public class Pet{  

	   private String name;  
	   private int walkTime, snackCount, cuddleCount, moodScore;  
	   private String snackStars, tailWag, todayMessage;  
	   
	   @Override
	public String toString() {
		return "Pet [name=" + name + ", walkTime=" + walkTime + ", snackCount=" + snackCount + ", cuddleCount="
				+ cuddleCount + ", moodScore=" + moodScore + ", snackStars=" + snackStars + ", tailWag=" + tailWag
				+ ", todayMessage=" + todayMessage + "]";
	}

	   public String getName() {
		return name;
	}

	   public void setName(String name) {
		   this.name = name;
	   }

	   public int getWalkTime() {
		   return walkTime;
	   }

	   public void setWalkTime(int walkTime) {
		   this.walkTime = walkTime;
	   }

	   public int getSnackCount() {
		   return snackCount;
	   }

	   public void setSnackCount(int snackCount) {
		   this.snackCount = snackCount;
	   }

	   public int getCuddleCount() {
		   return cuddleCount;
	   }

	   public void setCuddleCount(int cuddleCount) {
		   this.cuddleCount = cuddleCount;
	   }

	   public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

  public Pet(String name, int walkTime, int snackCount, int cuddleCount) {
		super();
		this.name = name;
		this.walkTime = walkTime;
		this.snackCount = snackCount;
		this.cuddleCount = cuddleCount;

	}
	   public static void info () {
		   
		   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		   System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s","이름","산책시간","간식개수","쓰다듬횟수","행복도","간식보상","꼬리흔들기","오늘의멘트");
		   
	   }
	   

	   public void process_MoodScore() {this.moodScore = this.walkTime + (this.snackCount * 10) + (this.cuddleCount * 5);}
	   public void process_SnackStars() {this.snackStars = this.moodScore >= 90 ? "★★★★★" : this.moodScore >= 70 ? "★★★★" : this.moodScore >= 50 ? "★★★" : this.moodScore >= 30 ? "★★" : "★"  ;}
	   public void process_tailWag() {this.tailWag = this.moodScore >= 90 ? "흔들흔들흔들" : this.moodScore >= 60 ? "흔들흔들" : this.moodScore >= 40 ? "살짝 흔들" : "꼬리 내림"  ;}
	   public void process_todayMessage() {this.todayMessage = this.moodScore >= 90 ? "오늘은 정말 행복했어요!" : this.moodScore >= 60 ? "좋은 하루였어요!" : this.moodScore >= 40 ? "조금 더 놀아줘요!" : "외로웠어요..."  ;}
	   
	   public void show() {
		   
		   
		   process_MoodScore();
		   process_SnackStars();
		   process_tailWag();
		   process_todayMessage();
		   System.out.printf("\n%-5s\t%-5d분\t%-5d개\t%-5d회\t%-5d\t%-5s\t%-5s\t%-5s",this.name,this.walkTime,this.snackCount,this.cuddleCount,this.moodScore,this.snackStars,this.tailWag,this.todayMessage);
	   }
	   
	} // java011_ex에 설정해주세요!