package git_only.com.mc.h_thread.exam;

public class ThreadExam {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("*");
		MyThread t2 = new MyThread("-");
		
		// Thread 동작 시 run() 이 아닌 start()를 호출한다.
		
		t1.start();
		t2.start();
		
		System.out.println("main end : !!!");
		
	}

}
