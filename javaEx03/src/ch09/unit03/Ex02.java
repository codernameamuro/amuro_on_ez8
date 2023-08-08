package ch09.unit03;

import java.util.Scanner;
/*
 - 예외가 발생하지 않는 경우
 [1] 블록 모두 실행 --> [3]실행 = 정상종료

 - 예외 발생하면 (0으로 나누거나 문자열을 입력할 시)
 [1] 블록 실행중 예외 발생  [1]블록 실행 중지 --> [2]번 블록 실행(예외가 발생한 경우만 실행) --> [3]번 블록 실행 = 정상종료
 */

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c;

		try {
			// 1) 예외가 발생할 가능성이 있는 코드를 작성
			System.out.println("두 정수 ?");
			a = sc.nextInt();
			b = sc.nextInt();

			c = a / b;                                   // 중간에 예외 발생시 이하 코드는 실행하지 않고 catch로 내려감
			System.out.println(a + "/" + b + "=" + c);
			
		} catch (Exception e) {
			// Exception : 모든 예외를 catch 할 수 있지만 
			//             예외 상황별로 예외를 분리할 수 없다.
			// 2) 예외가 발생할 때 실행할 코드 작성
			System.out.println("연산이 불가능합니다.");
		}
		
		// 3) 
		System.out.println("end...");
		sc.close();

	}

}
