package git_only.com.mc.h_thread.exam;

public class ThreadExam2 {
	public static void main(String[] args) {
		
		MyThread2 t2 = new MyThread2("*"); // run 메서드가 정의되지 않았다.
		MyThread t1 = new MyThread("-"); // run 메서드가 정의되었다.
		
		Thread thread1 = new Thread(t1); // 상속받지 않았을 때.
		Thread thread2 = new Thread(t2); // 상속받지 않았을 때.  쓰레드 객체를 생성한다.
		
		thread1.start(); // 그럼 start 메서드를 사용하여 쓰레드를 실행할 수 있다.
		thread2.start();
		
	}
}
