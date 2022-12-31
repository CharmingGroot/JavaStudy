package git_only.com.mc.A_thisisjava;

public class MemberService {

	String id = "hong";
	String pw = "1234";
	public boolean login(String id, String password) {
		
		if((this.id).equals(id)&&(this.pw).equals(password)) {
			System.out.println("로그인 되었습니다.");
			return true;
		}
		
		return false;
		
	}

	public void logout(String id) {
		if(this.id == id ) {
			System.out.println(id +"님이 로그아웃되었습니다.");
		}
	}
	
	
	
}
