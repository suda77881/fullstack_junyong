package com.company.java017_network_ex;

//import java.util.Scanner;

import javax.swing.JOptionPane;

class Count extends Thread {	// 1) extends Thread , implements Runnable

	@Override public void run() { // 2) todo
		
		for (int i = 10; i > 0; i-- ) {
			
			try {
				System.out.println(i);
			Thread.sleep(1000);}
			catch (InterruptedException e) {break;}
		}
	}
}


public class ThreadEx003 { 

	public static void main(String[] args) { // 실행클래스 - main
//		Scanner sc = new Scanner(System.in);
		String info = "계속 카운트합니다.";
		Thread count = new Count(); count.start();
		
		String select = JOptionPane.showInputDialog("종료하시겠습니까? Y/N");
			
			if (select.toUpperCase().equals("Y")) {	count.interrupt(); info ="카운트를 멈춥니다.";	}
			
			System.out.println(info);
			System.out.println("> main end......");
	}

}
