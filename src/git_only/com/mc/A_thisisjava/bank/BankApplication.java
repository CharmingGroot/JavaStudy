package git_only.com.mc.A_thisisjava.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true;
		
		while(run) {
			
			System.out.println("==================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("==================================");
			int input_num = sc.nextInt();
			
			
			switch (input_num) {
			case 1:
				// 계좌 생성

				createAccount();
				break;

			case 2:
				// 계좌 목록
				accountList();
				break;
			case 3:
				// 예금
				deposit();
				break;
				
			case 4:
				// 출금
				withdraw();
				break;
				
				
			case 5:
				// 종료
				break;
				
			default:
				break;
			}
		}

	}

	private static void withdraw() {
		// 출금
		System.out.println("===========");
		System.out.println("계좌번호");
		String ano = sc.next();

		System.out.println("얼마 출금?");
		int money = sc.nextInt();
		
		Account account = findAccount(ano); // 계좌 찾아서 받아온 값을 account에 초기화
		if(account == null) {
			System.out.println("계좌 없음");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("출금 성공 현재잔고" + account.getBalance());
		
		
	}

	private static void deposit() {

		// 예금
		
		System.out.println("===========");
		System.out.println("계좌번호");
		String ano = sc.next();

		System.out.println("얼마 예금?");
		int money = sc.nextInt();
		
		Account account = findAccount(ano); // 계좌 찾아서 받아온 값을 account에 초기화
		if(account == null) {
			System.out.println("계좌 없음");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("에금 성공 현재 잔고" + account.getBalance());
		
	}

	private static Account findAccount(String ano) {
		// Account 배열에서 ano와 동일한 객체 찾기
		Account account = null; // 초기값을 null로 주고, 예외처리
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) { // nullpointException을 잡기 위함. + "해당 인덱스에 null이외의 값이 있다면" 정도로 생각하면 됨.
				String dbAno = accountArray[i].getAno(); // accountArray의 i인덱스에 값을 가져와서 dbAno에 초기화
				if(dbAno.equals(ano)) {
					account = accountArray[i]; // 같으면 초기화
					break;
				}
			}
		}
		
		return account; // account에 값을 담아서 리턴해줌
	}

	private static void accountList() {

		System.out.println("===========");
		System.out.println("계좌목록");
		
		for (int i = 0; i < accountArray.length; i++) {
			
			Account account = accountArray[i];
			
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.println(account.getBalance());
			}
		}
		
	}

	private static void createAccount() {
		
		System.out.println("새로운 이름을 입력하세요.");
		String owner = sc.next();
		
		System.out.println("새로운 계좌번호를 입력하세요.");
		String ano = sc.next();
		
		System.out.println("입금하실 금액을 입력하세요.");
		Integer balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance); // Account 생성자로 매개변수들을 접근하여 값들을 초기화한다.
		// 매개변수가있는 생성자로 초기화 한 값을 newAccount 변수에 다시 초기화한다.
		
		for (int i = 0; i < accountArray.length; i++) { 
			if(accountArray[i] == null) { // 순회하면서 값이 없다면.
				accountArray[i] = newAccount;	// Account 타입의 newAccount를 Account()생성자를 호출하여 초기화한다.
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
				
		
	}

}
