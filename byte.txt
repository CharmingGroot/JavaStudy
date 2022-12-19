package git_only.com.mc.f_InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Study_FileInputStream {
	
	
	
	public Study_FileInputStream(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("C:\\Users\\chlgh\\CODE\\git_only\\src\\git_only\\com\\mc\\f_InputOutput\\Study_FileInputStream.java");
			fos = new FileOutputStream("byte.txt");
			
			int readData = -1;
			
			while((readData = fis.read())!= -1) {
				fos.write(readData);
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