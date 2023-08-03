package ch07.unit09;

import java.time.LocalDateTime;

public class Ex03 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.println(now); // 2023-08-03T14:25:23.451058400

		LocalDateTime t1 = now.plusDays(100);
		System.out.println(t1);

		LocalDateTime t2 = now.minusDays(100);
		System.out.println(t2);
		
		
		// 년 월 일 시 분 초 연산
		LocalDateTime t3 = now.plusYears(100)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(40)
				.plusSeconds(654)
				.minusNanos(5455);
		System.out.println(t3);
		System.out.println();
		
		// 변경 (년 월 일 시)
		LocalDateTime t4 = now.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(15)
				.withHour(13);
		
		System.out.println(t4);
		
		

	}

}
