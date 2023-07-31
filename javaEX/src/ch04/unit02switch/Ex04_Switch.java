package ch04.unit02switch;

import java.util.Scanner;

public class Ex04_Switch {

	public static void main(String[] args) {
		// 1~3사이의 정수를 입력 받아 입력 받은 수만큼 *찍기
		// 단, 입력 받은 수가 1~3 사이의 수가 아니면 입력 에러 출력 
		// default : case 조건에 만족하는것이 없는 경우 실행. 위치 상관없음 
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정수 ?");
		n=sc.nextInt();
		
		switch(n) {
		case 3: System.out.println("***"); break;
		case 2: System.out.println("**"); break;
		case 1: System.out.println("*"); break;
		default: System.out.println("입력 에러"); break;
		
		//default 위치는 상관 없음 
		//switch(n) {
		//case 3: System.out.println("***"); break;
		//default: System.out.println("입력 에러"); break;
		//case 2: System.out.println("**"); break;
		//case 1: System.out.println("*"); break;
		}
		sc.close();
	}

}
