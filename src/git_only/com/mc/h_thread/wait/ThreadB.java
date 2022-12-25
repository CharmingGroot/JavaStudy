package git_only.com.mc.h_thread.wait;

public class ThreadB extends Thread {
		int total ;
		
		@Override
		public void run() {
			System.out.println("run");
			synchronized (this) {
				for (int i = 0; i < 5; i++) {
					System.out.println(i+"를 더합니다.");
					total += 1;
					
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				notify();
			}
		}
}
