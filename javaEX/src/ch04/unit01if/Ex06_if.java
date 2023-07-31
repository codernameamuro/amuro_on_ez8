package ch04.unit01if;

import java.util.Scanner;

public class Ex06_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("정수? ");
		n=sc.nextInt();
		
		//잘못 작성한 경우
		/*
		if(n%2==0) {	
			System.out.println(n + " :2의 배수");
		}else if(n%3==0) {
			System.out.println(n + " :3의 배수");
		}else if(n%2==0 && n%3==0) {
			System.out.println(n + " :2 또는 3의 배수");
		}else {
			System.out.println(n + " :2 또는 3의 배수 x ");
		}
		*/
		if(n%2==0 && n%3==0) {
		System.out.println(n + " :2 또는 3의 배수");
		}else if(n%2==0) {	
			System.out.println(n + " :2의 배수");
		}else if(n%3==0) {
			System.out.println(n + " :3의 배수");
		}else {
			System.out.println(n + " :2 또는 3의 배수 x ");
		}
		
		sc.close();

	}

}
