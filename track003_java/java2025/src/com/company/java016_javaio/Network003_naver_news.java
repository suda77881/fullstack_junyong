package com.company.java016_javaio;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Network003_naver_news {

	public static void main(String[] args) {
		try {
			//#1. URL
			String apiurl = "https://openapi.naver.com/v1/search/news.json?query="	
				// String 자료형으로 apiurl 변수에 네이버 api 에서 지정한 book.json주소와, query="형식으로 검색할 수있게 만든다.
					+ URLEncoder.encode("캄보디아" , "UTF-8"); 
			// URLEncoder클래스의 encode메서드를 활용하여 , 삼총사라는 한글단어를 UTF-8형식으로 한글이 깨지지않게 인코딩하여 입력한다.
			
			// 검색창 예시 apple 검색어 : 
			// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8& query=apple &ackey=ryau7ks8
			
			URL url = new URL(apiurl);
			
			//#2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			// HttpURLConnection 클래스를 conn 변수에 담아서 (HttpURLConnection)자료형으로 url.openConnection(); 클래스.메서드를 담는다?
			//#3. 요청설정	- GET
			//	X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
			//	X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
			conn.setRequestMethod("GET");	// conn의 요청메서드를 GET으로 설정한다.
			conn.setRequestProperty("X-Naver-Client-Id", "5LXF8r4usyC9wB1R7H4m"); //conn의 요청속성을 ID = 발급받은아이디
			conn.setRequestProperty("X-Naver-Client-Secret", "kB5j9VUHrv");		  //conn의 요청속성을 Secret = 발급받은시크릣 으로 변경
			
			//#4. 응답확인
			BufferedReader br;	// Buffered 클래스로 br변수를 선언하고
			
			if(conn.getResponseCode() == 200) {	// 반환되는 코드가 200일시에
				br = new BufferedReader(new InputStreamReader(conn.getInputStream())); // 겟인풋스트림으로 정보를 받는다.
			}else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));	// 에러인경우
				
			}
			//#5. 응답데이터
			String line="";	// 라인변수
			StringBuffer sb = new StringBuffer();
			while( (line = br.readLine()) != null) {sb.append(line + "\n");} 
			// 마지막줄이 아닌경우 (마지막줄 = null값)	sb.append로 줄단위+ 줄바꿈으로 담는다.
			
			
			System.out.println(sb.toString());
			br.close(); conn.disconnect();	//	버퍼를 닫고, 연결해제
			
		} catch (MalformedURLException e) { e.printStackTrace();	// 주소가 잘못 입력된 경우
		} catch (UnsupportedEncodingException e) { e.printStackTrace();
		} catch (IOException e) {  e.printStackTrace();
		}
		
	
	
	}// end main

}// end class




	/*
	 1. id / secret

	Client ID		5LXF8r4usyC9wB1R7H4m
	Client Secret	kB5j9VUHrv

	2. 요청 URL 

	https://openapi.naver.com/v1/search/news.xml	XML
	https://openapi.naver.com/v1/search/news.json	JSON

	3. HTTP 메서드 : GET 

	4. 파라미터 - 요청 내용을 주소 표시창줄에 데이터 넣어서 줄께 - 파라미터를 쿼리 스트링 형식으로 전달합니다.

	파라미터	타입	필수 여부	설명
	query	String	Y	검색어. UTF-8로 인코딩되어야 합니다.

	https://openapi.naver.com/v1/search/book.xml?query =사용자가 요청한값 (쿼리 스트링 형식)
	https://openapi.naver.com/v1/search/book.json?query=사용자가 요청한값 (쿼리 스트링 형식) 
	  
	*/
