package ch04.unit02switch;

import java.util.Scanner;

//1~3 사이의 수를 입력 받아 입력 받은 수 만큼 * 찍기
public class Ex01_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("수 ?");
		n=sc.nextInt();
		
		//switch : byte, short, char, int, String, enum 만 가능
		// boolean, long, float, double 불가능 
		switch(n) { // switch(변수 또는 수식){
		case 3: System.out.println("*"); // case 다음에는 리터널, 상수만 가능. 수식은 불가능 
		case 2: System.out.println("#");
		case 1: System.out.println("&");
		}
		System.out.println();
		
		
		
		
		sc.close();

	}

}
