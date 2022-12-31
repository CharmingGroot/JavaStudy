package git_only.com.mc.A_thisisjava;

public class Run {
	public static void main(String[] args) {
//		ex18();
		
//		Printer.println("김", "반찬"); // static으로 오버로딩했다.
		
		
//		ShopSSS();
		
//		accountEX();
		
		
		
		
		
	}

	private static void accountEX() {
		Account account = Account.getInstance();
		System.out.println(account.getBalance());
		
		for (int i = 0; i < 10; i++) {
			account.setBalance(300000);
		}
	}

	private static void ShopSSS() {
		ShopService ss = ShopService.getInstance();
		
		ShopService obj1 = ss.getInstance(); // 참조하는 주소가 같다.
		ShopService obj2 = ss.getInstance(); // 참조하는 주소가 같다.
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
	}

	private static void ex18() {
		Printer printer = new Printer();
		printer.println(false);
		printer.println(1.1);
		printer.println(13);
		printer.println("가나다");
	}
	

}
