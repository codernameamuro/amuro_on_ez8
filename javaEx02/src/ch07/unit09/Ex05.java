package ch07.unit09;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex05 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime dateTime = LocalDateTime.of(2023, 9,10,17,20);
		
		System.out.println(now);
		System.out.println(dateTime);
		
		long y = now.until(dateTime, ChronoUnit.YEARS); // 0 
		long m = now.until(dateTime, ChronoUnit.MONTHS); // 1 
		long d = now.until(dateTime, ChronoUnit.DAYS);  // 38
		System.out.println(y+","+m+","+d);

	}

}
