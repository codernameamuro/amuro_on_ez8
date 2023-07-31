package ch04.unit01if;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour;
		int wage;
		int overwage;
		
		
		System.out.println("근무시간?");
		hour=sc.nextInt();
		
		
		wage=10000*hour;
		overwage=80000+15000*(hour-8);
				
		if(hour<=8) {
			System.out.printf("급여: %,d", wage );
		}if(hour>8)  {
			System.out.printf("급여: %,d", overwage);
		}
		
		
		
		sc.close();
		

	}

}
