package ch04.unit03for기본문제;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		do {
		System.out.println("단?");
		dan=sc.nextInt();
		}while(dan<1 || dan>9);
		for(int n=1; n<=9; n++) {
			System.out.println(dan+"*"+n+"="+dan*n);
		}
		
		
		sc.close();

	}

}
