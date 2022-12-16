package g_network.com.mc.a_Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {

	// IP : 네트워크상에서 컴퓨터를 식별하는 번호
	//	 	노드(단말)중에서 IP주소가 할당된 노드를 호스트라고 부른다.
	
	// Port : 호스트에는 여러 프로세스가 동시에 동작.
	// 			데이터를 전달해 줄 프로세스를 식별하기 위한 번호.
	
	// Socket : 네트워크를 통해 데이터를 주고받기 위해 여는 통로. 시작과 끝이ㅏㄷ.
	
	// TCP : 1:1 통신, 연결기반(보내고 잘받았다고 답장와야함), 스트림기반, 안정성과 순서보장, 자동패킷분할
	
	public void studyInet() {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 IP : "+local.getHostAddress());
			System.out.println("내 PC : "+ local.getHostName());
			
			InetAddress naver = InetAddress.getLocalHost();
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
