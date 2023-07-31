package ch04.unit02switch;

import java.util.Scanner;

public class Ex07_Switch {

	public static void main(String[] args) {
		//여러조건(,로 구분), JDK 14 부터 가능
		// 화살표 case 라벨(->)을 사용하면 마지막에 break를 사용하는 것과 동일
		// 화살표 case 라벨(->)을 사용할 때 실행문이 2개 이상이면 {} 필요 
		
		Scanner sc = new Scanner(System.in);
		
		int y, m, d;
		
		System.out.println("년도 ?");
		y=sc.nextInt();
		
		System.out.println("월 ?");
		m=sc.nextInt();

		switch(m) {
		case 1,3,5,7,8,10,12 -> d = 31;
		case 4,6,9,11 -> d = 30;
		case 2 -> d = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		default -> d = -1;	
		}
		
		
		if(d!=-1) {
			System.out.println(y+"년"+m+"월의 마지막 일자는 "+d+"일");
			
		} else {
			System.out.println("날짜 입력 형식 오류..");
		}
		
		
		
		sc.close();
	}

}
