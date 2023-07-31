package ch03.unit03Bitwise;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("두수 ?"); // 10 5
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		System.out.println("원래수 : " + a + "," + b); // 10 5
		
		/* 두 변수의 값 바꾸기 --> 이것도 가능 
		int c = a;
		    a = b;
		    b = c;    
		*/
		// a 10 b 5
		a=a^b; //0000 1010
		       //0000 0101
		       //0000 1111  //15
		
		b=b^a; //0000 0101
		       //0000 1111
		       //0000 1010  //10
		
		a=a^b; //0000 1111
		       //0000 1010
		       //0000 0101  //5
		
		
		System.out.println("교환후 : " + a + "," + b); // 5 10 
		
		sc.close();

		
	}

}
