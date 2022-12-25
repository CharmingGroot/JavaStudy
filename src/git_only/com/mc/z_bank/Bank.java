package git_only.com.mc.z_bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ac = 0;
		while(true) {
			
			System.out.println("==================================");
			System.out.println("1. 예금 \t 2. 출금 \t 3. 조회 \t 4. 종료");
			System.out.println("원하시는 항목을 입력해주세요.");
			int input = sc.nextInt();
			
			
			if(input == 1) {
				System.out.println("예금액을 입력해주세요.");
				int dep = sc.nextInt();
				ac += dep;
				System.out.println("계좌 잔고는 :" + ac + "원");
			}
			
			else if(input == 2) {
				System.out.println("출금액을 입력해주세요.");
				int wd = sc.nextInt();
				ac -= wd;
				System.out.println("계좌 잔고는 :" + ac + "원");
				
			}
			
			else if(input == 3) {
				System.out.println("계좌 잔고는 :" + ac + "원");
			}
			
			else if(input == 4) {
				System.out.println("종료");
				break;
	
				
			}
			
			else {
				System.out.println("다시 입력하세요.");
			}
			
		}
	}
}
