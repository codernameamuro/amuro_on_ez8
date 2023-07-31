package ch04.unit03반복문while응용문제;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, count, d;
		d = 10;
		count = 1;
		System.out.println("수?");
		n = sc.nextInt();

		while (n / d > 0 || n / d < 0) {
			if (n > 0) {
				count++;
				d = d * 10;
			}else {
				count++;
				d=d*10;
			}

		}
		System.out.println(n + "은" + count + "자리 정수");
		sc.close();

	}

}
