package git_only.com.mc.f_InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ByteExam5 {
	public static void main(String[] args) {
		
		// BufferedReader : 
		// System.in : 
		// 데코레이터 패턴 : 객체에 추가적인 요건(기능)을 동적으로 첨가하는 방식, 서브클래스를 만드는 것을 통해 기능을 유연하게 확장할 수 있는 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 일부러 밖에 선언해서 try블럭 밖에서 사용 가능하도록 스코프 유지
		String line = null;
		
		try {
			line = br.readLine();
		} catch (IOException e) { // readLine은 IOE예외 발생가능
			e.printStackTrace();
		}
		// 입력값 확인
		System.out.println(line);
	}
}
