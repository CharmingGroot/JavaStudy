package git_only.com.mc.f_InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(args[0]);
		int data = 0;
		
		while((data = fis.read()) != -1) { // -1은 더이상 입력값이 없음을 알린다.
			char c = (char)data;
			System.out.print(c);
		}
	}
	
	

}
