package ch04.unit02switch;

import java.util.Scanner;

public class Ex10_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("점수 ?");
		n=sc.nextInt();
		
		var s = switch (n/10) {
		case 10 , 9 -> 4.0;
		case 8 -> 3.0;
		case 7 -> 2.0;
		case 6 -> 1.0;
		case 5,4,3,2,1,0 -> {yield 0.0;} // {} 없애면 에러, 반드시 {}가 필요 
		//case 5,4,3,2,1,0 ->  0.0; 가능 
		default -> "입력 오류";
		};
		
		System.out.println(n + "->" + s);
		
		sc.close();

	}

}
