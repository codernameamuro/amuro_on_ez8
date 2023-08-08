package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

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
			
			//예외 상황별로 예외를 catch
		} catch (IOException e) { // checked exception 

			e.printStackTrace(); // 에러 메시지를 표준 출력 장치로 출력
		} catch (NumberFormatException e) { // unchecked exception
			// 문자열을 숫자로 변환하지 못하는 경우 등에서 발생하는 예외
			// NumberFormatException 예외를 catch 하지 않으면 예외가 발생한 경우 비정상적인 종료
			// System.out.println("숫자만 입력 가능합니다");
			// System.out.println(e.getMessage());
			//System.out.println(e.toString());  
			e.printStackTrace(); // 개발자 입장에서 정확하게 문제를 파악할 수 있음 (자세함) 터진 위치를 파악
		} catch (ArithmeticException e) { // unchecked exception 
			System.out.println("0으로 나눌 수 없습니다");
			// System.out.println(e.toString());
			// e.printStackTrace();
		} catch (Exception e) { // 위 외의 예외를 잡아줌 단독으로 사용하면 그 이유를 알 수 없기 때문에 단독 사용 비추천
			// Exception : 모든 예외를 catch. 모든 예외의 상위 믈래스 
			// 			 : 여러 예외를 동시에 catch 하는 경우 가장 마지막에 위치해야 한다
			
			e.printStackTrace();
		}
		System.out.println("end...");
	}

}
