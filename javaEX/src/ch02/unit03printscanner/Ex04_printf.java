package ch02.unit03printscanner;

public class Ex04_printf {

	public static void main(String[] args) {
		// System.out.println("%d %d%n", 123); // 런타임오류, 프로그램 강제종료
		// %d : 정수를 출력 (int, long)
		System.out.printf("%d%n", 12345);
		System.out.printf("%d%n", -12345);
		System.out.printf("%,d%n", 12345); // 세자리마다 ',' 출력
		
		// System.out.printf("%d%n", 2200000000);
		// 2200000000은 int 범위를 벗어나기 때문에 오류발생
		
		System.out.printf("%d%n", 2200000000L);
		// 2200000000L : long 형 리너터르 l,L 둘 다 가능
		// System.out.printf("%d%n", 'A');
		// 'A' : 문자 리터널 
		// 런타임 오류: %d는 char 형을 출력 할 수 없음
		
		System.out.println();
		System.out.println("01234567890123456789");
		System.out.printf("%d%n", 123);
		System.out.printf("%10d%n", 123); // 뒤에 7칸의 공백이 생김 
		// %10d : 10칸으로 숫자를 출력 ( 출력 자리수를 지정함)
		System.out.printf("%010d%n", 123); // 남는 7칸을 0으로 채움
		System.out.printf("%-10d*%n", 123); // 앞에 7칸의 공백이 생김
		
		System.out.printf("%2d%n", 123); // 123
		// 정수는 출력할 자릿수가 부족하면 자릿수를 무시하고 출력
		System.out.println();
		
		System.out.printf("%d%n", 123); // 123
		System.out.printf("%d%n", -123); // -123
		System.out.printf("%+d%n", 123); // +123
		System.out.printf("%+d%n", -123); // -123
		System.out.printf("%(d%n", 123); // 123
		System.out.printf("%(d%n", -123); // (123) 음수
		System.out.println();
		
		// %c : 문자 출력
		// %C : 소문자인 경우 대문자로 출력
		System.out.printf("%c%n", 'A'); //A
		System.out.printf("%c%n", 'a'); //a
		System.out.printf("%C%n", 'A'); //A
		System.out.printf("%C%n", 'a'); //A
		
		System.out.printf("%c%n", 65); //A ---> ASCII 코드 65
		System.out.printf("%c%n", 97); //a ---> ASCII 코드 97
		System.out.println();
		

	}

}
