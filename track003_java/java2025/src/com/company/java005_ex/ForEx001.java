package com.company.java005_ex;

public class ForEx001 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		for(int i = 5; i >= 1; i--) {
			System.out.print(i + "\t");
		}
			
		System.out.println();	
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("JAVA" + i + "\t");
		}
		// syso("\n\nq4");
		System.out.println();	
		
		for(int i = 3; i >= 1; i--) {
			System.out.print("HAPPY" + i + "\t");
		}
		
		System.out.println();	
		
		// for(int i=0; i<=2; i++) {syso((i==0? "": ",") + i +"\t" ); }
		
		for(int i = 0; i <= 2; i++) {
			if (i == 2)	System.out.print(i);
			else System.out.print(i + ",");
			
		}
		
		System.out.println();	
		
		for(int i = 0; i <= 99; i++) {
			if  (i <= 3 )	System.out.print(i + ",");
		else if (i == 99) System.out.println(i);	
		else System.out.print(",");
		// for(int i=0; i<=99; i++) {syso((i==0? "": ",") + i +"\t" ); }
			
		}
		
		System.out.println();	
		
		for(int i = 10; i >= 1; i--) {
			if  (i >= 10 || i >= 9 )	System.out.print(i + ",");
		else if (i == 1) System.out.print(i);	
		else System.out.print(",");
		// for(int i=10; i>=1; i--) {syso((i==10? "": ",") + i +"\t" ); }	
		}
		
		System.out.println();	
		
		for(int i = 0; i <= 8; i+=2) {	// 
			if  (i < 8)	System.out.print(i + ",");
			
		else if (i == 8) System.out.print(i);	
//		else System.out.print(",");
		// for(int i=0; i<=8; i=i+2) {syso((i==0? "": ",") + i +"\t" ); }
		}
			
		System.out.println();	
		
		for(int i = 0; i <= 18; i+=2) {
			if  (i <= 8)	System.out.print(i + ",");
		else if (i >= 18) System.out.print(i);	
		else System.out.print(",");
		//	else System.out.print(",");
		// for(int i=0; i<=18; i=i+2) {syso((i==0? "": ",") + i +"\t" ); }
			
		}
			
			

			
	}

}

