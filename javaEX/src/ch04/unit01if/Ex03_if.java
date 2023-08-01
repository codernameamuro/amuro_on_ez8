package ch04.unit01_if;

import java.util.Scanner;
/*
  -정수 3개를 받아 오름차순으로 출력하기 
  10 5 9
  5 9 10 
 */
public class Ex03_if {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a, b, c;
		System.out.println("세 정수?");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		// 내림차순 노가다 버전 
		/*
		if (a>b && b>c) {
			System.out.print(a+","+ b+","+ c);
		}
		if (a>c && c>b) {
			System.out.println(a+","+ c+","+ ","+ b);
		}
		if (b>a && a>c) {
			System.out.println(b+","+ a+","+ c);
		}
		if (b>c && c>a)  {
			System.out.println(b+","+ c+","+ a);
		}
		if (c>a && a>b ) {
			System.out.println(c+","+ a+","+ b);
		}
		if (c>b && b>a) {
			System.out.println(c+","+ b+","+ a);
			
		}
		*/
		
		int t;
		if (a>b) { // 10 7 2 ---> 7 10 2
			t=a; a=b; b=t;
		} 
		if (a>c) { // 7 10 2 ---> 2 10 7
			t=a; a=c; c=t;
		} 
		if (b>c) { // 2 10 7 ---> 2 7 10
			t=b; b=c; c=t;
		}
		System.out.println(a + "," + b + "," + c);
		
		
		sc.close();

	}

}
