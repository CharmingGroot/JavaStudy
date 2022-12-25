package git_only.com.mc.h_thread.exam;

import java.lang.Math;

public class MusicBox {
	
	// synchronized가 붙어있으면
	// 여러개의 쓰레드들이 공유객체의 메서드를 사용할 때, synchronized가 붙어있으면
	// 메서드가 먼저 실행되면, 해당 객체의 사용권을 얻게 된다. (모니터링 락)
	// 메서드 실행이 종료되거나 wait()를 만나기 전에는 모니터링락을 풀지 않는다.
	
	
	public synchronized void playMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("음악1");
			
			try {
				Thread.sleep((int)(Math.random()*1000)); // sleep 메서드는   쓰레드를 Blocked 상태로 만든다. 특정 시간이 지나면 Blocked 상태에서 빠져나와 Runnable이나 Running상태로 전환된다.
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("음악2");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
	
	// 다른 쓰레드들이 모니터링락을 획득했다 하더라도 
	// synchronized를 지정하지 않은 메서드는 실행된다.
	// 안전한 메서드라는 의미이다.
	public void playMusicC() {
		for (int i = 0; i < 10; i++) {
		
			// 메서드 전체에 동기화를 지정해주는 것이 아니라 필요한 부분만 동기화한다.
			synchronized (this) {	// 모니터링 락이 해제되는 시점에, 동기화블럭이 실행된다. 한 블럭만 동기화처리를 해주니 그 이외의 다른 쓰레드들의 진입이 빨라진다.
				System.out.println("음악3"); // 실제 쓰레드 실행순서를보면 음악 1의 모니터링락이 해제되는 시점에 음악 3의 동기화블럭이 1회 실행되고, 바로 풀리면서 음악 2가 실행된다.
			}
			
			
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
