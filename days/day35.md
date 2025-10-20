```java
package com.company.java016_javaio;

import java.io.File;

public class JavaIO001_folder_file {

	public static void main(String[] args) {
			// 1. 경로체크
			String folder_abs="C:\\file\\";	//절대경로(시스템의 폴더기준-전체경로 C:\)
			String folder_rel="src/com/company/java016_javaio_ex/";	//상대경로(현재작업 폴더기준) 슬러쉬 위치 주의
			String file_path="io001.txt";
			
			// 2. 폴더 + 파일 준비
			File folder = new File(folder_rel);	// ctrl + shift + o
			File file 	= new File(folder_rel + file_path);
			// 폴더가 없다면 		   폴더    만들기
			try {
			if (!folder.exists()) {folder.mkdir();}
			if (!file.exists()) {file.createNewFile();}
			
			}catch (Exception e) {e.printStackTrace();}
			System.out.println("폴더/파일 준비완료");
	}	// ctrl + f11 / f5 (새로고침)

}
```
 

 ```java
 package com.company.java016_javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 */
public class JavaIO002_byte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//#1. 경로
		String folder_rel="src/com/company/java016_javaio_ex/";	//상대경로(현재작업 폴더기준) 슬러쉬 위치 주의
		String file_path="io002.txt";
		
		File folder = new File(folder_rel);
		File   file = new File(folder_rel + file_path);
		
		//#2. 폴더 + 파일만들기 
		try {
		if (!folder.exists()) { folder.mkdir();}
		if (  !file.exists()) { file.createNewFile();}
		}catch(Exception e) {e.printStackTrace();}
		
		//#3. byte 파일쓰기 	InputStream > [프로그램] > (OutputStream #)
		try {
			OutputStream output = new FileOutputStream(file);
			output.write('j');
			output.write('a');
			output.write('v');
			output.write('a');
			output.close();
			System.out.println("OutputStream 쓰기완료!");
		} catch (FileNotFoundException e) {e.printStackTrace();	// 파일을 못찾을경우
		} catch (IOException e) {e.printStackTrace();}	// 입력출력이 안될경우
		
		
		//#4. byte 파일읽기    (InputStream #) > [프로그램] > OutputStream #
		try {
			InputStream input = new FileInputStream(file);
			int cnt = 0;
			while( ( cnt=input.read() ) != -1) { // -1 끝
				System.out.print( (char) cnt );
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

/*
1. Java IO
- 입력(input)과 출력(output)
- 두 대상간의 데이터를 주고 받는것
- 스트림이란? 사용연결통로  

	입력스트림		→		[프로그램]		 →		 출력스트림				/ / 프로그램기준 단일
			InputStream 		OutputStream			
			Reader				Writer
2. Java IO 분류	  
- byte / char 단위
- byte 단위(InputStream / OutputStream) - 모든 종류( 그림, 멀티미디어, 문자 )
- char 단위(Reader	   / Writer)	  - 문자

3. 보조스트림
---------------------------------------------------------------------
- new BufferedReader(new InputStreamReader (FileInputStream(file)))	 바이트단위로 잘라서 받겠다
---------------------------------------------------------------------
- 1) new FileInputStream (네트워크나, 사용자가 넣어준 값) byte[#] / char
- 2) new InputStreamReader 바이트를 [문자]스트림으로 - 텍스트처리가능
- 3) new BufferedReader 속도향상
*/
```

```java
package com.company.java016_javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class JavaIO003_char {
	public static void main(String[] args) {
		//#1. 경로
		String folder_rel="src/com/company/java016_javaio_ex/";	//상대경로(현재작업 폴더기준) 슬러쉬 위치 주의
		String file_path="io003.txt";
		
		File folder = new File(folder_rel);
		File file   = new File(folder_rel+ file_path);
		
		
		//#2. 폴더 + 파일만들기	exists / mkdir / createNewFile
		try {
			if (!folder.exists()) {folder.mkdir();}
			if (!file.exists()) {file.createNewFile();}
			System.out.println("1) 파일/폴더 만들기");	
		}
		catch (Exception e) {e.printStackTrace();}
		
		
		
		//#3. char 쓰기	Reader > [프로그램] > (Writer #)
		try {
			Writer writer = new FileWriter(file);
			writer.write("hello\n");	// 버퍼에 저장
			writer.write("java ");	// 버퍼에 저장
			writer.flush();	// 버퍼 (임시저장공간)에 저장된 데이터를 강제로 출력스트림으로 밀어내기
							// 버퍼에 있는 내용을 즉시 파일에 쓰기
			writer.close();	// 스트림 닫기 (입력대기 상태를 해제)
			System.out.println("2) Writer 쓰기완료");
		} catch (IOException e) {	e.printStackTrace();	}
		
		//#4. char 읽기 	(Reader #) > [프로그램] > Writer
		
		try {
			Reader reader = new FileReader(file);
			int cnt=0;
			while( (cnt=reader.read()) != -1	) {
				System.out.print( (char)cnt );
			}
			reader.close();
		} catch (FileNotFoundException e) {  e.printStackTrace(); } 
		  catch (IOException e) {  e.printStackTrace();}
		

	}

}
 
```



