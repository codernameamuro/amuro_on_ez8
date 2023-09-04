package ch09.unit03;

import java.util.Scanner;

public class Ex01_trycatch {
	public static void main(String[] args) {
		//예외 처리를 하지 않았을 때 일어날 수 있는 비정상적인 상태
		// b가 0이면 프로그램 비정상적으로 종료 
		// 숫자가 아닌 문자열을 입력하면 비정상적으로 종료 
		
		
		
		Scanner sc = new Scanner (System.in);
		
		int a,b,c;
		
		System.out.println("두 정수 ?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a / b;
		System.out.println(a+"/"+b+"="+c);
		
		System.out.println("end...");
		
		
		
		sc.close();
	}

}
