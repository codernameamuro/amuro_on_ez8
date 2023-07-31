package ch04.unit04break;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 실수를 입력 받아 입력 받은 수의 합 구하기
		// 단, 입력 받은 수가 0 이하이면 출력 하고 종료
		
		Scanner sc = new Scanner(System.in);
		double input, sum;
		
		sum=0;
		while(true) {
			System.out.println("수[0:종료]?");
			input=sc.nextDouble();
			if(input<=0) {
				
				break;
			}
			
			sum+=input;
			
		}
		System.out.println("결과 :" + sum);
		
		
		
		
		
		sc.close();
	}

}
