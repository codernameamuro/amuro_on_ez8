package ch03.unit01scanner;

import java.util.Scanner;

/*
 - 금액을 입력 받아 5만원권에서 1원권까찌의 화폐 매수 구하기 
 - 실행 예
  금액 ? 5553131331
  5만원권 : 
  1만원권 :
  5천원권 :
  1천원권 :
  500원권 :
  100원권 :
  50원권 :
  10원권 :
  1원권 :
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("금액 ?");
		a=sc.nextInt();
		
		System.out.println("5만원권 :" + a/50000);
		System.out.println("1만원권 :" + (a%50000)/10000);
		System.out.println("5천원권 :" + ((a%50000)%10000)/5000);
		System.out.println("1천원권 :" + (((a%50000)%10000)%5000)/1000);
		System.out.println("5백원권 :" + ((((a%50000)%10000)%5000)%1000)/500);
		System.out.println("1백원권 :" + (((((a%50000)%10000)%5000)%1000)%500)/100 );
		System.out.println("5십원권 :" + ((((((a%50000)%10000)%5000)%1000)%500)%100)/50);
		System.out.println("1십원권 :" + (((((((a%50000)%10000)%5000)%1000)%500)%100)%50)/10);
		System.out.println("5원권:" + ((((((((a%50000)%10000)%5000)%1000)%500)%100)%50)%10)/5);
		System.out.println("1원권:" + ((((((((a%50000)%10000)%5000)%1000)%500)%100)%50)%10)%5);
		
		sc.close();
		

	}

}
