package ch07.unit07;

import java.text.NumberFormat;
import java.text.ParseException;

public class Ex02 {

	public static void main(String[] args) {
		String s1 = "1000";
		String s2 = "1,234";
		String s3 = "4567.12";
		
		//int a = Integer.parseInt(s2); // 런오류 ,가 있으면 숫자로 바꿀 수 없다 
		int a =Integer.parseInt(s2.replaceAll(",", ""));
		System.out.println(a);
		System.out.println();
		
		// 문자열 -> 숫자로 변환
		NumberFormat nf = NumberFormat.getInstance();
		
		// Number : Integer, Long, Double 등의 상위 클래스 // 형제관계 == 남
		// Integer, Long, Double은 서로 상속관계가 아니므로 형변환 불가
		// Long aa = 10; // 컴오류  10뒤에 L 붙여야 함
		
		
		try {
			Number n1 = nf.parse(s1);
			Number n2 = nf.parse(s2);
			Number n3 = nf.parse(s3);
			
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println();
			
			//System.out.println(n1+100); // n1이 객체이므로 사칙연산불가 
			
			// Integer obj = (Integer) n1; // 런타임 오류
			Long obj = (Long)n1;
			// parse()로 형변환된 결과는 정수는 Long, 실수는 Double
			System.out.println(obj+100);
			
			
			Double obj2 = (Double)n3;
			System.out.println(obj2 + 100);
			System.out.println();
			
			// 실수를 정수만 처리하도록 설정
			nf.setParseIntegerOnly(true);
			Number n4 = nf.parse(s3);
			System.out.println(n4); //4567
			
			 
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
