package git_only.com.mc.f_InputOutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam3 {
	public static void main(String[] args) {
		try(
				// DataOutputStream : 여러가지 데이터 타입을 받을 수 있다.
				// FileOutputStream 파일만들기
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				){
			out.writeInt(100); // out에 100을 저장 / 4바이트를 저장
			out.writeBoolean(true); // out에  true / 1바이트를 저장
			out.writeDouble(50.5); // 8바이트를 저장
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
