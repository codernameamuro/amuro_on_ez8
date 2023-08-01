package ch07.unit04;

public class Ex06 {

	public static void main(String[] args) {
		String p, s;
				
		// 정규식 패턴에 일치하는지 검사 
		// p = "[0-9]{1,3}"; 최소 한 자리 최대 세 자리
		p="\\d{1,3}";
		s = "1234";
		System.out.println(s.matches(p)); //false
		s = "123";
		System.out.println(s.matches(p)); //true
		
		// 한 자 이상의 한글만 가능
		// ^:시작, $:끝, +:하나이상
		p="^[가-힣]+$";
		s="김이나";
		System.out.println(s.matches(p));
		
		// | : 또는 
		p="(자바|오라클|스프링)";
		s="자바";
		System.out.println(s.matches(p));
		
		// 02-1111-1234, 02-111-1111
		p="02-\\d{3,4}-\\d{4}";
		s="02-123-1242";
		System.out.println(s.matches(p)); // true
		s="010-2123-1242";
		System.out.println(s.matches(p)); // false
		
		
		
		
	}

}
