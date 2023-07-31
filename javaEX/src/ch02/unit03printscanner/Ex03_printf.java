package ch02.unit03printscanner;

/*
 -System.out.printf("서식", 출력할값, 출력할값)
 :출력 서식에 따라 출력할 값을 출력
 :출력후에 라인을 넘기지 않는다
 :System.out.formatf("서식", 출력할값, 출력할값) 과 동일
 */

public class Ex03_printf {

	public static void main(String[] args) {
		int a, b, c; //정수를 저장할 방을 만듬
		a=13;
		b=4;
		
		c=a+b;
		System.out.println(a + "+" + b + "=" + c);
		System.out.printf("%d + %d = %d%n", a, b, c); // %d 3개이기 때문에  정수가 3개 옴
			// %d: 정수를 출력하는 변환문자
			// %: 형식 지정 제어문자의 시작
		
		System.out.format("%d + %d = %d%n", a, b, c); // 13+4=17
		// System.out.format("%d + %d = %d%n", a, b); // 런타임 오류
		// 런타임 오류: 실행시 오류 발생 ---> %d는 3개, 출력할 정수는 2개이기 때문
		// 이후 다른 출력식은 진행되지 않는다
		
		System.out.printf("%d+%d=%d\t", a, b, a+b);
		System.out.printf("%d-%d=%d\t", a, b, a-b);
			// \n, %n : 라인을 넘김
		
		System.out.printf("%d*%d=%d\t", a, b, a*b);
		System.out.printf("%d/%d=%d\t", a, b, a/b);
		
		System.out.printf("%d %%d=%d%n", a, b, a%b);
			// %연산자 : 나머지
			// printf() 에서 %% : %가 형식문자가 아닌 %를 출력할 때 사용
			// printf() 안의 %는 서식, 뒤에 %는 연산자 역할, 두 개체가 다름 
		
	}

}
