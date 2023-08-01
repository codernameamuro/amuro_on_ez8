package ch04.unit03for;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ch, input;
		int s;
		int start, stop;

		while (true) {
			do {
				System.out.print("1.합 2.짝수합 3. 홀수합 4.종료=>");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 4);
			if (ch == 4) {
				break;
			}

			System.out.print("합을 구할 정수(양수)?");
			input = sc.nextInt();
			if (input < 1) {
				continue;
			}
			
			start = ch ==2? 2:1;
			stop = ch == 1? 1:2;
			
			s=0;
			
			for(int n=start; n<=input; n+=stop) {
				s+=n;
			}
			System.out.println("결과 :"+s);
			System.out.println();
		}
		


		sc.close();

	}

}
