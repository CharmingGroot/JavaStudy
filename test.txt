package git_only.com.mc.f_InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam2 {
	public static void main(String[] args) {
		
		// BufferedReader : 
		// System.in : 
		// 데코레이터 패턴 : 객체에 추가적인 요건(기능)을 동적으로 첨가하는 방식, 서브클래스를 만드는 것을 통해 기능을 유연하게 확장할 수 있는 방법
		
		
		BufferedReader br = null;
		// PrintWriter  : 다양한 방법으로 출력할 수 있음
		PrintWriter pw = null;
		
		try {
			// 데코레이션 패턴 사용
			br = new BufferedReader(new FileReader("C:\\Users\\chlgh\\CODE\\git_only\\src\\git_only\\com\\mc\\f_InputOutput\\CharIOExam2.java"));
			pw = new PrintWriter(new FileWriter("test.txt")); // 경로를 안적으면 프로젝트 밑으로 지정됨.
			
			String line = null;
			// 파일이 여러줄 있을 수 있으니, 반복문을 사용, 한 줄 읽었을 때 저장할 수 있는 공간이 필요하니 String 타입의 변수 만들기
			while((line = br.readLine())!= null) { // 파일이 끝이되면 null값을 리턴, 리턴된 값이  null일때까지 수행한다는 것은 파일의 끝까지 수행한다는 말
				pw.println(line); // 파일에 작성해줌 
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
				
		
	}
}
