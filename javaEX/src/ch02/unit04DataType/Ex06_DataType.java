package ch02.unit04DataType;

public class Ex06_DataType {

	public static void main(String[] args) {
		float a;
		
		a= 10; // int 리터널을 float에 대입 
		System.out.println(a); // 10.0
		// float > int 
		
		// a= 0.0; // 컴파일오류 
		// 0.0은 double 형. double > float 
		// double 리터널 float 변수에 대입 불가능 
		
		a=0.0f; // 단정도형 
		System.out.println(a); // 0.0 
		
		a= 1.2e04f; // 1.2 * 10 의 4승
		System.out.println(a); // 12000.0
		
		//char < int < long < float < double 
		a='A'; // char
		System.out.println(a); //65.0
		
		double b;
		b=0.5;
		System.out.println(b);
		
		
		b=3.14D; //float과 구분하기 위해 d를 붙이지만 강제는 x 
		System.out.println(b);
		
		//a=b; // 컴파일 오류. double > float
		a=(float)b;
		System.out.println(a); // 3.14
		
	}

}
