package git_only.com.mc.study_exception;

import java.io.File;

public class ExceptionEX15 {

	public static void main(String[] args) {
		// cl 에서 입력받은 값을 이름으로 갖는 파일 생성하기
		File f = createFile("");
		System.out.println(f.getName() + "파일 생성 성공 !");
	}


static File createFile(String fileName) {
	try {
		if(fileName == null | fileName.equals("")) {
			System.out.println("파일이름이 유요하지 않아 임의로 제목을 지정합니다.");
			throw new Exception("파일이름이 유효하지 않음");
		}
	} catch (Exception e) {
		//파일이름이 부적절한 경우 파일이름을 '제목없음.txt'로 함
		fileName = "제목없음.txt";	
	} finally { // 기본으로 실행될 녀석들
		File f = new File(fileName); //  File타입의 객체 생성
		createNewFile(f);
		return f;
	}
	

}
static void createNewFile(File f) {
	try {
		// 파일을 생성한다.
		f.createNewFile();
	} catch (Exception e) {
		
	}
	
}
}