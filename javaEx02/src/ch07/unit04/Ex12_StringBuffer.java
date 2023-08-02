package ch07.unit04;

public class Ex12_StringBuffer {

	public static void main(String[] args) {
		
		// 아래처럼 문자열을 결합하면 안된다. 절대.  --> 성능 저하의 요인이 됨
		/*String s;	
		
		s =  "서울,";
		s += "부산,";
		s += "대구,";
		s += "인천,";
		s += "광주,";
		s += "대전,";
		s += "세종,";
		*/
		
		// 아래의 코딩은 내부적으로 StringBuilder 이용하여 문자열을 결합 하므로 성능이 우수하다. 
		/*
		String s;
		s = "서울,"
		 + "부산,"
		 + "대구,"
		 + "인천,"
		 + "광주,"
		 + "대전,"
		 + "세종";
		*/
		
		StringBuffer sb1 = new StringBuffer("seoul");
		StringBuffer sb2 = new StringBuffer();
		
		sb1.append("korea"); // 뒤에 문자열 추가
		
		sb2.append("seoul");
		sb2.append("korea");
		
		System.out.println(sb1); //seoulkorea
		System.out.println(sb2); //seoulkorea
		
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		
		// StringBuilder, StringBuffer 클래스의 equals() 메소드는 주소를 비교
		// 문자열을 비교하기 위해서는 String으로 변한 후 비교한다
		
		// Object의 equals() : 주소  비교
		// String equals() : 문자열 비교
		
		// StringBuilder, StringBuffer 클래스의 String 변환
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		System.out.println(s1.equals(s2)); // true
		
		
	}

}
