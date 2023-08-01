package ch07.unit04;
/*
		 - String 클래스
		  : 문자열을 나타내는 클래스
		  : 문자열을 상수풀(String constant Pool)에 저장
		  상수풀에서 intern() 메소두로 해당 문자열을 검색하여 문자열이 존재하면 문자열의 주소를 반환
		  문자열이 존재하지 않으면 객체를 추가하여 새로운 참조값을 반환
		  : 내욜불변(immutable) 
		  Integer, Long, Double 등의 Wrapper 클래스도 내용 불변
		  내용이 변경되면 새로운 영역에 메모리를 할당 받아 저장하고 기존 인스턴스는 GC의 대상이 된다.
		  : String 클래스는 final 클래스이므로 하위 클래스를 가질 수 없다.
 */

public class Ex01_String {

	public static void main(String[] args) {
		// 상수풀에 동일한 문자열이 존재하면 해당 문자열의 주소를 반환
		String s1 = "seoul";
		String s2 = "seoul"; // s2 s1과 동일한 곳을 가리킴 주소는 s1에게 감
		
		// 새로운 객체를 생성하여 문자열을 설정
		String s3 = new String("seoul"); // s3는 다름 new는 새로운 공간에 메모리를 할당 받아 seoul을 넣는다.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//  == 는 문자열을 비교하지 않고 문자열이 저장된 주소를 비교한다 
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false  주소가 다름 
		
		// 동일한 객체는 해쉬코드가 같지만 해쉬코드가 같다고 동일한 객체는 아니다
		
		System.out.println(s1.hashCode()); // s1,2,3 해쉬코드는 같다 seoul이란 스펠링은 같기 때문에
		System.out.println(s2.hashCode()); // 1,2와 3의 주소는 다르기 때문에 객체는 다름 
		System.out.println(s3.hashCode());
		
		// 문자열을 불변이다
		// 즉, 문자열이 변경되면 기존의 문자열을 변경하는 것이 아니라
		// 새로운 영역에 메모리를 할당 받아 처리한다.
		
		s1 += "korea";  // 어떠한 경우라도 이런식으로 문자열을 처리하면 안된다. 처리 속도 문제
		System.out.println(s1); // 새로운 영역에 메모리를 할당받음 
		System.out.println(s2);
		
		System.out.println(s1==s2); // false
		
		// 길이가 0인 문자열
		String s4 = "";
		System.out.println(s4.length()); // length() : 문자열 길이 반환
		
		// s4=null;
		// System.out.println(s4.length());
		// s4가 null이므로 객체가 생성된것이 아니다.
		// 따라서 인스턴스 메소드나 인스턴스 변수를 접근할 수 없다.
		

	}

}
