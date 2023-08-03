package ch07.unit09;

import java.time.Duration;
import java.time.LocalDate;

import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Ex07 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2025, 10, 10);
		LocalDate date2 = LocalDate.now();
		System.out.println(date1); // 2025-10-10
		System.out.println(date2); // 2023-08-03
		System.out.println();
		
		// 날짜 차이
		Period p = Period.between(date2, date1); // date1 - date2 걀과
		System.out.println("차이:"+p);
		System.out.println("년도차이:"+p.get(ChronoUnit.YEARS));
		System.out.println("달 차이:"+p.get(ChronoUnit.MONTHS));
		System.out.println("날 차이:"+p.get(ChronoUnit.DAYS));
		
		// 시간 차이
		
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(0, 0, 0);
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println();
		
		Duration d= Duration.between(time2, time1);
		System.out.println(d); //PT15H26M4.651526S

		
		//System.out.println("시간 차이:"+d.get(ChronoUnit.HOURS));  지원 x 
		//System.out.println("분 차이: "+d.get(ChronoUnit.MINUTES)); 지원 x 
		System.out.println("초 차이: "+d.get(ChronoUnit.SECONDS));

	}

}
