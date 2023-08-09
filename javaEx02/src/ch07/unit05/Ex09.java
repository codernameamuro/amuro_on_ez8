package ch07.unit05;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {
		Date now = new Date(); // 컴퓨터 시스템의 날짜
		String birth = "1998-05-04";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date date = sdf.parse(birth);
			
			// 두 날짜 사이의 간격(일)
			long timediff = (now.getTime() - date.getTime()) / (1000*60*60*24);
			System.out.println(timediff);
			
		} catch (Exception e) {  //원래 ParseException이 정상이지만 Exception이 아버지라 가능하다.
			e.printStackTrace();
		}
		
		Date now1 = new Date(); // 컴퓨터 시스템의 날짜
		String xmas = "2023-12-25";

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date date = sdf1.parse(xmas);
			
			// 두 날짜 사이의 간격(일)
			long timediff = (now1.getTime() - date.getTime()) / (1000*60*60*24);
			System.out.println(timediff-1);
			
			
			
		} catch (Exception e) {  //원래 ParseException이 정상이지만 Exception이 아버지라 가능하다.
			e.printStackTrace();
		}

	}
}
