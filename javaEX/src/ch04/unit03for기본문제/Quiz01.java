package ch04.unit03for기본문제;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int s=0;
		
		do {
			System.out.println("수?");
			number=sc.nextInt();
		}while(number<1 || number>1000);
		
		
		for (int n=1; n<=number; n++) {
			s+=n;
		}System.out.println(s);
		
		sc.close();

	}

}
