package ch07.unit09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex08_Util {

	public static void main(String[] args) {
		String s1,s2;
		s1="2023-05-06";
		s2="2023-09-08";
		System.out.printf("%s~%s 일자 차이 : %d\n", s1, s2, todiffDays(s1, s2));

	}
	
	// 두 날짜 사이 간격(일)
	public static long todiffDays(String start, String end) {
		
		long result = 0 ;
		
		start = start.replaceAll("\\-|\\/|\\.","");
		end = end.replaceAll("\\-|\\/|\\.","");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		
		LocalDate beginDate = LocalDate.parse(start,dtf);
		LocalDate endDate = LocalDate.parse(end,dtf);
		
		result = beginDate.until(endDate, ChronoUnit.DAYS);
		
	
		
		return result;
	}

}
