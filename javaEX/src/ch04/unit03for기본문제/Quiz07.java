package ch04.unit03for기본문제;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2,  t, s, count;
		t=0;
		System.out.println("두 정수?");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		if(n1>n2) {
			t=n1; n1=n2; n2=t;
		}
		s=count=0;
		for(int i=n1; i<=n2; i++) {
			if(i%3==0 || i%5==0) {
				s+=i;
				count++;
			}
		}
		System.out.println("합:"+s);
		System.out.println("평균:"+s/count);
		
		
		
		
		sc.close();
		
	
	}

}
