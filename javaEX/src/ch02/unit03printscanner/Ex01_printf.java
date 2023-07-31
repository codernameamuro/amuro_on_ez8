package ch02.unit03printscanner;

/*
 -System.out: 표준 출력 스트림. 바로 사용 가능
 -System.out.print(인수)
 :인수의 내용을 출력 장치를 통해 출력
 :출력후 라인을 넘기지 않는다. 그대로 옆에 붙여서 출력됨
 :인수는 생략 불가능
 */

public class Ex01_printf { //class 명은 항상 첫글자를 대문자로 

	public static void main(String[] args) {
		//System.out.print(); // 컴파일 오류. 출력 인수가 없음
		System.out.print("HTML 5,");
		System.out.print("Javascript, ");
		System.out.print("CSS 3");
		System.out.print("\n"); // \n or %n 넣으면 두 문자 사이를 나눠줌 
		
		System.out.print("JAVA\nJSP");  
		System.out.print("\nSpring"); // 문자 앞에 \n 도 같음 
		System.out.print("\nOracle\n\n");
		
		System.out.print("국어\t"); // \t : tab 간격
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.print("\n");
		
		System.out.print(90 + "\t");
		System.out.print(80 + "\t");
		System.out.print(95 + "\t");

	}

}
