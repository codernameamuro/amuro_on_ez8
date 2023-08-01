package ch04.unit03WhileQuiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, d;
		d = 0;
		System.out.println("두 수?");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		// n1%n2 --> n2%r ---> r%r1

		// n1이 항상 큰 수
		
		do {
			if (n1 < n2) {
				n2 = n1;
				n1 = d;
				d = n2 % n1;

			} else {
				n1 = n2;
				n2 = d;
				d = n1 % n2;
			}
			
		} while (d == 1);
		System.out.println("gcd(최대공약수):" + d + "\n" + "lcm(최소공배수):" + (n1 * n2) / d);
		sc.close();

	}

}
