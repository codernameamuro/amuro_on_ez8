package ch04.unit03반복문while응용문제;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;

		do {
			System.out.print("정수 ?");
			number = sc.nextInt();
		} while (number < 2);

		int i = 2;
		System.out.print(number + ":");
		while (number > 1) {
			while (number % i == 0) {
				System.out.print(i);
				number /= i;
				if (number >= i) {
					System.out.print("*");

				}

			}
			i++;
		}

		sc.close();

	}

}
