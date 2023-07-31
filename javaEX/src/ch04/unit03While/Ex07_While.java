package ch04.unit03While;

import java.util.Scanner;

public class Ex07_While {

	public static void main(String[] args) {
		// 단을 입력 받아 입력 받은 구구단 출력
		
		Scanner sc= new Scanner(System.in);
		int dan;
		int n;
		
		System.out.println("단 ?");
		dan=sc.nextInt();
		
		n=0;
		while(n<9) {
			n++;
			
			System.out.printf("%d * %d = %d\n", dan, n, dan*n);
		}
		
		sc.close();
	}

}
