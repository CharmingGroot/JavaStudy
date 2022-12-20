package g_network.com.mc.e_teachers.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//서버 구현
public class ChatServer {
	
	private ServerSocket serverSocket; // 서버소켓 생성
	private List<Socket> socketList; // 소켓 리스트 생성 => 1:n 채팅 기능구현을 위함
	
	public ChatServer() { // 기본 생성자
		
		 try { // 예외 처리
			 this.serverSocket = new ServerSocket(80); // 지정된 포트에 바인딩 된 서버소켓을 생성하여 this로 올려보냄
			 socketList = Collections.synchronizedList(new ArrayList<Socket>()); // 소켓리스트에 스레드동기화된 소켓타입의 ArrayList생성
		} catch (IOException e) { // 입출력 예외처리
			e.printStackTrace();
		}
	}
	
	public void startServer() { // 서버 시작 메서드	
		System.out.println("서버를 시작합니다...");
		
		while(true) { // 서버는 계속 돌아야하니까 무한반복문
			try {
				Socket socket = serverSocket.accept(); // socket 연결(생성)
				
				// 새로운 클라이언트를 추가
				socketList.add(socket); // 소켓 리스트에 새로운 소켓(클라이언트) 추가
				System.out.println("====================================");
				System.out.println("입장인원 : " + socketList.size());
				System.out.println("====================================");
				
				read(socket); // socket을 매개변수로 갖는 read메서드 실행
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void read(Socket socket) { // 소켓 데이터 읽어오기
		
		Thread thread = new Thread(new Runnable() { // run 메서드를 구현해야하는 Runnable 인터페이스
			
			@Override
			public void run() {
				// BufferedReader로 문자입력 스트림의 텍스트를 읽기
				try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) { // socket의 스트림데이터 받아오기
					while(true) { // 무한반복문
						String message = br.readLine(); // message 변수에 BufferedReader로 읽어온 문자행을 초기화
						broadcast(message); // message를 매개변수로 갖는 broadcast 메서드 실행
					}
				} catch (IOException e) {
					System.out.println("연결이 종료되었습니다.");
					removeSocket(socket); // 예외 발생 시 소켓 지우기.
				}
			}
		});
		
		thread.start(); // thread의 start메서드 실행
	}
	
	// Broadcast : 1대1 통신 구현
	protected void broadcast(String message) { // message를 파라미터로 받는다.
		// foreach문 돌리기
		for (Socket socket : socketList) {  // socket 변수를 socketList만큼 돌린다.
			
			try{
				PrintWriter writer = new PrintWriter(socket.getOutputStream()); // PrintWriter타입의 writer변수에 soket.getOutputStream 값을 넣어줍니다. 반대편으로 발사(출력)할 총알 장전 정도로 이해하면 될듯?
				writer.println(message); // message 매개변수를 출력한다.
				writer.flush(); // 스트림 비워준다. 아무런 요소가 남지 않도록!
			} catch (IOException e) {
				removeSocket(socket); // 예외발생 시 소켓 제거
			}
		}
		
	}

	// 예외발생시 소켓 제거기능 구현
	private void removeSocket(Socket socket) {

		System.out.println("접속인원 : " + socketList.size());
		System.out.println("=============================");
		System.out.println(socket.getInetAddress().getHostAddress() + " is closed"); // 상태를 알리기위해 구현
		
		try {
			socketList.remove(socket); // 소켓리스트에서 소켓 삭제(연결을 끊는다는 뜻) , remove는 List클래스의 메서드이다.
			socket.close(); // 소켓 닫기, Socket 클래스에 구현되어있는 메서드이다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=============================");
		System.out.println("접속인원 : " + socketList.size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}