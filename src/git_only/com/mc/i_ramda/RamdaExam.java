package git_only.com.mc.i_ramda;

public class RamdaExam {
	public static void main(String[] args) {
		// 람다식 문법 
		// (매개변수 목록) -> {실행문}
		
		// 쓰레드가 실행될때 쓰레드 생성자 안에 넣은 run이라는 메서드가 실행되게 해라.
		new Thread(()-> {
				for (int i = 0; i < 10; i++) {
					System.out.println("hello");
				}
			}).start();
		
	}
}
