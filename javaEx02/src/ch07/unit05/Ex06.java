package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateUtil util = new DateUtil();
		
		String birth;
		int age;
		
		do {
			System.out.print("생년월일 ? ");
			birth = sc.next();
		} while(! util.isValidDate(birth));
		
		
		age=util.toAge(birth);

		System.out.println("생년월일: " + birth);
		System.out.println("나이: "+ age);
		System.out.println();
		
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// String now = sdf.format(new Date());
		Calendar cal = Calendar.getInstance();
		String now = String.format("%tF", cal);
		String date = "2023-12-25";
		
		long a = util.toDiffDays(now, date);
		System.out.println("두 날짜 사이 차이  : "+ a);
		
		
		sc.close();

	}
}
