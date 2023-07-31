package ch04.unit01if;

import java.util.Scanner;

public class Ex02_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정수 ?");
		n=sc.nextInt();
		
		if(n%2==0) {
			//조건 참
			System.out.println(n + ":짝수");
			
		} else {
			//조건 거짓
			System.out.println(n +":홀수");
		}
		
		
		
		
		/*
		String s;
		if(n%2==0) {
			s="짝수";
			
		}else {
			s="홀수";
		
		}
		System.out.println(n + "->" + s);
		
		*/
		/*
		String s;
		if(n%2==0) {
			s="짝수";
			
		}
			
		
		}
		System.out.println(n + "->" + s);
		*/
		sc.close();
	}

}
