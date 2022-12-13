package git_only.com.mc.study_exception;

import java.io.File;

public class ExceptionEX16 {
	public static void main(String[] args) {
		try {
			File f = createFile(""); // 얘기 정상적으로 실행되어야 밑 syso코드가 실행된다. 예외가 발생하면 바로 catch블록으로 간다.
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage()+"파일명을 다시 입력하세요.");
		}
	}
	static File createFile (String fileName) throws Exception{
		if(fileName == null || fileName.equals("")) { // 파일 이름이 null값이거나 공백이면
			throw new Exception("파일이 유요하지 않습니다.");
		}
		
		File f = new File(fileName); // File클래스의 객체 생성
		f.createNewFile(); // File 객체의 createNewfile 메서드를 이용하여 실제 파일 생성
		return f;
	}
}
