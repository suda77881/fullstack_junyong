package com.company.java006_ex;
import java.util.Scanner;
public class ArrayExUpgrade1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char answers = ' '; //{'A', 'C', 'B', 'D', 'A'}; 
		char []correct = {'A', 'C', 'B', 'A', 'A'};
		int num = 0, num2 = 0;
		
		
		for (int i = 0; i <= correct.length-1; i++) {
			
			System.out.print("정답을 입력해주세요>_"); answers = sc.next().charAt(0);
//			System.out.print("" + answers + " " +correct[i] + " " + correct.length);
			if (answers == correct[i]) 
			{System.out.print("\n"+((num = i)+1) + "번:정답\n");num2++;
				
			}else {System.out.print((num = i)+1 + "번:오답\n");}
			
			answers = ' ';
		
		}
		
//		String a = "A B C";
//		char []c = {(char)a};
		System.out.println("총 맞은 갯수:"+num2);

			
	}
		
}


