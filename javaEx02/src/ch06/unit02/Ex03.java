package ch06.unit02;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t = new Test3(); // 객체 선언 및 메모리 할당
		
		
		// t.a = 10; // 컴오류  Ex03 과 Test3는 다른 클래스이기 때문에 private 필드인 (메소드 또한 마찬가지)
				     // int a 불러 올 수 없음, 외부에서 접근 불가
				     // Test3.a is not visible
		t.write();
		
		
	}
}

class Test3{
	// 필드 접근 제어자
	// private < default < protected < public
	
	private int a = 10; // 클래스 내에서만 접근 가능
	int b = 20; // 동일한 패키지에서 접근 가능
	protected int c = 30; // 동일한 패키지 및 하위 클래스에서 접근 가능  // 자식은 어디서든 접근 가능
	public int d = 40; // 어디에서나 접근 가능 
	
	
	// 메소드 
	public void write() {
		System.out.println(a+","+b+","+c+","+d);
		
	}
}
