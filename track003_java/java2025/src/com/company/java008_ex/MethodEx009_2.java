package com.company.java008_ex;
import java.util.Scanner;
public class MethodEx009_2{ 
	public static void who_are_you(String [][] users){// 아이디를입력받아서 나라조회 
		// 변수
		String tempid="";
		String result="정보를 확인해주세요";
		Scanner sc = new Scanner(System.in);
		// 입력 - 아이디를 입력 받아서
		System.out.print("아이디 > "); tempid = sc.next();
		// 처리 - if(입력받은 아디와 users[0][0]이 같다면) if( 입력받은 아이디와 users[1][0]이 같다면)
		
		if (tempid.equals(users[i][0])) 
		{result = tempid + "의 나라는" + users[i][2] + "입니다. ";}
		if (tempid.equals(users[i][0])) 
		{result = tempid + "의 나라는" + users[i][2] + "입니다. ";}
		// 출력 - 나라출력 		   users[0][2]						   users[1][2]
		
		
		}
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		// 변수
		   String [][] users = {{ "aaa"  , "111"   , "한국"     } ,     // 00 01 02
		                      { "bbb" , "222"   , "호주"       } ,       // 10 11 12
		                      { "ccc"  , "333"   , "중국"      }};      // 20 21 22
		   // 입력
		   System.out.print("아이디를 입력해주세요"); 
		   who_are_you(users);    
		   //  
		   who_pass_change(users); 
		   //  public static void who_pass_change(String [][] users)
		   //  { 아이디,비밀번호가 맞으면 비밀번호 바꾸기}
		
		
	
	
	}
	public static void who_pass_change(String [][] users){
		/* 아이디, 비밀번호가 맞으면 비밀번호 바꾸기 */
		//변수
		String tempid="", temppass="";
		Scanner sc = new Scanner(System.in);
		//입력
		//아이디입력받기
		//비밀번호입력받기
		//처리 - 입력한아이디와 user[0][1] 맞고 입력한 비밀번호와 user[0][1] 이 같으면 찾은 번호는 0층 
		//{ user[0][1] = sc.next();}
		//처리 - 입력한아이디와 user[1][1] 맞고 입력한 비밀번호와 user[1][1] 이 같으면 찾은 번호는 1층 
		//{ user[1][1] = sc.next();}
		//출력
		//정보확인 : [bbb, 123, 호주] 00 01 02
		
		
		
		
		
		
		}
	
	
	}