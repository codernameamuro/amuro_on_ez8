package ch06.unit03;

public class Ex01 {
	// 레퍼런스변수(지역변수)
	public static void main(String[] args) {
		Test1 t = new Test1();

		// 일반 변수 (지역변수)
		int result;
		
		// 메소드 호출
		result = t.sub(10);
		System.out.println(result);

		int result1 = t.sub(3);
		System.out.println(result1);
		
		System.out.println(t.isUpper('A'));

		t.sub(1);

	}

}
// 기능 : 총점 / 평균 / 석차 계산한다....

class Test1 {
	// 메소드 : 기능을 구현
	// 형식 : 접근제어 리턴타입 메소드명([매개변수타입]){ }
	// 매개변수는 지역 변수
	// 지역변수는 메소드안에서만 사용가능
	// 지역변수는 메소드를 호출할때 메모리 할당을 받고 메소드를 빠져 나가면 메모리 해제
	public int sub(int n) { // 정수를 가져와라... sub(int n) // n: 형식매개변수(가인수) --- 지역변수
		int s = 0; // s = 지역변수 --- 스택메모리 영역에 메모리 할당 method를 빠져나가면 메모리 상실

		s = n + 5;
		for (int i = 0; i < 5; i++) { // i = 지역변수 for문장 안에서만 사용가능
			System.out.print("-");
		}
		System.out.println();
	
	
		return s; // 정수를 갖고 돌아간다 (갖고 돌아갈 값은 작거나 같으면 됨 )
					// 리턴값은 리턴타입과 같거나 적어야 한다 .
	}
		public boolean isUpper(char c) {
			boolean b = c >= 'A' && c <= 'Z';
			return b;
		}

		public boolean isLower(char c) {
			return c >= 'a' && c <= 'z';
		
	}
}

