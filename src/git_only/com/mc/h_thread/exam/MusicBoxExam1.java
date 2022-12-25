package git_only.com.mc.h_thread.exam;

public class MusicBoxExam1 {

	public static void main(String[] args) {

		MusicBox box = new MusicBox();
		
		MusicPlayer kang = new MusicPlayer(1, box);
		MusicPlayer kim = new MusicPlayer(2, box);
		MusicPlayer choi = new MusicPlayer(3, box);
		
		kang.start();
		kim.start();
		choi.start();
		
	}

}
