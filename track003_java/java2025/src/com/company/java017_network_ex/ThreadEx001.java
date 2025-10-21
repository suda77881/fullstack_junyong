package com.company.java017_network_ex;

import javax.swing.JOptionPane;

class QuestionCount extends Thread{

//	int sec = 10;
	@Override public void run() {
		for (int i = 10; i > 0; i--) {
//			System.out.println(sec --);
			System.out.println(i);
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) {  e.printStackTrace(); }
		}
		
		
	}
}


class Input extends Thread{
	
//	Scanner sc = new Scanner(System.in);

	@Override public void run() { 
//		System.out.println("사과 알파벳을 입력하세요."); String word = sc.next();
		String answer=JOptionPane.showInputDialog("사과 알파벳을 입력하세요.");
		System.out.println(answer.toLowerCase().equals("apple")? "정답" : "오답");
//		if (word.toLowerCase().equals("apple")) {
//
//			System.out.println("정답입니다.");
//
//		}
//		else {System.out.println("정답이 아닙니다.");}
	}
	
	
	
}

public class ThreadEx001 {

	public static void main(String[] args) {
		
		Thread in = new Input();
		Thread co = new QuestionCount();
		
		in.start();
		co.start();
		
		
		

	}

}
