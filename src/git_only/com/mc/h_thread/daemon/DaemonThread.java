package git_only.com.mc.h_thread.daemon;

public class DaemonThread implements Runnable{
	// 데몬이란, 백그라운드로 동작하는 프로그램
	// 데몬쓰레드도 유사하게 동작한다
	// 쓰레드에 데몬을 설정해주면 된다.
	// 자바프로그램을 만들 때 백그라운드에서 특별한 작업을 수행하는 용도로 사용된다.
	// ex) 주기적으로 자동저장을 해준다거나, 일정시간마다 맞춤법 검사를 실행하는 등.
	// 데몬쓰레드는 일반쓰레드가 모두 종료되면 강제적으로 종료된다.
	
	@Override
	public void run() {
		while(true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; // sleep 도중 예외발생하면 while을 빠져나가야하기 때문에 break
			}
		}
	}
	
	
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true); // 데몬쓰레드로 설정
		thread.start();
		
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됩니다.");
	}
	
}
