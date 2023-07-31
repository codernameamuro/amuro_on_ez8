package ch02.unit04DataType;

public class Ex02_Literal {

	public static void main(String[] args) {
		int a;
		long b; 
		
		a=365; // 10진수
		System.out.println(a); // 365
		
		a=0365; // 8진수
		System.out.println(a); // 245
		
		a=0x365; // 16진수
		System.out.println(a); // 869
		
		a=0b101; // 2진수
		System.out.println(a); // 5
		
		a=1_9_0;
		System.out.println(a); //190 언더바는 정수의 자리 구분용
		
		//a=0358; // 컴파일 오류. 8진수에 8이 없음
		//a=0b102; // 컴파일 오류. 2진수에 2가 없음
		//a= AB; // 컴파일 오류. AB는 변수이며 AB라는 변수가 정의되어 있지 않음 
		a=0xAB; // 16진수 
		System.out.println(a); // 171 
		
		// b=220000000000; // 불가능 int 값 초과
		b = 22000000000L; // long 리터널
		System.out.println(b);
		
		

	}

}
