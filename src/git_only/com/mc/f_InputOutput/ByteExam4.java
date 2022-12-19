package git_only.com.mc.f_InputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam4 {
	public static void main(String[] args) {
		
		// DataInputStream : 각 타입에 맞게 값을 읽어온다. 
		// FileInputStream(String name) : 실제 파일과 연결된 스트림을 생성한다. 
		try (DataInputStream in = new DataInputStream(new FileInputStream("data.txt"))) {
		
			// 정수를 읽어서 값을 담기
			int i = in.readInt();
			// 불린타입 읽어서 값을 담기
			boolean b = in.readBoolean();
			// 더블타입 읽어서 값을 담기
			double d = in.readDouble();
			
			//확인
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
