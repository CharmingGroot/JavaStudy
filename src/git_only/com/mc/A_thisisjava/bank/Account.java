package git_only.com.mc.A_thisisjava.bank;


public class Account {
	
	// 이 값들은 createAccount의 반복문이 돌면서 계속 바뀐다.
	private String ano;
	private String owner;
	private int balance;
	

	
//	private ArrayList<Object> accountList = new ArrayList<>();
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
	
	
	
}
