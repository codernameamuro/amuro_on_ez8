package ch02.unit04DataType;

public class Ex04_DataType {

	public static void main(String[] args) {
		short s1, s2; // -32768 ~ 32767
		
		s1 = 'A'; // 문자는 컴퓨터에서 ASCII 코드로 저장 
			// 'A' : 0100 0001 ---> 65 
		s2 = 100;
		System.out.println(s1 + "," + s2); // 65, 100
		
		int i1 = 200;
		int i2 = 'a';
		System.out.println(i1 + "," + i2); // 200, 97
		
		i2 = '대';
		System.out.println(i2); // 45824
		
		i2 = 1 + 2;
		System.out.println(i2); // 3
		
		i2 = '1' + '2'; // '1' : 문자 ---> ASCII 코드값 : 49, '2' : 50 
		System.out.println(i2); // 99 // 49 + 50   
		
		byte b = 30;
		i1 = b; // int > byte, 가능 i1(int)에 b(byte)를 넣는다
		System.out.println(i1); //30
		
		//b=i1;  // 컴오류. 큰자료형을 작은자료형에 넣을 수 없다 int> byte
		b = (byte)i1; // 강제로 int를 byte에 변환하여 대입
		System.out.println(b);
		
		long x = 100;  // int 리터널을 long에 대입. long > int 이르모 가능
		long y = 200L; // 22억이 넘으면 L붙여야 함
		System.out.println(x + "," + y);
		
		//i1 = x; // 컴 오류 
		
		i1=(int)x;
		System.out.println(i1); // overflow 조심
		
		
		
	}

}
