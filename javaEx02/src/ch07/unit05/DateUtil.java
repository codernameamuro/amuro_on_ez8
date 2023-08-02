package ch07.unit05;

import java.util.Calendar;

// 추 후에 Exception 처리를 해야 함 // 날짜와 관련된 것만 생성 
public class DateUtil {
	/**
	 * 날짜형식이 올바른지 판별
	 * @param date   판별할 문자열의 날짜
	 * @return		 형식이 올바른지 여부
	 */
	public boolean isValidDate(String date) {
		boolean result = false;
		
		//2023-10-07, 2003/10/07, 2003.10.07, 20031007
		if(date.length() !=8 && date.length() !=10) {
			return result;
		}
		
		date = date.replaceAll("(\\-|\\.|\\/)", "");
		if(!date.matches("^(\\d{8})$")) {
			return result;
			
		}
		int y = Integer.parseInt(date.substring(0,4));
		int m = Integer.parseInt(date.substring(4,6));
		int d = Integer.parseInt(date.substring(6));
		
		Calendar cal = Calendar.getInstance();  // 2023-02-29 같은 날짜를 맞게 추출하기 위함
		cal.set(y, m-1,d);						// 2023-03-01 로 나오게 됨 
		

		
		int y1 = cal.get(Calendar.YEAR);
		int m1 = cal.get(Calendar.MONTH)+1;
		int d1 = cal.get(Calendar.DATE);
		
		result = y ==y1 && m==m1 && d==d1;
		
		
		return result;
	}
	/**
	 * 생년월일을 이용하여 나이 계산
	 * @param birth   생년월일
	 * @return        나이
	 */
	
	public int toAge(String birth) {
		int result = -1;
		
		if(! isValidDate(birth)) {
			return result;
		}
		
		Calendar cal = Calendar.getInstance();
		int current_year = cal.get(Calendar.YEAR);
		int current_month = cal.get(Calendar.MONTH)+1;
		int current_date=cal.get(Calendar.DATE);
		
		birth=birth.replaceAll("(\\/|\\.|\\-)", "");
		int y = Integer.parseInt(birth.substring(0,4));
		int m = Integer.parseInt(birth.substring(4,6));
		int d = Integer.parseInt(birth.substring(6));
		
		result = current_year - y;
		if(m> current_month || (m==current_month && d > current_date)) {
			result--;
			
		}
		
		
		
		return result;
	}
	
	
	
}
