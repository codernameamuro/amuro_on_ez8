package ch02.unit04DataType;

public class Ex05_DataType {

	public static void main(String[] args) {
		short a = 350, b = -350;
		System.out.println(a + "," + b);
		System.out.printf("%X %X%n", a, b); // 16진수 
		System.out.printf("%#X %#X%n", a, b); // 16진수 
		
		byte b1 = (byte)129;
		byte b2 = (byte)385; 
		System.out.println(b1 == b2); // true
			// 두 변수의 값 같으면 true, 아니면 false
		System.out.println(b1 + "," + b2);
		 	//-127, -127

	}

}
