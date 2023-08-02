package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex04_calendar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		int y, m, w, lastDay;

		System.out.println("년도 ?");
		y = sc.nextInt();

		do {
			System.out.println("월 ?");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		// y년도 m월 1일의 요일 구하기
		cal.set(y, m - 1, 1);
		w = cal.get(Calendar.DAY_OF_WEEK);

		// y년도 m월의 마지막 날짜
		lastDay = cal.getActualMaximum(Calendar.DATE);

		System.out.println("\t" + y + "년" + m + "월");
		for (int i = 0; i < week.length; i++) {
			System.out.printf("%4s", week[i]);

		}

		System.out.println();
		System.out.println("---------------------------------");

		for (int i = 1; i < w; i++) {
			System.out.print("    ");

		}

		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%4d", i);
			if (++w % 7 == 1) {
				System.out.println();
			}
		}
		if (w % 7 != 1) {
			System.out.println();

		}
		System.out.println("---------------------------------");

		sc.close();

	}

}
