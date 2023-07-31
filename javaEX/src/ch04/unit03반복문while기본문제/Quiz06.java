package ch04.unit03반복문while기본문제;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1, n2;
		int t, n, s;
		//n=0; // 9
		
		System.out.println("두 수?");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		// n2 가 항상 큰 수로
		if(n1>n2) {
			t=n1; n1=n2; n2=t;
		}
		
		n=n1;
		s=0;
		//n=0; //10
		while(n<=n2) {
			s+=n;                    // 0 1
			n+=1; //위치 바꾸면 제대로     //n s
		}                            // 1 3   
		System.out.println(s);       // 2 6
		
		

		sc.close();

	}

}
