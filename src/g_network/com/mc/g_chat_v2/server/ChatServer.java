package g_network.com.mc.g_chat_v2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class ChatServer {
	
	private ServerSocket serverSocket; // 서버 소켓 생성
	private Map<String, Socket> socketMap; // 소켓의 정보를 전달받을 맵 
	
	// 챗서버 기본생성자
	public ChatServer() {
		
		 try {
			 this.serverSocket = new ServerSocket(80); // 포트 80으로 지정된 ServerSocket을 생성하여 this로 올림.
			 socketMap = Collections.synchronizedMap(new HashMap<>());		//  해시맵은 동기화가 안되어있다. 그래서 synchronizedMap 쓰는듯?
		} catch (IOException e) { // 입출력 예외처리
			e.printStackTrace();
		}
	}
	
	// 서버 실행 메서드
	public void startServer() {
		
		System.out.println("서버를 시작합니다...");
		
		while(true) {		// 서버는 무한반복문으로 계속해서 돌려준다.
			try {
				Socket socket = serverSocket.accept(); //  serverSocket을 accept()하여 소켓을 서버소켓과 연결할 준비.
				read(socket); // socket을 매개변수로하는 read 메서드 실행
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void read(Socket socket) { // Socket타입의 socket을 매개변수로 갖는 read 메서드
		
		Thread thread = new Thread(new Runnable() { // 쓰레드 생성, Runnable 구현
			
			@Override
			public void run() { // run 메서드 오버라이드
				
				String userId = "anonymous"; // 클라이언트의 userId를 받아올 변수 선언
				
				try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {		// 소켓데이터를 읽어오는 데코레이터 패턴
					// BufferedReader 타입의 br 선언, socket.getInputStream 데이터를 읽어오는 InputStreamReader를 매개변수로받는 BufferedReader의 값으로 초기화.
					while(true) { // 무한반복문을 통해 클라이언트와 지속적인 입출력
						String message = br.readLine(); // br의 문자열 한 행을 읽어와서 message에 저장
						
						if(message.startsWith("type=regist")) { // message의 문자열이 "type=regist"로 시작되는지 테스트함.
							
							// 클라이언트가 보낸 userId값을 전체 메세지에서 추출
							userId = message.substring(message.indexOf("&")+1); // message의 type=regist&의 바로다음 인덱스값을 인자로 갖는 message.substring을 userId에 기입
							registUser(userId, socket); 		// userId와 socket을 매개변수로 갖는 registUser메서드 실행
							
						}else { // 귓말이 아닌경우에.
							broadcast(message); // broadcast에 message를 전달
						}
					}
					
				} catch (IOException e) {
					System.out.println("연결이 종료되었습니다.");
					removeSocket(userId); // 예외발생 시 소켓 제거
				}
			}
		});
		
		thread.start(); // 위 과정이 진행된 후에 스레드 실행
		System.out.println(Thread.currentThread().getName() + "read의 스레드가 실행중입니다."); // 현재 진행중인 스레드명 출력
	}

	// 유저등록 메서드
	protected void registUser(String userId, Socket socket) throws IOException { // 예외 던짐.

		if(socketMap.containsKey(userId)) { 	// socketMap이 지정된 userId를 포함하면
			String message = "auth=false";		// message변수에 미인증을 의미하는 "auth=false" 문자열을 초기화
			write(socket, message);				// write메서드를 통해 socket으로 message를 출력한다.
			
		}else {										// userId를 미포함하면
			String message = "auth=true";			// 인증완료된 상태
			write(socket, message);					// write 메서드 실행
			//socketMap에 추가되는 순간부터, socket은 broadcast의 대상이 됨
			socketMap.put(userId, socket); // 해시맵에 userId와 socket데이터를 키와 밸류를 추가, 이전 값과 일치하면 덮어쓰기함.
		}
	}
	
	
	// 출력 메서드 write가 socket과 message를 매개로 받을 때
	private void write(Socket socket, String message) throws IOException { // Socket타입의 socket과 String타입의 message를 매개변수로하며, 입출력 예외를 던진다.
		PrintWriter writer = new PrintWriter(socket.getOutputStream()); // socket으로부터 스트림데이터를 가져와 PrintWriter생성자의 매개변수로 갖는다.
		writer.println(message); 			// message를  출력
		writer.flush(); // 스트림 청소해준다.
	}

	// 1대1통신 메서드
	protected void broadcast(String message) {
		
		for (Entry<String, Socket> socket : socketMap.entrySet()) {			// HashMap을 순회하는 foreach문이다. entry는 key와 value 한 쌍을 요소로 갖고있으며 , entrySet은 Entry의 집합이다.
			
			try{
				PrintWriter writer = new PrintWriter(socket.getValue().getOutputStream());
				writer.println(message);				// message출력
				writer.flush();							// flush로 스트림 비우기
			} catch (IOException e) {					// 예외처리
				removeSocket(socket.getKey());			// socket맵의 key값으로 접근하여 소켓 제거
			}
		}
		
	}

	// 소켓제거 메서드
	private void removeSocket(String userId) { // userId를 매개변수로 갖는다.

		System.out.println("접속인원 : " + socketMap.size());
		System.out.println("=============================");
		System.out.println(userId + " is closed");
		
		try {
			socketMap.remove(userId).close(); // map에 접근하여 userId로 소켓 닫기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=============================");
		System.out.println("접속인원 : " + socketMap.size());
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}