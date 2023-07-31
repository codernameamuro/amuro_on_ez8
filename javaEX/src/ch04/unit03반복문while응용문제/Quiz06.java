package ch04.unit03반복문while응용문제;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		int n, guess, cnt;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("수?");
		guess=sc.nextInt();
		
		n=(int)(Math.random()*100)+1; //+1 무슨 의미?
		cnt=1;
		do {
			
			cnt++;
			
			if(guess>n) {
				System.out.println("입력한 수보다는 작은수 입니다");
				
			}else if (guess<n) {
				System.out.println("입력한 수보다는 큰수 입니다");
				
			}else if(guess==n) {
				 break;
					
			}
			
			System.out.println("수?");
			guess=sc.nextInt();
			
		

		}
		while(guess!=n); 
		System.out.println(cnt+"번 만에 성공했습니다");
		
		sc.close();
	
		
		
	}

}
