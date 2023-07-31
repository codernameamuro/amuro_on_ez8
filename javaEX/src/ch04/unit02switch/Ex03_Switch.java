package ch04.unit02switch;

import java.util.Scanner;

public class Ex03_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정수 ?");
		n=sc.nextInt();
		
		switch(n%3) {
		case 0 : System.out.println(n+": 3의 배수"); break;
		case 1 :
		case 2: System.out.println(n+":3의 배수가 아님"); break; // 나머지가 1이 나와도 마지막까지 
		//계산하기 때문에 3의 배수가 아님이 출력됨 
		}
		
		
		
		sc.close();

	}

}
