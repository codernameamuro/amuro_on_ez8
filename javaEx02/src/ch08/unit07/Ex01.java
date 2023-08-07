package ch08.unit07;

public class Ex01 {

	public static void main(String[] args) {
		 //User1 obj = new User1(); // 컴오류
		
		// 외부에서 static 중첩 클래스 객체 생성
		Test1.User1 obj = new Test1.User1();
		obj.write();
		obj.disp();
		
	}

}

class Test1 {
	int a = 10;
	static int b = 20;

	// static 중첩 클래스 : 외부 클래스(Test 1)의 객체 생성과 상관 없이 사용할 수 있는 클래스
	// 컴파일하면 Test1$User1.class 파일 생성
	static class User1 {
		int x = 100;

		public void write() {
			// System.out.println(a); // 컴오류 바깥의 객체가 생성되야 부를 수 있기 때문에
			System.out.println(b); // 메모리 할당이 됐기 때문에 사용 가능
		}

		public void disp() {
			Test1 t = new Test1();
			System.out.println(t.a);
			t.print();

		}

	}

	public void print() {
		System.out.println(a + "," + b);
	}

	public void sub() {
		// System.out.println(a); 컴오류라는데 왜 되지
		System.out.println(b);
	}
}
