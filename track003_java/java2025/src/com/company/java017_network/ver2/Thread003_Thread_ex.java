package com.company.java017_network.ver2;

class Chicken extends Thread{

	@Override public void run() {	
		for (int i=0; i<5; i++) {
			System.out.print("꼬끼오#" + (i+1) + " ");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace();}
		}
	}
}

class Cow extends Thread{

	@Override public void run() {  
		for (int i=0; i<5; i++) {
			System.out.println("음머#" + (i+1) + " ");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
	}
	
}

public class Thread003_Thread_ex {

	public static void main(String[] args) {
		Thread cow = new Cow(); 	cow.start();
		Thread chicken = new Chicken(); chicken.start();
		
	}

}
