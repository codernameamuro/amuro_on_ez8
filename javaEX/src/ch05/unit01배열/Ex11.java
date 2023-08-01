package ch05.unit01배열;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		
		int [] months = new int [] {31,28,31,30,31,30,31,31,30,31,30,31};
		// months[0] = > 1월의 마지막 일자
		// months[11] => 12월의 마지막 일자 
		String [] weeks = new String [] {"일","월","화","수","목","금","토"};
		
		int y, m, d;
		int tot, w;
		
		do{
			System.out.println("년도 ?");
			y=sc.nextInt();
			
		}while(y<1900);
		
		do {
			System.out.println("월 ?");
			m=sc.nextInt();
		}while(m<1 || m> 12);
		
		//2월의 마지막 날짜 28 or 29
		months[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		
		do {
			System.out.println("일 ?");
			d=sc.nextInt();
		}while(d<1 || d>months[m-1]);
		
		
		// 1년 1월 1일 월요일 부터 원하는 날짜까지 날짜를 전부 계산하고 7로 나누면 됨
		// 1년 1월 1일 ~ y년 m월 d일까지의 전체 일수 
		// 1.1.1 ~ 2023.07.26
		// 2022*365 + 1,2,3,4,5,6+26
		tot = (y-1)*365+(y-1)/4 - (y-1)/100+(y-1)/400;
		for ( int i = 0 ; i<m-1; i++) {
			tot+= months[i];
		}
		tot+=d;
		
		w=tot%7;
		System.out.printf("%d년 %d월 %d일은 %s요일 입니다.\n",y,m,d,weeks[w]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
