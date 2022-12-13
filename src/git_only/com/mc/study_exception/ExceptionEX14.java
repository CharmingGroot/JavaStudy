package git_only.com.mc.study_exception;

public class ExceptionEX14 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메서드에서 예외가 처리됨");
			e.printStackTrace();
		}
	}

	private static void method1() throws Exception{
		throw new Exception();
	}
}
