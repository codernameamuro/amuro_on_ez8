package ch06.unit04;

public class Ex12_final {

	
	public static void main(String[] args) {
		
		//Test12.PI=3.14; // 컴오류 변경 불가

	}

}

class Test12{
	public static final double PI = 3.141592; // 상수. 
	// final 변수 : 선언과 동시에 초기화
	//           : 값 변경 불가 
	// public static final int a; // 에러 값을 선언해야 함 
	// final 변수는 보통 대문자로 만듬 
	public static final int m;
	static {
		m = 10;  // static final 변수는 static 초기화 블록에서 초기화 가능
	}
	// 인스턴스 final 변수
	public final int a;
	public Test12() {
		a=10;           // 인스턴스 final 변수는 생성자에서 초기값을 줌 static final 변수는 생성자에서 줄 수 없음 
	}
}