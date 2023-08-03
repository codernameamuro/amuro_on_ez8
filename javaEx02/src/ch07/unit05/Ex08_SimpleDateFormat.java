package ch07.unit05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Ex08_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		// SimpleDateFormat : 문자열 <-> Date 
		
		// Date 객체를 문자열로 반환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String s = sdf.format(date);
		System.out.println(s);
		
		// 문자열을 Date 객체로 변환
		s = "2023-08-03"; // 위의 simpledateformat과 형식이 달라 사용하지 못함 // 형식이 정해져 format이 바뀌면 문제가 발생할 가능성이 높다
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date2 = sdf2.parse(s);
		    System.out.println(date2);  // 문제 발생 가능성 있는 코드는 try catch 사이
		} catch (ParseException e) {    // 문제가 발생하면 catch를 실행
			e.printStackTrace();        // 왜 문제가 발생했는지 알려줌 
		}  
		System.out.println(s);
		
		

	}

}
