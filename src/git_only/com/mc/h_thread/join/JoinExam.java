package git_only.com.mc.h_thread.join;

public class JoinExam extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("My Thread :" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
	
}
