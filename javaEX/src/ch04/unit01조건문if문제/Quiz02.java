package ch04.unit01Quiz;

import java.util.Scanner;

/*
	년도를 입력 받아 평년인지 윤년이지 판별하는 프로그램
*/
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;

		System.out.print("년도 ? ");
		y = sc.nextInt();

		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println(y + "년도는 윤년입니다.");
		} else {
			System.out.println(y + "년도는 평년입니다.");
		}

		sc.close();
	}
}
