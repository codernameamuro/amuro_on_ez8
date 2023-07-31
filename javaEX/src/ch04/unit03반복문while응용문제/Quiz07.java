package ch04.unit03반복문while응용문제;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int number,rn;
		rn=0;
		
		
		do {
			System.out.println("수?");
			number=sc.nextInt();
				
		} while(number<0);
		System.out.println("원래의 수:"+number);
		
		while(number>0) {
			rn = rn * 10 + number % 10;   
            number /= 10;					
			
			
		}
		System.out.println("뒤집은 수:" + rn);
		
		
		
		
		
		
		
		sc.close();
	}

}
