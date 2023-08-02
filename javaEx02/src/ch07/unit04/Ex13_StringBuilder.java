package ch07.unit04;

public class Ex13_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("seoul"); //false
		StringBuilder sb2 = new StringBuilder("seoul"); //false
		
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		// 문자열 비교 => String 변환 후 비교
		System.out.println(sb1.toString().equals(sb2.toString())); //true
		
		// 다른 객체와 문자열 비교
		String s = "seoul";
		// System.out.println(s==sb1); // 컴파일 오류, 다른 클래스 객체는 비교 불가
		System.out.println(s.equals(sb1.toString())); // true
		System.out.println(s.contentEquals(sb1)); // true	
			// contetEquals() : 다른 객체와 문자열 비교 
		
		// StringBuilder 의 문자열 길이
		System.out.println(sb1.length()); // 문자열 길이 
		
		// 기본 버퍼의 크기 : 16
		StringBuilder sb3 = new StringBuilder();
		System.out.println("기본버퍼의 크기 : "+sb3.capacity());
		
		// 뒤에 문자열 추가
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");
		System.out.println("버퍼의 크기 : "+sb3.capacity());
		System.out.println(sb3.toString());
		System.out.println(sb3.toString().toUpperCase()); // Builder 나 Buffer에 없는 api string으로 바꿔 사용
		
		// seoul 앞에 한국을 삽입하고 싶다
		
		sb3.insert(0,"한국");
		System.out.println(sb3);
		
		// korea 뒤에 사랑
		System.out.println(sb3.indexOf("korea"));
		sb3.insert(sb3.indexOf("korea")+"korea".length(),"사랑");		
		System.out.println(sb3);
		
		// 대한민국 삭제 
		// delete(s, e) : s 인덱스에서 e-1 인데스까지 지운다
		sb3.delete(sb3.indexOf("대한민국"), sb3.indexOf("대한민국")+"대한민국".length());
		System.out.println(sb3.toString());
		
		sb3.delete(sb3.indexOf("우리나라"), sb3.indexOf("우리나라")+"우리나라".length());
		System.out.println(sb3.toString());
		
		// korea 부터 뒤에 문자 모두 지우기 
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3.toString());
		
		System.out.println(sb3.capacity()); // 34
		
		// 버퍼의 크기를 문자열 크기로 변경하기 
		sb3.trimToSize();
		System.out.println(sb3.capacity()); // 7
		
		// 모든 문자를 지우기 
		sb3.delete(0, sb3.length());
		System.out.println("모두 삭제 후 : "+sb3);
		
		
	}
	

}
