package ch04.unit03for;

import java.util.Scanner;

public class Quiz6_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int min, input ;

		min=0;
		System.out.println("정수 10개");
		for(int i = 0; i<10 ; i++) {
			input=sc.nextInt();
			if(i==0 || min>input) {
				min=input;
			}
		}
		System.out.println(min);

		
		
		
		
		sc.close();

	}

}
