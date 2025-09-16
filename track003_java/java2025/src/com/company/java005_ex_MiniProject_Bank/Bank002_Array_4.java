package com.company.java005_ex_MiniProject_Bank;
import java.util.Arrays;
import java.util.Scanner;

public class Bank002_Array_4 {
   public static void main(String[] args) {
      //변수                          0   1    2
      String []id=new String[3];       //  one two three
      String []pass = new String[3];   // 1111 2222 3333
      double []balance = new double[3];// 1100 2200 3300   
      int num=-1;  
      Scanner scanner = new Scanner(System.in);
      int  login = 0;
 
      //입력 + 처리 + 출력
      //Q1. 9가 아니라면 계속무한반복  for(;;)  while(조건)
      while(num != 9) {
         System.out.println(Arrays.toString(id));
         System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + 
             "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회" + "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제  "
             +"\n\n👉 번호를 선택하세요:"
          );
         num = scanner.nextInt();
         
         //Q2. if else if ( 전체적인 큰틀)
         if(num==1) {
            //1. 빈칸인지 확인 >  if( 만약 0번째 가 빈칸이라면 ){ find는 0 }    원하는한줄 , 구조, 코드변환 , break
            int find=-1;   //find 빈칸찾아서 넣을 번호
            for(int i=0; i<id.length; i++) {    if(id[i] == null) {  find = i;  break; }  }
            if(find == -1) {   System.out.println("계좌를 생성할수 없습니다."); continue;  } 
            //2. 빈칸에 입력받기
            System.out.print("[1]아이디입력 > ");  id[find] = scanner.next();
            System.out.print("[2]아이디입력 > ");  pass[find] = scanner.next();
            System.out.print("[3]아이디입력 > ");  balance[find] = scanner.nextDouble();
         }else if(num==2 ||num==3 ||num==4 ||num==5) {
        	//1. 사용자인증 아이디를 입력받아 id[0]와 같고 비밀번호를 입력바당 pass[0]와 같다면 찾은번호는 0
        	 int find=-1; //find 인증할 번호
//        	 if ( login = 0);
        	 
        		 System.out.println("로그인이 필요합니다.");
        		 System.out.print("아이디 입력"); String tempid = scanner.next();
        		 System.out.print("비밀번호 입력"); String temppass = scanner.next();  		 
        	 for(int i=0; i<id.length; i++) {
        		 if(tempid.equals(id[i]) && temppass.equals(pass[i])) {find=i;}
        	 }
        	
        	 
            //2. 각각의 처리
        	 switch(num) {
        	 case 2: System.out.println("\n\n[1]아이디 > " + id[find] + 
        			 					"\n[2]비밀번호>" + pass[find] + "\n[3]잔액>" + balance[find] ); break;
        	 case 3: System.out.println("입금할 금액"); double temp1 = scanner.nextDouble(); 
        	 		 balance[find] += temp1;
        	 case 4: System.out.println("출금할 금액"); double temp2 = scanner.nextDouble(); 
        	 		 balance[find] -= temp2;
        	 case 5: System.out.println("정말로 삭제하시겠습니까?");
        	 		 if (scanner.next().toLowerCase().equals("y")) {
        	 			 id[find] = null; pass[find] = null; balance[find] = 0;
        	 			 
        	 		 }
        	 }
         } else {  System.out.println("메뉴를 확인해주세요~!"); }
         
      } // end while
   }// end main
}//end class