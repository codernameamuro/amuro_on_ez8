package ch05.unit01배열;

import java.util.Scanner;

public class Quiz04_01 {

	public static void main(String[] args) {

		int days[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y, m;
		int total, w;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("년도 ?");
			y = sc.nextInt();
		} while (y < 1900);

		do {
			System.out.println("월 ?");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		days[1] = y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ? 29 : 28;
		total = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		for (int i = 0; i < days.length; i++) {
			total += days[i];
		}
		
		total+=1;
		w=total%7;
		
		System.out.printf("	%d년 %d월", y,m);
		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("-------------------");
		
		for(int i = 1; i<days[i-1]; i++ ) {
			System.out.print(i);
			if(w%7==0) {
				System.out.println();
			}
			
			
			
		}

		sc.close();

	}

}
