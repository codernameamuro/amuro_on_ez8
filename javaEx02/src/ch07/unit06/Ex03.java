package ch07.unit06;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1~100 사이의 난수를 발생하여 20번 안에 맞추기
		// 발생된 난수 : 73
		// 수?
		Scanner sc = new Scanner(System.in);

		//Random rnd = new Random();
		// int num = rnd.nextInt(100)+1 로도 가능
		int n;
		int num;
		int count = 0;
		n = (int) (Math.random() * 100);

		do {

			System.out.println("수를 입력하세요");
			num = sc.nextInt();
			count++;

			if (num > n) {
				System.out.println("난수가 더 작습니다");
			} else if (num < n) {
				System.out.println("난수가 더 큽니다");
			} else {
				break;

			}
		} while (num != n && count < 20);
		if(num!=n) {
			System.out.println("실패!");
		}else {
		System.out.println(count + "번 만에 맞췄습니다");
		}
		sc.close();

	}

}
