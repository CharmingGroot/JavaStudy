package git_only.com.mc.study_exception;

public class ExceptionEX13 {

	public static void main(String[] args) {
		method1();
	}

	static void method1() {
		try {
			throw new Exception(); // 임의로 예외 발생
		}catch(Exception e) { // Exception 타입의 참조변수 e 선언
			System.out.println("예외가 처리됨"); // 예외처리 시 출력될 문구
			e.printStackTrace(); // 예외에 대한 정보를 화면에 출력하는 메서드
		}
		
	}

}
