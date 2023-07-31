package ch04.unit03반복문while응용문제;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("정수 ?");
		number = sc.nextInt();

		int i = 1;
	

		while (number > 1) {
			i++;
			while (number % i == 0) {
				System.out.println(number + ":" + "소수가 아님");
				break;
				
			}
			
		}

		sc.close();

	}

}
