package ch04.unit01조건문if문제;

import java.util.Scanner;

/*
	근무시간을 입력 받아 급여를 계산하는 프로그램
*/
public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay, hours, rate = 10000;
		
		System.out.print("근무 시간 ? ");
		hours = sc.nextInt();
		
		if(hours > 8) {
			pay = 8 * rate + (int)((hours - 8) * rate * 1.5);
		} else {
			pay = hours * rate;
		}
		
		System.out.printf("급여 : %,d원\n", pay);
		
		sc.close();
	}

}
