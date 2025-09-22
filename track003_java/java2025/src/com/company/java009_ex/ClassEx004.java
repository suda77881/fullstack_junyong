package com.company.java009_ex;

import java.util.Scanner;

class TV{
	
	String channel; int volume;   
	
	
	public TV(String channel, int volume){
		
		this.channel = channel;
		this.volume = volume;

	}
	
	public TV() {
		
		
		
	}
	
	
	void input() {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("channel 입력 >");this.channel = sc.next();
		System.out.print("volume 입력 >");this.volume = sc.nextInt();
		
		
	}
	
	
	void show() {
		
	System.out.printf("%s %d \n" ,this.channel, this.volume );	
	}
	

	
}


public class ClassEx004 {
    public static void main(String[] args) {
   TV  t1 = new TV("JDBC" , 8);
   t1.show(); 
   TV  t2 = new TV();
   t2.input();  
   t2.show();
   }
}