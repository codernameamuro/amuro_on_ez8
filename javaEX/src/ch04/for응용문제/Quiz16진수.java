package ch04.for응용문제;

import java.util.Scanner;

public class Quiz16진수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// 1~9 --> 1~9
		// 10~15 --> A~F
		int num,x,y;
		
		
		System.out.println("정수 ? ");
		num=sc.nextInt();
		
		do {
			y=x/16;
			x=y;								
			}while(y>16);
		if(y)
			
			
			
		}
		
		
		
		
		
		sc.close();

	}

}
