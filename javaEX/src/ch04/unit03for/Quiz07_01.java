package ch04.unit03for;

import java.util.Scanner;

public class Quiz07_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n,  s, count;
	
		s=count=0;
		System.out.println("두 정수?");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		if(n1>n2) {
			for(n=n2; n<n1; n++) {
				if(n%3==0 || n%5==0) {
					s+=n;
					count++;
				}
			}
		}
	
		
		System.out.println("합:"+s);
		System.out.println("평균:"+s/count);
		
	
		
		
	sc.close();
	
	
	}

}
