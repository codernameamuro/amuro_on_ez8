package ch11.unit02;

public class Ex07 {

	public static void main(String[] args) {
		Test7<Integer> t = new Test7<>();
		t.set(10);
		System.out.println(t.get());

		// Test7<String> t2 = new Test7<>(); // Number의 자식만 가능하기 때문에

	}

}

// 제한된 타입 파라미터 : Number 를 상속 받은 클래스만 가능 
class Test7<T extends Number> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}