package ch04.unit03While;

import java.util.Scanner;

// 1~9 사이의 단을 입력 받아 구구단 출력
// 단, 입력 받은 단어 1~9 이외의 수이면 다시 입력 받는다.
public class Ex10_DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan, n;
	do {
		System.out.println("단 ? ");
		dan=sc.nextInt();
	}while (dan<1 || dan>9);
	
	
	
		n=0;
		while(n<9) {
			n++;
			System.out.printf("%d*%d=%d\n", dan, n, dan*n);
			
		sc.close();
		}
		

	}

}
