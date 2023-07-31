package ch04.unit03반복문while기본문제답;

import java.util.Scanner;

public class Answer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1, n2, t;
		int n,s;
		System.out.println("두 수?");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		//두수중 적은수는 n1, 큰수 n2
		
		if(n1>n2) {
			t=n1; n1=n2; n2=t;
			
		}
		s=0;
		n=n1;
		while(n<=n2) {
			s+=n;
			n++;
			
		}
		System.out.println(n1+"~"+n2+"까지 합"+s);
		
		
		sc.close();

	}

}
