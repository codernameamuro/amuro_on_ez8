package ch04.unit01if;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char letter;
		System.out.println("문자 ?");
		letter=sc.next().charAt(0);
		
		if (letter>='A' && letter<='Z') {
			System.out.println((char)(letter+32));
		}
		if (letter>='a' && letter<='z') {
			System.out.println((char)(letter-32));
		}
		else
			System.out.println(letter);
		
		sc.close();

	}

}
