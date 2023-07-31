package ch04.unit02switch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int year, month, days;
		
		System.out.println("년도 ?");
		year=sc.nextInt();
		
		System.out.println("월 ?");
		month=sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5: case 7: case 8 : case 10 : case 12 : days=31; break;
		case 4 : case 6 : case 9: case 11 : days=30; break;
		case 2 :
			days = year%4==0 && year%100!=0 || year%400==0 ? 29 : 28;
			break;
		default : days=-1; break;
		
		
		}
		
		if(days==-1) {
			System.out.println("날짜 입력 오류...");
			
		} else {
			System.out.printf("%d년 %d월은 %d까지 있습니다", year,month,days);
		}
	
		
		
		
		
		
		sc.close();

	}

}
