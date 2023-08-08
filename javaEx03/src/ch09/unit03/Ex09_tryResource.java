package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_tryResource {

	public static void main(String[] args) {
		int n;
		String s;

		// try ~ with ~ resource : 자동으로 resource가 close
		// JDK 7부터 사용 가능
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("나이 ?");
			n = sc.nextInt();

			s = n >= 19 ? "성인" : "미성년자";
			System.out.println("결과 :" + s);

		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 할 수 있습니다");
		}

		System.out.println("end...");

	}

}
