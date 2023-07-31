package ch04.unit02switch;

import java.util.Scanner;

public class Ex06_Switch {

	public static void main(String[] args) {
		// 입력 받은 문자가 숫자인지 판별
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.println("문자 ?");
		c=sc.next().charAt(0);
		
		switch(c) {
		case '0': case '1' : case '2' : case '3' : case '4' : case '5':
		case '6': case '7' : case '8' : case '9' : System.out.println("숫자"); break; 
		default:System.out.println("숫자 아님");
		
		
		}
		/*
		 if(c>='0' && c<='9'){
		 }
		 */
		sc.close();
		
	}

}
