package ch03.unit05.조건연산자;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		//두 정수를 입력 받아 두 정수 사이의 정수의 개수는 ? 
		Scanner sc= new Scanner(System.in);
		/*
		 두 수 ? 1 5
		 1과(와) 5사이의 정수의 개수는 5개
		 
		 두 수 ? 5 1
		 5과(와) 1사이의 정수의 개수는 5개 
		 */
		
		int a,b;
		int c;
		
		System.out.println("두 수?");
		a=sc.nextInt();
		b=sc.nextInt(); // 한 번에 두 개의 객체 못 넣나요???
		
		c=a-b>0 ? a-b+1:-(a-b-1);
		System.out.println(a+"와"+b+"사이의 정수의 개수는"+c);
		
		
		
		
		
		
		sc.close();
	}

}
