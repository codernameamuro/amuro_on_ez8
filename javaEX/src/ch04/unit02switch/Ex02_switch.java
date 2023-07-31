package ch04.unit02switch;

import java.util.Scanner;

public class Ex02_switch {

	public static void main(String[] args) {
		// break : switch 문을 빠져 나감
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("수 ?");
		n = sc.nextInt();

		/*
		 * switch(n) { case 3:System.out.println("***"); break; //switch 빠져나갈 때 사용 break
		 * case 2:System.out.println("##"); break; case 1:System.out.println("&");
		 * break;
		 * 
		 * }
		 */
		switch (n) {
		case 3:
			System.out.print("*");
			System.out.print("#");
			System.out.print("&");
			break; // switch 빠져나갈 때 사용 break
		case 2:
			System.out.println("#");
			System.out.println("&");
			break;
		case 1:
			System.out.println("&");
			break;

		}
		sc.close();

	}
}
