package ch02.unit04DataType;

public class Ex08_DataType {

	public static void main(String[] args) {
		//char : 부호없는 정수형. 2byte
		
		char c1 = 'A';
		char c2;
		char c3;
		
		c2 = '\u0041'; // 유니코드(16진수), ASCII 코드 65에 해당하는 값
		c3 = 65;
		
		System.out.println(c1 + "," + c2 + "," + c3);
		
		//c1= ''; // 컴파일 오류. 빈 문자열 없음
		//c2='AB'; // 컴파일 오류. 문자는 한글자로만 구성되어 있음
		//c1="A"; // 컴파일 오류. "A"는 문자열로 char에 대입 불가
		
		c1 = '대';
		System.out.println(c1);
		
		int a = c1; // char < int
		System.out.println(a); //45824. '대'의 유니코드 값

		a= '대';
		System.out.println(a); //45824 
		
		a='0'; // 문자 '0'
		System.out.println(a); //문자 '0' ASCII 코드 값 48
		
		double b; // double, char와 int보다 크기 때문에 가능
		b = 'A' + 10;
		System.out.println(b); //75.0
		
		
	}

}
