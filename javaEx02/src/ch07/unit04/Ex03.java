package ch07.unit04;

public class Ex03 {

	public static void main(String[] args) {
		// String 주요 메소드
		
		String s1 = "seoul korea";
		String s2;
		int n;
		
		// 문자열 길이
		n = s1.length();
		System.out.println(n); // 11
		
		// 6번째 인덱스부터 3글자 추출(인덱스는 0부터 시작)
		s2 = s1.substring(6,9);
		// substring(s,e) : s인덱스에서 e-1인덱스까지 문자열 추출 (e-s 개 추출)
		System.out.println(s2); // kor 특정 위치 문자열
		
		// 6번째 인덱스부터 끝까지 ? 
		s2 = s1.substring(6);
		System.out.println(s2); // korea 특정 위치에서 끝까지 
		
		// 소문자를 대문자로 변환
		s2 = s1.toUpperCase(); // 문자열 불변이기 때문에 변환 받아서 입력해야 한다
		System.out.println(s2);
		
		// 특정 위치의 문자 추출
		char c;
		c = s1.charAt(6);
		System.out.println(c); // k 
		
		// 문자열 비교 
		System.out.println(s1.equals("seoul korea")); // true 문자그 자체 비교
		System.out.println(s1.equals("Seoul Korea")); // false 문자그 자체 비교
		
		
		System.out.println(s1.equalsIgnoreCase("SeOuL KoReA")); // true 대소문자 구분 않고 비교
		
		// 문자열이 특정 문자열로 시작하는지 확인
		boolean b = s1.startsWith("seoul");
		System.out.println("seoul 로 시작 : "+ b);
		
		//문자열이 특정 문자열로  끝나는지 확인
		b = s1.endsWith("korea");
		System.out.println("마지막이 korea:" + b);
		
		//문자열의 크기 비교 : >, >=, <, <= 로 문자열을 비교하지 못한다
		// compareTo() : 문자열을 사전식으로 비교하여 ASCII 코드 차이 반환
		System.out.println(s1.compareTo("seoul corea"));
			// "k" - "c" 차이 : 107-99 = 8
		System.out.println("Java Spring".compareTo("Java Oracle"));
			// 'S' - 'O' 차이 : 4
		
		
	
		
		
		

	}

}
