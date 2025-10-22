package com.company.java017_network.ver2;


class Animal{}
//class Dog extends Animal , Thread {} // Mentol extends Thread 사용하지 못함.
// 1) Thread 상속 → Runnable 구현 2) run 수행내용 3) start 실행

class Dog extends Animal implements Runnable{ // 1) extends Thread 대신 implements Runnable = run () 반드시 사용

	@Override public void run() { // 2) run
		for (int i = 0; i < 5; i++) {
			System.out.println("멍");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
		
	}	
	
	
}

// Runnable implements 사용시 생성자 호출에 Thread 변수명 = new Thread( new 클래스명) ; 형태로 사용
// Thread extends 사용시 Thread 변수명 = new 클래스명();

public class Thread003_Runnable {
	public static void main(String[] args) {
//		Runnable sound = new Dog(); sound.run();;
		Thread sound = new Thread( new Dog()) ; sound.start(); //3( start
		for(int i =0; i<5; i++) {
			System.out.print("	◖⚆ᴥ⚆◗	");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
	}

}
