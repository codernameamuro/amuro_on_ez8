package ch04.unit03for응용문제;

import java.util.Scanner;

public class Quiz01_hard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input, diff, min, result;
// input 넣는 수   //diff 7과의 차이  // 
		min = 0;
		result = 0;

		System.out.println("5개의 정수 입력...");
		for (int i = 0; i < 5; i++) {
			input = sc.nextInt();

			diff = input > 7 ? input - 7 : 7 - input;

			if (i == 0 || min > diff) {
				min = diff;
				result = input;

			}
		}
		System.out.println("7에 가장 가까운수 : " + result);

		sc.close();

	}

}
