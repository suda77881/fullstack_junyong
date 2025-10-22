package com.company.java017_network.ver2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

/////////////////////////////////////////////////////////
public class Network002_Server {
	public static void main(String[] args) {
		//#1. 서버소켓 ( AS 센타 ) [socekt,socekt,socekt,,,]
		ServerSocket ascenter=null;
		Socket       socket;
		//#2. localhost(127.0.0.1) / port(80웹, 443웹자물쇠)
		try {
			ascenter = new ServerSocket(703);
			System.out.println("[Server] 1. 서버준비완료 A/S 센터 OPEN.... ");
		} catch (IOException e) { e.printStackTrace(); }
		
		//#3. 클라이언트 요청(accept)오면 상담사(Socket)연결
		try {
			System.out.println("[Server] 2. 고객기다리는중... ");
			socket = ascenter.accept();
			// 3-1. 연결요청들어오기 기다리는 중인데 ,,,, 연결이 오면 수락할께
			// 3-2. 연결이 들어올때까지 STOP
			// 3-3. 연결이 들어오면.... Socket으로 연결
			System.out.println("[Server] 4. 고객님 연락와서 상담사랑(socket)연결함... ");
			
			//#4. 데이터 주고받기
			Thread sender   = new   Sender(socket);   sender.start();
			Thread receiver = new Receiver(socket);   receiver.start();
			
		} catch (IOException e) { e.printStackTrace(); }
	}
}
/////////////////////////////////////////////////////////
//      InputStream  > [프로그램] > OutputStream
class Sender   extends Thread{  
	Socket socket;   DataOutputStream out; String who;  SimpleDateFormat sdf;
	
	public Sender() { }
	public Sender(Socket socket) { 
		this.socket = socket;  
		try {
			out = new DataOutputStream(  socket.getOutputStream() );
			out.writeUTF("Hello.....START!>> ");
			//#1. WHO + 시간
		} catch (IOException e) { e.printStackTrace(); }
	}
	
	@Override public void run() { 
	   BufferedReader  br =   new BufferedReader(new InputStreamReader(System.in)); //키보드로 써서말하기
	   try {
		   while(out!= null) { 
			   String data = br.readLine();
			   out.writeUTF(data);
		   }
	   }catch(Exception e) {} 
	}
}
/////////////////////////////////////////////////////////
class Receiver extends Thread{ 
	Socket socket;   DataInputStream in;
	public Receiver() { }
	public Receiver(Socket socket) { 
		this.socket = socket; 
		try { in = new DataInputStream(socket.getInputStream()); }
		catch (IOException e) { e.printStackTrace(); }
	}
	@Override public void run() { 
		try {
			while(in != null) { System.out.println(in.readUTF());  }
		}catch(Exception e) {}
	}
}




/****
1. Http   통신 - 단방향통신 (client 요청이 있을때, server가 응답하고 연결이 종료 방식)  / jsp, spring
2. Socket 통신 - 양방향통신 (특정포트를 통해 실시간으로 정보주고받기 - tcp/udp)
3. 소켓통신 흐름
  1) 서버소켓 (as 센터), 포트바인딩(문열어놓기)
  2) 클라이언트 연결요청 , 수락
  3) 클라이언트 소켓(socket)  상담사가 읽어들이기( InputStream  >프로그램기준 > OutputStream) 말하기  
  4) 말하고 주고받기
*/