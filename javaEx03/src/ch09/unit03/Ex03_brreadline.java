package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_brreadline {

	public static void main(String[] args) {
		// 버퍼를 이용해 문자나 문자열을 입력 받을 수 있고 입력 속도를 향상 시킬 수 있음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int a, b, c;

		try {
			System.out.println("첫 번째 수?");
			s = br.readLine();
			// readLine()은 IOException(checked exception)예외가  발생하므로 반드시
			// 예외 처리를 해야 한다.
			a = Integer.parseInt(s);
			// 문자열을 입력하면 숫자로 변환하지 못하면
			//  NumerFormatException 예외(unchecked exception)발생 
			System.out.println("두 번쨰 수?");
			s = br.readLine();
			b = Integer.parseInt(s);

			c = a / b;
			// 0으로 나누면 ArithmeticException 예외(unchecked exception)발생
			System.out.println(a + "/" + b + "=" + c);
		} catch (IOException e) {
			// IOException : 입출력에 문재가 발생할 때 발생하는 예외 (Checked exception)
			// checked exception은 메소드를 정의할 때 throws 한 예외
			// checked exception은 예외 처리를 하지 않으면 컴파일 예외가 발생

			e.printStackTrace(); // 에러 메시지를 표준 출력 장치로 출력
		}
	}

}
