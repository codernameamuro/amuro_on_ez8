package ch02.unit04DataType;

public class Ex11_DataType {

	public static void main(String[] args) {
		String s1, s2; // 객체
		
		s1 = "korea";
		System.out.println(s1);
		
		s2= ""; // 가능. 길이가 0인 문자열 
		
		// 문자열 + 문자열 ---> 문자열을 결합 
		s2 = "seoul" + "korea";
		System.out.println(s2); //seoulkorea
		
		// 문자열 + 다른기본자료형 ---> 문자열로결합
		s2= "nz" + '2' + '3'; // nz23
		System.out.println(s2);
		
		s2= 1 + 2 + "korea";
		System.out.println(s2); // 3korea
		
		// '1' : 49 , '2' : 50
		s2= '1' + '2' + "korea";
		System.out.println(s2); // 99korea. 숫자 먼저 계산 
		
		
		s2 = "korea" + '1' + '2';
		System.out.println(s2); // korea12
		
		//s1= 123; // 컴오류. 정수를 String 변수에 대입할 수 없음 
		s1= "" + 123; 
		System.out.println(s1); // 이런식의 코딩 x 
	}

}
