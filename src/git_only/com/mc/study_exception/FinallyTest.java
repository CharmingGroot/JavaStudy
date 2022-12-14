package git_only.com.mc.study_exception;

public class FinallyTest {

	public static void main(String[] args) {
		try {
			startInstall();		// 프로그램 설치 메서드
			copyFiles();		// 파일복사 메서드
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();	// 프로그램 설치에 사용된 임시파일 삭제
		}
	}
	static void startInstall() {
		/*	프로그램 설치에 필요한 파일을 준비하는 코드 */
	}
	static void copyFiles() {
		/*	파일들을 복사하는 코드 */
	}
	static void deleteTempFiles() {
		/*	임시파일을 삭제하는 코드 */
	}
}
