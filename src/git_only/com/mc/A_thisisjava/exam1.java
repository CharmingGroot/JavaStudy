package git_only.com.mc.A_thisisjava;

import java.util.Arrays;
import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		
		
//		q1();
//		q2();
		
		// 학생들의 점수를 분석하는 프로그램, 키보드로부터 학생 수와 점수를 입력받고, while, nextLine 메서드로 최고점수 및 평균점수를 출력하는 코드
		Scanner sc = new Scanner(System.in);
		int students = 0;

		
		
		while(true) {
			System.out.println("========================================================");
			System.out.println("1. 학생수 \t 2. 점수입력 \t 9. 점수리스트 \t 10. 분석 \t 11. 종료");
			System.out.println("========================================================");
			
			System.out.println("원하시는 항목을 선택하세요.");
			int input = sc.nextInt();
			
			
			
			// 입력받은 학생 수 만큼 students 를 초기화해주고, 학생수만큼 점수를 저장할 새로운 배열을 만듬
			int[] score_arr = new int[30]; // 직접설정하면 차후에 적용안된 인덱스는 초기값을 가진다.이점 염두할 것.
			
			switch (input) {
			case 1:
				System.out.println("학생수를 입력하세요.");
				students = sc.nextInt();
				System.out.println(students+"명");
			continue;
			case 2: // 점수입력
				for (int i = 0; i < students; i++) {
					System.out.println(score_arr[i]+": 학생의 점수를 입력하세요.");
					score_arr[i] = sc.nextInt();
					System.out.println(score_arr[i]);
				}
				continue;
			case 9: // 점수 리스트
				for (int i = 0; i < students; i++) {
					System.out.println(i+"학생의 점수는 :"+score_arr[i]);
				}
				
				continue;
			case 10: // 평균점수, 최고점수
				int tmp = 0;
				int score_avg = tmp / students;
				for (int i = 0; i < students-1; i++) {
					tmp += score_arr[i];
				}
				
				int max = score_arr[0];
				for (int i = 0; i < students-1; i++) {
					if(score_arr[i] > max) {
						max = score_arr[i];
					}
				}
				
				System.out.println("평균 :"+ score_avg);
				System.out.println("최대점수 :" + max);
				break;
			}
			
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	private static void q2() {
		// 주어진 배열항목의 전체 합과 평균을 구해 출력하는 코드  중첩 for문
		int[][] array = {
				{10,10}
				,{10,10,10}
				,{10,10,10,10,10}
		};
		int sum = 0;
		int avg = 0;
		// sum
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		int cnt = 0;
		// avg
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				cnt += 1;
			}
			avg = sum / cnt;
		}
		System.out.println("cnt : "+cnt);
		System.out.println(sum);
		System.out.println(avg);
	}

	private static void q1() {
		// 주어진 배열항목에서 최대값을 출력하는 코드를 작성 (for문 이용)
		int[] arr = {1,5,3,8,2};
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}System.out.println(max);
	}

}
