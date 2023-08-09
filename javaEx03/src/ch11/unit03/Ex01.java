package ch11.unit03;

public class Ex01 {

	public static void main(String[] args) {
		Test1<Number> t1 = new Test1<>();

		Integer i1 = 10;

		t1.set(i1); // Number > Integer 이므로 가능
					// 타입 매개변수의 상속관계 성립
		System.out.println(t1.get());

		// Number n = t1.get();
		// Integer n = t1.get(); // 컴오류 다운캐스팅 필요
		Integer n = (Integer) t1.get();
		System.out.println(n);

		Test1<Integer> t2 = new Test1<>();
		t2.set(100);
		System.out.println(t2.get());

		// Integer a = 10;
		// Number b = a; // Number > Integer 이므로 가능, 업캐스팅

		// Test1<Number> t3 = t2; // 제너릭은 상속 관계가 아니기 때문에 불가능하다 Test1 안에 저장한 값이 上下 일 뿐이다
	
	
	}
}

class Test1<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}