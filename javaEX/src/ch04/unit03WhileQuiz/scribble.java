
package ch04.unit03WhileQuiz;

import java.util.Scanner;
public class scribble {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1, n2, t, r,rs ;
		t=0;
		r=0;
		System.out.println("두 정수?");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		if(n1<n2) {
			t=n1; n1=n2; n2=t;
		}
		while(n1%n2==1) {
			r=n1%n2;
			n1=n2;
			n2=r;
			
		}System.out.println("GCD(최대공약수):"+r);
		System.out.println("LCM(최소공배수):"+(n1*n2)/r);
			
		

		sc.close();

	}

}
