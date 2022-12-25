package git_only.com.mc.operator;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
//			ex1();
//			ex2();
//			ex3();
//			ex4();
//			ex5();
//			제어문 예제
//			ex6();
//			dice();
//			nestedLoop();
//			star();
		
//			reverse();
//			frmd();
			// while문과 Scanner 의 nextLine()을 이용, 키보드로 입력된 예금 출금 조회 종료 기능을 제공하는 코드를 작성
			
			bank();
		
		
		
		

	}

	private static void bank() {
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

	private static void frmd() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 10; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	private static void reverse() {
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j >0 ; j--) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}

	private static void star() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	private static void extracted() {
		// 중첩 for문을 사용하여 방벙식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력하는 코드 작성, 단 x y 는 10이하
		// 자연수
		int x = 0;
		int y = 0;
		int res = 0;

		while (!(y == 10)) {
			for (int i = 1; i < 11; i++) {
				x = i;
				for (int j = 1; j < 11; j++) {
					y = j;
					res = (4 * x) + (5 * y);
					if (res == 60) {
						System.out.println("(" + x + "," + y + ")");
						continue;
					} else if (y == 10) {
						break;
					}
				}
			}
		}
	}

	private static void dice() {
		// while문과 Math.random()메서드를 사용하여 두 개의 주사위를 던졌을 때, 나오는 눈을 (눈1, 눈2)형태로 출력하고, 눈의
		// 합이 5가 아니면 계속 반복, 5면 실행 멈춤

		int dice1, dice2;

		while (true) {
			dice1 = (int) ((Math.random() * 6) + 1);
			dice2 = (int) ((Math.random() * 6) + 1);
			System.out.println("dice1 : " + dice1);
			System.out.println("dice2 : " + dice2);
			int res = dice1 + dice2;

			if (res == 5) {
				System.out.println("=================");
				System.out.println("dice1 : " + dice1);
				System.out.println("dice2 : " + dice2);
				System.out.println("두 주사위의 합이 5입니다.");
				break;
			} else {
				System.out.println("두 주사위의 합이 " + res + "입니다.");
			}
		}
	}

	private static void ex6() {
		// for문을 이용해서 1부터 100까지의 정수 중 3의 배수의 총 합을 출력하는 코드를 작성

		int tmp = 0;
		for (int i = 0; i < 100; i++) {
			if (!(i % 3 > 0)) {
				tmp += i;
				System.out.println(tmp);
			}
		}
		System.out.println("End calculate : " + tmp);
	}

	private static void ex5() {
		int lt = 5;
		int lb = 10;
		int h = 7;
		double area = (double) ((lt + lb) * h / 2);
		System.out.println(area);
	}

	private static void ex4() {
		// 십의자리 이하를 버리기.
		int value = 356;

		int quotient = value / 100;

		System.out.println(quotient * 100);
	}

	private static void ex3() {
		int pencil = 534;
		int students = 30;

		// 30명에게 똑같은 수로 나누어주고, 몇자루가 남는지 세어보자.

		int quotient = pencil / students; // 몫

		System.out.println(quotient); // 17

		int remainder = pencil % students;

		System.out.println(remainder);
	}

	private static void ex2() {
		int score = 85;
		String res = (!(score > 90)) ? "가" : "나";
		System.out.println(res);
	}

	private static void ex1() {
		int x = 10;
		int y = 20;

		int z = (++x) + (y--);
		System.out.println(z);
	}

}
