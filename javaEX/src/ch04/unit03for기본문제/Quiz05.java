package ch04.unit03for문제;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max,input ;
		
		max=0; // 또는 0x7FFFFFFF 큰값을 입력하고 if(max<input) 도 가능하다 
		System.out.println("정수 10개");
		for(int i = 0; i<10 ; i++) {
			input=sc.nextInt();
			if(i==0 || max<input) {
				max=input;
			}
		}
		System.out.println(max);

		
		
		
		sc.close();

	}

}
