package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex06 {

	public static void main(String[] args) {
		LocalDate date;
		DateTimeFormatter format;
		
		// 문자열 -> LocalDate
		date=LocalDate.parse("2023-07-08");
		System.out.println(date); // 2023-07-08
		
		format = DateTimeFormatter.ISO_LOCAL_DATE;
		date=LocalDate.parse("2023-07-08",format);
		System.out.println(date); // 2023-07-08
		
		// date=LocalDate.parse("2023/07/08"); // 런타임 오류 
		format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		date=LocalDate.parse("2023/07/08", format);
		System.out.println(date); // 2023-07-08
		
		format = DateTimeFormatter.ofPattern("yyyyMMdd");
		date=LocalDate.parse("20230708", format);
		System.out.println(date); // 2023-07-08
		System.out.println();
		
		// LocalDate -> 문자열
		String s;
		date = LocalDate.now();
		s=date.toString();
		System.out.println(s);
		
		DateTimeFormatter dtf;
		dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		s= date.format(dtf);
		System.out.println(s);
		
		dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		s= date.format(dtf);
		System.out.println(s);

		dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
		s= date.format(dtf);
		System.out.println(s);
		
		// LocalDateTime  -> String
		LocalDateTime dateTime = LocalDateTime.now();
		dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		s= dateTime.format(dtf);
		System.out.println(s); // 2023년 8월 3일 오후 3시 13분
		
		
		
		
		
		

	}

}
