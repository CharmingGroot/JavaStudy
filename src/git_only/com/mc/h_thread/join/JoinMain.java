package git_only.com.mc.h_thread.join;

public class JoinMain {
	public static void main(String[] args) {
		JoinExam thread = new JoinExam();
		thread.start();
		
		System.out.println("시작");				// 메인스레드가 Running 중이다.
		
		try {
			thread.join(); 						// join() 메서드를 사용하여 스레드 중간에 끼어든다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");				// 메서드가 Dead상태가 되면 마저 실행된다.???? dead상태인지 runnable상태인지 헷갈린다.
	}
}
