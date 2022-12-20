package g_network.com.mc.f_multicast.Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import git_only.com.mc.f_InputOutput.OutputStream;

// 클라이언트 
public class ChatClient {
	// 클라이언트 전용 소켓
	private Socket socket;
	// 클라이언트 기본 생성자
	public ChatClient() {}
	// 챗 실행 메서드
	public void startChat() {
		connect(); // 연결 - 소켓
		write(); // Output - 클라이언트가 입력한 데이터
		read(); // Input - 서버가 보내온 데이터
	}

	private void read() { // Input스트림 처리
		new Thread(() -> { // 람다는 아직 헷갈려
			// BufferedReader로 input스트림 읽기
			try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
				// 무한반복
				while(true) {
					String message = br.readLine(); // message변수에 읽어온 스트림데이터 초기화
					System.out.println(message); // 클라이언트에게 출력
				}
				
			} catch (IOException e) { // 예외 처리
				System.out.println("연결이 종료되었습니다.");
				closeSocket(); // 예외발생 시 소켓 닫아주는 메서드
			}
			
		}).start(); // 스레드 시작
	}
	
	// 예외처리를 위해 소켓닫는 기능 구현
	private void closeSocket() {
		try {
			socket.close(); // 소켓 닫기
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	// 출력 스트림
	private void write() {
		new Thread(() -> { // 우린 스레드를 갖고 있어, 그게 어떤 스레드냐면 아래 같아.
			Scanner sc = new Scanner(System.in); // 스캐너로 입력받기
			
			System.out.print("닉네임 : "); 
			String userId = sc.nextLine(); // userId 변수에 입력값 넣기 
			
			// try with resources 구문 구현
			try(PrintWriter writer = new PrintWriter(socket.getOutputStream())){ // writer 변수로 서버에 스트림데이터 쏴줄준비
				// userId 서버로 쏴주기 => HashMap에 저장하기 위함
				
				
				while(true) { // 무한반복 왜? 계속 입력받아야 하니까.
					String message = sc.nextLine(); // 값 입력받아서 message 변수에 초기화

					
					boolean isWhisper = message.contains("To/ ");
					if(! isWhisper) { // 귓말 아닌경우
						writer.println(userId + " : " + message); // 서버로 발사
						writer.flush(); // 스트림 비우기 
					} else { // 귓말인 경우
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					}
				}
			} catch (IOException e1) {
				e1.printStackTrace();
				closeSocket(); // 예외 발생 시 소켓 닫기  == 소켓과 서버간 연결 끊는다는 뜻
			}
			
		}).start(); // 위에 코드 잘 봤지? write() 메서드는 위와같은 스레드를 실행할거야~ 정도로 해석하면 될 것 같다.
	}

	// 연결
	private void connect() {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("연결할 서버의 IP : "); 
		String host = sc.nextLine(); // 서버 ip 입력받아서 host변수에 담아
		
		System.out.print("연결할 서버의 port : ");
		int port = sc.nextInt(); // port 입력받아서 port변수에 담아
		
		try {
			this.socket = new Socket(host,port); // new Socket(host,port) 생성자로 지정된 host와 port를 가진 스트림 소켓을 만들고, this로 올려
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}