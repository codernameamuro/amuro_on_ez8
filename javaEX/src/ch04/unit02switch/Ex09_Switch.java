package ch04.unit02switch;

import java.util.Scanner;

public class Ex09_Switch {

	public static void main(String[] args) {
		// switch 값 반환하기
		// 서로 다른 자료형도 반환 가능  

	Scanner sc = new Scanner(System.in);
	
	int y, m;
	
	System.out.println("년도 ?");
	y=sc.nextInt();
	
	System.out.println("월 ?");
	m=sc.nextInt();

	var d=switch(m) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2 -> y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
	default -> "입력 오류";
	
	}; 
	
	
	System.out.println(y+"년"+m+"월의 마지막 일자는 "+d);
		

	
	
	
	sc.close();
}

}