```java

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



```


```java

package com.company.java016_javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Newtwork001_url {

	public static void main(String[] args) {
			
		try {
			//1. Url
			URL url = new URL("https://www.google.com/");
			
			//2. 연결객체 (HttpURLConnection)
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();	
			
			//3. 요청설정
			conn.setRequestMethod("GET");	//	
			conn.setDoInput(true); conn.setDoOutput(true); conn.setReadTimeout(1000); // 1초
			//4. 응답코드
			int code = conn.getResponseCode(); // 구글에서 응답
			System.out.println(code);  		// 200 응답성공!	404페이지 없음 		500 코드오류
			//5. 응답데이터		BufferdReader	    >  [Network001 - 프로그램] > 			BufferedWriter 
			BufferedReader br;
			if(code == 200) { 
					// 한줄씩읽을 수 있게 속도향상	-바이트스트림을 문자스트림		  - 응답 데이터 스트림
				br = new BufferedReader(new InputStreamReader(		conn.getInputStream()));
			}else {
					//												  - 에러인 경우
				br = new BufferedReader(new InputStreamReader( 		conn.getErrorStream()));
			}
			String line=""; StringBuffer sb = new StringBuffer();
			while( ( line = br.readLine()) != null   ) { sb.append(line+"\n"); }	
			
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
			
		} catch (MalformedURLException e) {  e.printStackTrace(); 
		} catch (IOException e) {  e.printStackTrace(); }
		
		

	}// end main

}// end class



/*
 1. id / secret

Client ID		5LXF8r4usyC9wB1R7H4m
Client Secret	kB5j9VUHrv

2. 요청 URL 

https://openapi.naver.com/v1/search/book.xml	XML
https://openapi.naver.com/v1/search/book.json	JSON

3. HTTP 메서드 : GET 

4. 파라미터 - 요청 내용을 주소 표시창줄에 데이터 넣어서 줄께 - 파라미터를 쿼리 스트링 형식으로 전달합니다.

파라미터	타입	필수 여부	설명
query	String	Y	검색어. UTF-8로 인코딩되어야 합니다.

https://openapi.naver.com/v1/search/book.xml?query =사용자가 요청한값 (쿼리 스트링 형식)
https://openapi.naver.com/v1/search/book.json?query=사용자가 요청한값 (쿼리 스트링 형식) 
  
*/


```


```java

package com.company.java016_javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Network002_naver_book {

	public static void main(String[] args) {
		try {
			//#1. URL
			String apiurl = "https://openapi.naver.com/v1/search/book.json?query="	
				// String 자료형으로 apiurl 변수에 네이버 api 에서 지정한 book.json주소와, query="형식으로 검색할 수있게 만든다.
					+ URLEncoder.encode("삼총사" , "UTF-8"); 
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

	https://openapi.naver.com/v1/search/book.xml	XML
	https://openapi.naver.com/v1/search/book.json	JSON

	3. HTTP 메서드 : GET 

	4. 파라미터 - 요청 내용을 주소 표시창줄에 데이터 넣어서 줄께 - 파라미터를 쿼리 스트링 형식으로 전달합니다.

	파라미터	타입	필수 여부	설명
	query	String	Y	검색어. UTF-8로 인코딩되어야 합니다.

	https://openapi.naver.com/v1/search/book.xml?query =사용자가 요청한값 (쿼리 스트링 형식)
	https://openapi.naver.com/v1/search/book.json?query=사용자가 요청한값 (쿼리 스트링 형식) 
	  
	*/


```



```java



```
