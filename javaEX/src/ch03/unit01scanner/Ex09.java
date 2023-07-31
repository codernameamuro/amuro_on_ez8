package ch03.unit01scanner;

public class Ex09 {

	public static void main(String[] args) {
		// String의 +는 문자열 결합
		// 문자열 + 기본자료형 => 문자열로 결합

		String s;
		
		s='A' + 10 + "korea";
			// 'A' + 10 => 75
			// 75 + "korea"
		System.out.println(s); //75korea
		
		s="korea" + 'A' + 10;
		System.out.println(s); //koreaA10
		
		char c = '0' + 20; // 48+20 
		System.out.println(c); //D
		
		
	}

}
