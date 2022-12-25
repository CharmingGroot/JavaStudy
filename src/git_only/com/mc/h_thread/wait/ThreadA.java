package git_only.com.mc.h_thread.wait;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB tb = new ThreadB();
		tb.start();			// 해당 스레드가 실행되면 run 메서드 안에서 자신의 모니터링락을 획득한다.
		
		synchronized (tb) { // tb
			try {
				System.out.println("tb가 완료될 때 까지 기다립니다.");
				tb.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is : "+ tb.total);
		}
	}
}
