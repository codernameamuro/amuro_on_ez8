package ch03.unit05.조건연산자;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int a;
		String s;
		
		System.out.println("정수 ?");
		a=sc.nextInt();
		
		s=a%2 ==0? "짝수" : "홀수";
		//s=a&1 == 0 ? "짝수" : "홀수"; //오류발생 == 연산 속도가 빠름 
		//s=(a&1) == 0 ? "짝수" : "홀수"; 오류발생 x 
		System.out.println(a+"->"+s);
		
		sc.close();
		
	}

}
