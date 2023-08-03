package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex01 {

	public static void main(String[] args) {
		
		String s;
		// 날짜
		LocalDate date = LocalDate.now();
		System.out.println("현재 날짜:"+date);
		
		s=date.toString();
		System.out.println("현재 날짜:"+s);
		
		
		// 날짜 변경
		
		LocalDate date2 = LocalDate.of(2023, 12, 25);
		System.out.println(date2); // 2023-12-25 월 부분에 +1을 할 필요가 없다
		
		
		// 현재 날짜 / 시간
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime); //2023-08-03T14:08:09.960978
		
		String [] ss = datetime.toString().split("T");
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		
		LocalDateTime datetime2 = LocalDateTime.of(2023, 10, 25,10,0,0,0);
		System.out.println(datetime2); //2023-10-25T10:05


		
		

	}

}
