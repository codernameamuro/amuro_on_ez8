package ch02.unit04DataType;

import java.util.Scanner;

public class Answer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code;
		System.out.print("출력할 문자의 코드는(0-65535)? ");
		code= sc.nextInt();
		
		System.out.printf("%d => %c%n", code, code);
				
		sc.close();
	}

}
