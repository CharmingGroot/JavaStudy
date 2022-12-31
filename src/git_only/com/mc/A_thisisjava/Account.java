package git_only.com.mc.A_thisisjava;

public class Account {
	
	private static int balance = 0;
	private static int MIN_BALANCE = 0;
	private static int MAX_BALANCE = 1000000;
	
	private static Account account = new Account();
	
	private Account() {
		
	}
	
	public static Account getInstance() {
		return account;
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		int res = account.balance + balance;
		boolean condition1 = (account.MAX_BALANCE >= res && account.MIN_BALANCE <= res);
		boolean condition2 = !(condition1);
		
		if(condition1) {
			account.balance += balance;
			System.out.println("현재 잔고는"+ account.balance + "입니다.");
		} else if (condition2){
			System.out.println("지정범위 초과");
			System.out.println(account.balance);
		}
		
	}



	@Override
	public String toString() {
		return "Account []";
	}
	
}
