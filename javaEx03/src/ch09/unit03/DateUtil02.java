package ch09.unit03;

import java.time.LocalDateTime;
import java.util.Calendar;

public class DateUtil02 {
	public boolean isValidDate(String date) {
		try {
			if(date.length() !=23 && date.length()!=29) {
				return false;
			}
			
			date=date.replaceAll("\\/|\\.|\\-|T|\\:", "");
			if(date.length() != 23) {
				return false;
			}
			
			int y = Integer.parseInt(date.substring(0,4));
			int m = Integer.parseInt(date.substring(4,6));
			int d = Integer.parseInt(date.substring(6,8));
			int h = Integer.parseInt(date.substring(8,10));
			int min = Integer.parseInt(date.substring(10,12));
			int s = Integer.parseInt(date.substring(12,14));
			int ms = Integer.parseInt(date.substring(14,23));
			
			LocalDateTime dateTime = LocalDateTime.now();
			cal.set(y, m - 1, d);

			int y1 = cal.get(Calendar.YEAR);
			int m1 = cal.get(Calendar.MONTH) + 1;
			int d1 = cal.get(Calendar.DATE);

			if (y != y1 || m != m1 || d != d1) {
				return false;
			}
			
		} catch (Exception e) {
			return false;
			
		}
		
		return true;
		
	}
	
	public int toAge(String birth) {
		int age = -1;
		
		if(!isValidDate(birth)) {
			throw new IllegalArgumentException(inval
		}
	}
	
	
	
	


}