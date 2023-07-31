package ch04.unit01조건문if문제;

import java.util.Scanner;

/*
	두정수를 입력 받아 큰수에서 적은수와의 차이를 구하는 프로그램
*/
public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		/*
		c = a - b;
		if(c < 0)
			c = -c;
		*/
		
		if(a > b) {
			c = a - b;
		} else  {
			c = b - a;
		}
		
		System.out.println("두수의 차이 : " + c);
		
		sc.close();
	}
}
