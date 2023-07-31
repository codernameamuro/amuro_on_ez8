package ch04.unit05continue;

import java.util.Scanner;

// i : 0 1 2 3
// n : 1 2 3 4 
public class Ex02 {

	public static void main(String[] args) {
		// 5개의 실수를 입력 받아 입력 받은 수의 합 구하기
		// 단, 입력 받은 수가 0이하이면 다시 입력 받는다.
		
		Scanner sc = new Scanner (System.in);
		double n , s;
		
		s=0;
		System.out.println("5개의 실수 입력");
		for(int i = 0; i<5 ; i++) {
			n = sc.nextDouble();
			if(n<0.0) {
				i--; // 반복 횟수가 달라짐  //5개 실수 입력 반복 횟수 추가
				continue;
			}
			s+=n;
		}
		System.out.println("결과:" + s );
		sc.close();

	}

}
