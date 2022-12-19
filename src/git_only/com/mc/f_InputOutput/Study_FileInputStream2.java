package git_only.com.mc.f_InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Study_FileInputStream2 {
	
	
	
	public Study_FileInputStream2(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("C:\\Users\\chlgh\\CODE\\git_only\\src\\git_only\\com\\mc\\f_InputOutput\\Study_FileInputStream.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];
			
			while((readCount = fis.read(buffer))!= -1) {
				fos.write(buffer,0,readCount); // buffer를 가져와서 0부터 readCount만큼 써라.
			}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
}
}