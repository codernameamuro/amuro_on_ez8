package ch04.unit06return;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 정수를 입력 받아 입력 받은 수까지 합 구하기
		// 단, 입력 받은 수가 1이하이면 프로그램 종료

		Scanner sc = new Scanner(System.in);

		int n, s;

		System.out.print("수?");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("1이상의 수만 입력 가능합니다.");
			sc.close();
			return; // main () 메소드를 빠져 나감 
		}

		s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;

		}
		System.out.println("결과 : " + s);

		sc.close();
	}

}
