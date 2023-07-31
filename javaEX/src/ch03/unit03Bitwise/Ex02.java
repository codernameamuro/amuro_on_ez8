package ch03.unit03Bitwise;

public class Ex02 {

	public static void main(String[] args) {
		int a= 13, b=20;
		int c,d;
		
		// 홀수와 짝수를 판별하는데 응용가능
		c = a&1; // 0000 1101
		         // 0000 0001
		         // 0000 0001 --> 1 (홀수는 어떤 경우라도 마지막이 1)
		d = b&1; // 0001 0100
		         // 0000 0001
		         // 0000 0000 --> 0
		//홀수는 1 짝수는 0이 나온다 
		System.out.println(c+","+d);
		
		

		
	}

}
