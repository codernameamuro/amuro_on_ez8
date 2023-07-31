package ch04.unit01if;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		char s;
		
		System.out.println("두 수?");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("연산자[+,-,*,/]?");
		s=sc.next().charAt(0);
		
		if(s=='+') {
			System.out.printf("%d %c %d ="+(int)(a+b), a,s,b );
		}
		if(s=='-') {
			System.out.printf("%d %c %d ="+(int)(a-b), a,s,b );
		}
		if(s=='*') {
			System.out.printf("%d %c %d ="+(int)(a*b), a,s,b );
		}
		if(s=='/') {
			System.out.printf("%d %c %d ="+(int)(a/b), a,s,b );
		}
		
		
		
		sc.close();

	}

}
