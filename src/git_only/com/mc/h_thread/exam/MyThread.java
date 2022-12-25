package git_only.com.mc.h_thread.exam;

public class MyThread extends Thread {

	String str;
	public MyThread (String str) {
		this.str = str;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(str);
			
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
