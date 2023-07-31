package ch04.unit03반복문while응용문제;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cost;
		System.out.println("금액?");
		cost=sc.nextInt();
		
		while(cost>=0) {
			System.out.println("50000원권/개수:"+cost/50000);
			System.out.println("10000원권/개수:"+(cost%50000)/10000);
			System.out.println("5000원권/개수:"+((cost%50000)%10000)/5000);
			System.out.println("1000원권/개수:"+(((cost%50000)%10000)%5000)/1000);
			System.out.println("500원권/개수:"+((((cost%50000)%10000)%5000)%1000)/500);
			System.out.println("100원권/개수:"+(((((cost%50000)%10000)%5000)%1000)%500)/100);
			System.out.println("50원권/개수:"+((((((cost%50000)%10000)%5000)%1000)%500)%100)/50);
			System.out.println("10원권/개수:"+(((((((cost%50000)%10000)%5000)%1000)%500)%100)%50)/10);
			System.out.println("5원권/개수:"+((((((((cost%50000)%10000)%5000)%1000)%500)%100)%50)%10)/5);
			System.out.println("1원권/개수:"+(((((((((cost%50000)%10000)%5000)%1000)%500)%100)%50)%10)%5)/1);
			break;






			
		}
		
		
		
		
		sc.close();

	}

}
