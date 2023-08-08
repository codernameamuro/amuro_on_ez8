package ch09.unit03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c;

		try {
			// 1) 예외가 발생할 가능성이 있는 코드를 작성
			System.out.println("두 정수 ?");
			a = sc.nextInt();
			b = sc.nextInt();

			c = a / b;
			System.out.println(a + "/" + b + "=" + c);
		} catch (Exception e) {
			// 2) 예외가 발생할 때 실행할 코드 작성
			System.out.println("연산이 불가능합니다.");
		}
		
		// 3) 
		System.out.println("end...");
		sc.close();

	}

}
