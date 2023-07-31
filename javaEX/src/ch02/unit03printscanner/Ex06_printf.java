package ch02.unit03printscanner;

public class Ex06_printf {

	
		public static void main(String[] args) {
			String s="Seoul Korea";
			
			System.out.printf("%s%n", s); //Seoul korea
			// %s : 문자열 출력
			System.out.printf("%S%n", s); //SEOUL KOREA
			// %S : 소문자인 경우 문자를 대문자로 출력
			System.out.printf("%.5s%n", s); // Seoul
			// 문자열 중 출력할 문자의 개수 지정 5 = 폭
			System.out.println();
			
			int a = 10, b = 5;
			System.out.printf("%d %d %d %d %d%n", a, b, a, a, b);
			System.out.printf("%1$d %2$d %1$d %1$d %2$d%n", a, b);
		}
}
