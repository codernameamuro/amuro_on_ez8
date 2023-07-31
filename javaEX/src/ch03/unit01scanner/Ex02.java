package ch03.unit01scanner;
/*
 -연산을 위한 기본 타입 int
 - +, -, *, /, % 연산의 피연산자가 byte, char, short 이면 자동으로 int로 변환하여 연산
 */
public class Ex02 {

	public static void main(String[] args) {
		byte b1 = 5, b2=10, b3;
		
		b3 = 10 + 5;// 리터럴을 연산하면 형변환이 일어나지 않음 
		System.out.println(b3);
		
		 
		// b3=b1+b2; // 컴파일 오류
		// byte형 + byte형 => int형 + int형 : 결과가 int 형 
		
		b3=(byte)(b1+b2);
		//byte형으로 바꾸기 위해선 형변환 필요
		
		b1=100;
		b2=120;
		b3=(byte)(b1+b2);
		System.out.println(b3); // overflow 발생 
		
		short s1 = 10, s2 = 20, s3;
		// s3=s1+s2 , byte와 같이 int를 넣을 수 없음
		 s3=(short)(s1+s2);
		 System.out.println(s3);
		 
		char ch = 'A';
		//ch = ch + 10; // char + 10 --> int값임. char에 int 넣는 것 불가능 
		ch = (char)(ch+10);
		System.out.println(ch); // 'K'
		
		ch = 'A' + 10;
		System.out.println(ch);
		
		
	}

}
