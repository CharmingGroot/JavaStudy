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
		int score = 0;
		int max_score = 0;
		int avg_score = 0;
		
		while(true) {
			System.out.println("======================");
			System.out.println("1. 학생수 \t 2. 점수입력 \t 3. 점수리스트 \t 4. 분석 \t 5. 종료");
			System.out.println("======================");
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("학생수를 입력하세요.");
				int stu_num = sc.nextInt();
				students = stu_num;
			case 2:
				
				
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
