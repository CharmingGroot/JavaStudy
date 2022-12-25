package git_only.com.mc.h_thread.exam;

public class MusicPlayer extends Thread{

	int type; // run 메서드에서 switch 문으로 식별하기위함.
	MusicBox musicBox; // 메서드 델꼬오기
	
	
	// 생성자
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}

	// 쓰레드를 상속받으면 run() 메서드를 override 해야한다. 사용할 땐  run() 이 아니라 start()이다.
	@Override
	public void run() {
		switch(type) {
		case 1: 
			musicBox.playMusicA();
			break;
		case 2:
			musicBox.playMusicB();
			break;
		case 3:
			musicBox.playMusicC();
			break;
		
		
		}
		
			
			
	}

	
	
}
