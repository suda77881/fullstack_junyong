package com.company.java011_ex;
// 패키지 다를시 import필요

import java.util.Arrays;

//Apple [name=RED, order=iron, num=2, price=1000]
//Apple [name=GREEN, order=hulk, num=1, price=1500]
//Apple [name=GOLD, order=captain, num=3, price=2000]

public class ClassArrEx1{
	  public static void main(String[] args) {
	        Apple[] apples= new Apple[3]; 
	       
	        //위의 화면처럼 값 셋팅
	        String []name = {"RED","GREEN","GOLD"};
	        String []order = {"iron","hulk","captain"};
	        int []num = {2,1,3};
	        int []price = {1000,1500,2000};
	        
	        
	        apples[0] = new Apple("RED", "iron", 2, 1000);
	        apples[1] = new Apple("GREEN", "hulk", 1, 1500);
	        apples[2] = new Apple("GOLD", "iron", 3, 2000);
	        
	        System.out.println("ver-1 for");
	        for(int i = 0; i<apples.length; i++) {System.out.println(apples[i]);}
	        
	        System.out.println("\nver-2 향상된 for");
	        // 	한개씩 		: 배열, 객체명 
	        for ( Apple a : apples) {System.out.println(a);}
	        
	        Apple[] apples2 = new Apple[] {
	        		new Apple("RED", "iron", 2, 1000) , new Apple("GREEN", "hulk", 1, 1500)
	        		, new Apple("GOLD", "captain", 3, 2000)
	        };
	        System.out.println(Arrays.deepToString(apples2));
	        
	        
//	        for (int i = 0; i < apples.length; i++ ) {
//	        	apples[i] = new Apple(name[i],order[i],setNum[i],price[i]); 
//	        	
//	        	
//	        	apples[i].setName(name[i]);
//	        	apples[i].setNum(num[i]);
//	        	apples[i].setPrice(price[i]);
//	           
//	        }
//	        
//	        System.out.println(apple);
	        
	        
	        //위의 화면처럼 출력
	  }
	}