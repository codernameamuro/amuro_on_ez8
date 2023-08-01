package ch05.unit01배열;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y, m;
		int tot, w;
		int[] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		do {
			System.out.println("년도 ?");
			y = sc.nextInt();
		} while (y < 1900);

		do {
			System.out.println("월 ?");
			m = sc.nextInt();
		} while (m > 12 || m < 1);

		// 1년 1월 1일 x년 x월 x일
		if(y%4==0 && y%100!==0 || y%400==0) {
			months[1]=29;
		}else {
			months[1]=28;
		}
		/*
		 * months[1] = y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ? 29 : 28;
		 */
		tot = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		for (int i = 0; i < m - 1; i++) { // 일 수 구하는 방법
			tot += months[i];

		}

		tot += 1; // x월 1일의 요일을 알아야 하기 때문에 +1을해줌

		w = tot % 7; // 요일 계산 0 = 일요일 1= 월요일 ....

		System.out.printf("\t %d년 %d월\n", y, m);
		System.out.println("   일  월   화   수  목   금  토 ");
		System.out.println("-----------------------------");

		// 1일 앞의 공백
		for (int i = 0; i < w; i++) {
			System.out.print("    ");
			
		}

		// 1일 부터 말일까지 출력
		for (int i = 1; i <= months[m - 1]; i++) {
			System.out.printf("%4d", i);
			if (++w % 7 == 0) { // 7일 찍고 라인을 넘기기 위함, w가 6인 토요일 이후 넘기기 위해 ++w 해줌
				System.out.println();
			}
		}

		if (w % 7 != 0) {
			System.out.println();
		}
		System.out.println("----------------------------");

		sc.close();

	}

}
