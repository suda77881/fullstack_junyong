package com.company.java017_network_ex;
//1. Candy를 Mentol클래스가 상속받는경우 1초에 1개팔렸다라고 실행클래스 만들려고함.
/*	Runnable	Candy		- name / sell
  		  △....	  ↑
  	      MentolSeller
 
 */
class Candy{	
	String name;	
	public void sell() { System.out.println(name + "가 1개 팔렸습니다."); }
}
class MentolSeller extends Candy implements Runnable{	// ##1) Runnable
	@Override public void run() { // ##2 ) 실행내용
		while(true) {
			sell();
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
		
		
	}
	
	
}	
//2. MentolSeller extends Thread 불가능. 여기서 사용할 수 있는 것은 Runnable 이용 ★
//3. 구현내용인 run ★ 1초에 Thread.sleep(1000) 1개씩팔렸다 sell()

public class ThreadEx002 {
	public static void main(String[] args) {
//		 4. MentolSeller start 실행해주기
		Thread 		 seller0= new Thread(new MentolSeller()); // name을 설정한적이 없음.
		MentolSeller seller = new MentolSeller(); seller.name="멘톨캔디";
		Thread	     t 		= new Thread(seller); t.start();
		

		for(int i=0; i<5; i++) {
			System.out.println(" 손님 기다리는 중 ......");
			try { 
				
				Thread.sleep(1000); seller.run();} 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}

	}

}
