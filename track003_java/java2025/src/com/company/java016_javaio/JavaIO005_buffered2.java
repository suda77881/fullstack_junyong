package com.company.java016_javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class JavaIO005_buffered2 {

	public static void main(String[] args) throws IOException {
		//#1. 경로
		
		String folder_rel="src/com/company/java016_javaio_ex/";	//상대경로(현재작업 폴더기준) 슬러쉬 위치 주의
		String file_path="io0012.txt";
		
		//#2. 폴더 + 파일 만들기 [##]
		
		File folder = new File(folder_rel);
		File file   = new File(file_path);
		
		if (!(folder.exists())) { folder.mkdir(); }
		if (!(file.exists())) {	file.createNewFile();}
		
		
		//#3. 파일쓰기	 InputStream >	[프로그램] > OutputStream #
		// BufferedWriter(속도향상) - OutputStreamWriter(단어) - FileOutputStream(byte)
		// a(버퍼) → a(비우기) abc(버퍼) → abc(한번에 모았다가 비우기)
		
		InputStream  fi = new FileInputStream(file);
		Writer fo = new FileOutputStream(file);
		
		
		fo.write( (char)"에라이");
		fo.flush();
		fo.close();
		
		
		//#4. 파일읽기  InputStream # >	[프로그램] > OutputStream
		// BufferedReader(속도향상) - InputStreamReader(단어) - FileInputStream(byte)
		
		while ((fi.read()) != -1) {
			System.out.println(fi.read());
		}
		
	}

}
