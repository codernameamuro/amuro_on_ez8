package ch02.unit04DataType;

import java.util.Scanner;

public class Answer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		int code;
		
		System.out.print("한문자 ? ");
		c = sc.next().charAt(0);
		code = c;
		System.out.printf("%c => %d%n", c, code);
		
		sc.close();
	}

}
