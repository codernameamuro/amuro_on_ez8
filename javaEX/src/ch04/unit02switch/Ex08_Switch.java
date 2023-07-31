package ch04.unit02switch;

import java.util.Scanner;

public class Ex08_Switch {

	public static void main(String[] args) {
		// switch 값 반환하기
		// -> 또는 yield 값을 변환 

	Scanner sc = new Scanner(System.in);
	
	int y, m, d;
	
	System.out.println("년도 ?");
	y=sc.nextInt();
	
	System.out.println("월 ?");
	m=sc.nextInt();

	d=switch(m) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2 -> {
		int n = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		yield n;
	}
	default -> -1;
	};  //반환하기 때문에 세미콜론 필요 
	
	if(d!=-1) {
		System.out.println(y+"년"+m+"월의 마지막 일자는 "+d+"일");
		
	} else {
		System.out.println("날짜 입력 형식 오류..");
	}
	
	
	
	sc.close();
}

}
