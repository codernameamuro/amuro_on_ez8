package ch11.unit02;

public class Ex06 {

	public static void main(String[] args) {
		Test6 <Integer> t = new TestImpl6<>();
		t.print(10);
		

	}

}
// 제네릭 인터페이스
interface Test6<T>{
	public void print (T t);
}

// 구현 클래스 --- 1
class TestImpl6<T> implements Test6<T>{

	@Override
	public void print(T t) {
		System.out.println(t);
		
	} // 추상 클래스가 아닌 이상 모든 메소드를 재정의 해야 하기 때문에 오류 발생
	
}


// 구현 클래스 --- 2
class DemoImpl6 implements Test6<String>{

	@Override
	public void print(String t) {
		System.out.println(t);
	
	}
	
}