package ch09.unit03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) {
		// 버퍼를 이용해 문자나 문자열을 입력 받을 수 있고 입력 속도를 향상 시킬 수 있음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int a, b, c;

		try {
			System.out.println("첫 번째 수?");
			s = br.readLine();
			a = Integer.parseInt(s);

			System.out.println("두 번쨰 수?");
			s = br.readLine();
			b = Integer.parseInt(s);

			c = a / b;
			System.out.println(a + "/" + b + "=" + c);
			
			// 모든 예외를 catch
		} catch (Exception e) { // 위 외의 예외를 잡아줌 단독으로 사용하면 그 이유를 알 수 없기 때문에 단독 사용 비추천
			// Exception : 모든 예외를 catch. 모든 예외의 상위 믈래스 
			// 			 : Exception으로 모든 예외를 catch 하기 떄문에 예외 상황별로 예외 불가능
			
			// e.printStackTrace();
			System.out.println("연산 불가능합니다");
		}
		System.out.println("end...");
	}

}
