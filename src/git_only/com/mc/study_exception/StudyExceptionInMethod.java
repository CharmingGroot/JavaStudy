package git_only.com.mc.study_exception;

public class StudyExceptionInMethod {

	public static void main(String[] args) throws Exception{
		method1();
	}

	private static void method1() throws Exception{
		method2();
	}

	private static void method2() throws Exception{
		throw new Exception();
	}

}
