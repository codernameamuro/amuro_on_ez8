package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nn = new int[3];
		int n;
		int idx;

		try {
			idx = 0;
			do {
				System.out.println("숫자를 입력하세요");
				n = sc.nextInt();
				nn[idx++] = n;

			} while (n != 0);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력을 초과했습니다.");

		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		} finally {
			System.out.println("예외 발생 유무와 상관 없이 실행 합니다.");
		}

		System.out.println("\n입력한 숫자");
		for (int a : nn) {
			System.out.print(a + " ");

		}

		System.out.println();

		sc.close();

	}

}
