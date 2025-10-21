package com.company.java017_network;

import java.awt.Toolkit;

//1. 프로세스 - 실행중인 프로그램
//2. 프로세스 - 자원(데이터, 메모리) + Thread(실제작업수행) ■ Sound
//3. 작업수행클래스 만드는 법 - Thread(상속-run-start) , Runnable
class PigSound extends Thread{ 
	// #1. 상속 Thread( 작업수행클래스 )
	@Override public void run() {
		//#2. 비프음
		try {Thread.sleep(10);} 
		catch (InterruptedException e) {  e.printStackTrace(); }
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(1000);	} 
			catch (InterruptedException e) { e.printStackTrace();} 
			// ˙Ꙫ˙ ˙Ꙫ˙ ˙Ꙫ˙ ˙Ꙫ˙ ˙Ꙫ˙ 꿀 꿀 꿀 꿀 꿀 
			
		 }
		}
}
class PigCnt extends Thread{//#1. 작업수행클래스 상속

	@Override public void run() {  // #2. run
		for (int i = 0; i<5; i++) { // toolkit.beep()
			System.out.print((i+1) + "마리 ");
			try { Thread.sleep(1000); }  
			catch (InterruptedException e) {  e.printStackTrace();}
			
		}
	}
	
}
	
public class Thread002 {
	public static void main(String[] args) {
		System.out.println("001. Thread");
		Thread count = new PigCnt();   count.start();
		Thread sound = new PigSound(); sound.start();// #3
		//#1 ˙Ꙫ˙
		for (int i=0; i<5; i++) {
			System.out.print("˙Ꙫ˙");
			try { Thread.sleep(1000);	} 
			catch (InterruptedException e) { e.printStackTrace();}
		}
	}
}


//˙Ꙫ˙ ˙Ꙫ˙ ˙Ꙫ˙ ˙Ꙫ˙ ˙Ꙫ˙ 
// 꿀   꿀  꿀   꿀   꿀

/*****************************
1. 프로세스 : 실행중인 하나의 프로그램
2. 멀티프로세스 : 동시에 여러 프로세스를 실행
	크롬 실행 → 프로세스1
		  실행 → 프로세스2
			실행 → 프로세스3
3. 프로세스 구성 
- 자원(Resource) + Thread(자원으로 실제 작업을 수행)
- 모든 프로세스는 최소한 하나의 스레드 ( main )	 		
- 같은 프로세스 내의 스레드들은 서로 자원을 공유

4. 동시성과 병렬성
- 동시에 실행하는 것 같은효과(동시성과 병렬성)
- 동시성 : 하나의 코어, 멀티스레드가 번갈아가면서 실행
	 작업수 > 일하는 일꾼(코어수)
	 1명 일꾼 : 1작업 → 2작업 → 3작업

- 병렬성 : 멀티 코어에서 개별 스레드를 동시에 실행
	작업수 < 일하는 일꾼 (코어수)
	
5. 작업스레드 생성
- 1) Thread 상속 2) Runnable 인터페이스 구현


*/