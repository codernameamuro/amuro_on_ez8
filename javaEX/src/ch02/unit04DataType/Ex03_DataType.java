package ch02.unit04DataType;

public class Ex03_DataType {

	public static void main(String[] args) {
		byte a; // 선언
		byte b = 120 ; // 선언과 동시에 초기화
		
		// System.out.println(a); // 컴오류. 초기화 안됨
		System.out.println(b); 
		
		// a= 129; // 컴파일 오류. byte는 -128~127까지 가능
		
		a =(byte)129; // overflow 발생하여 잘림이 발생
		// 강제로 byte로 형태변환, 문제가 발생하면 개발자 책임 
		System.out.println(a); // -127 
		
		a=(byte)385;
		System.out.println(a); // -127
		
		
		
		
	}

}
