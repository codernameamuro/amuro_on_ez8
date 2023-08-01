package ch04.unit03WhileQuiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number,n,a,b,c;
		
		System.out.println("개 수?");
		number =sc.nextInt();
		a=0; b=1; c=0;
		n = 0; 
		while(n<number) {
			n++;
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		
		
		
		}
		
		sc.close();

	}

}
