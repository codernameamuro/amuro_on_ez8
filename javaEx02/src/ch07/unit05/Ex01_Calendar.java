package ch07.unit05;

import java.util.Calendar;

public class Ex01_Calendar {

	public static void main(String[] args) {
		// 컴퓨터 시스템의 날짜 및 시간을 이용하여 객체 생성
		Calendar cal = Calendar.getInstance();
		
		
		// %tF : 년-월-일,  %tA : 요일   %tT : 시간(시 : 분 : 초)
		// System.out.printf("%tF %tA %tT\n", cal, cal, cal);
		
		// String s = String.format("%tF %tA %tT\n", cal);
		String s = String.format("%1$tF %1$tA %1$tT\n", cal);
		System.out.println(s);
		
		int y = cal.get(Calendar.YEAR);  //년도
		int m = cal.get(Calendar.MONTH)+1; //월(0~11) 영어권 숫자가 아닌 알파벳으로 표현 
		//int d = cal.get(Calendar.DATE);  // 일자
		int d = cal.get(Calendar.DAY_OF_MONTH); // 일자
		int w = cal.get(Calendar.DAY_OF_WEEK); // 요알 : 1(일)~7(토)
		int lastday = cal.getActualMaximum(Calendar.DATE); // 월의 마지막일자를 알 수 있다. 
		
		System.out.println(y+"-"+m+"-"+d+", 요일:"+w+",월의 마지막 일자:"+lastday);
		
		// 1998-05-04로 변경
		cal.set(1998, 5-1, 4);
		s = String.format("%tF %tA %tT", cal,cal,cal);
		System.out.println(s);
		
		// 2023년 8월 33일로 변경
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 8-1);
		cal.set(Calendar.DATE, 33);
		s = String.format("%tF %tA ", cal,cal);
		System.out.println(s);  // 자동으로 날짜가 밀어짐
		
		
	}

}
