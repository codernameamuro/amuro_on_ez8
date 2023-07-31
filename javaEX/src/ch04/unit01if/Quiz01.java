package ch04.unit01if;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("첫번째 수?");
		a=sc.nextInt();
		System.out.println("두번째 수?");
		b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a-b);
		}else if (b>a) {
			System.out.println(b-a);
		}else if (b==a)
			System.out.println(a-b);
		
		
		
		
		
		
		
		sc.close();

	}

}
