package ch11.unit02;
/*
  - generic 
  : 다양한 타입의 객체를 다루는 클래스나 인터페이스에서 사용할 
    데이터 타입을 인스턴스를 생성할 때 결정
  : 데이터 타입에 대한 별도의 메소드나 변수를 작성할 필요 없이 
    미리 정의된 메소드나 변수들에 대하여 서로 다른 자료형으로 처리할 수 있다. 
  : 객체의 타입을 컴파일할떄 체크하므로 객체 타입의 안전성을 높이고 
    불필요한 형 변환을 줄일 수 있다.
 */
public class Ex03_generic {

	public static void main(String[] args) {
		Test3<String> t = new Test3<>(); // String으로 설정한 이상 String 외 다른 변수를 넣을 수 없다
		t.set("서울");                    // Object와 같이 모든 변수 처리 가능하지만 더 안전함 
		// t.set(120); // 컴오류
		
		String s = t.get();
		System.out.println(s.length());
		
		Test3<Integer> t2 = new Test3<>();
		t2.set(120);
		// t2.set("서울"); // 컴오류 
		int a = t2.get();
		System.out.println(a);
		/*
		Test3 ob = new Test3(); 
		ob.set("서울");
		String s2 = (String)ob.get();  // T:Object로 처리, 경고, 사용하지 않는 것이 좋음
	     */
	}

}


// generic : 하나의 타임 파라미터  "T" 아직은 자료형을 결정하지 않은 상태를 말함. Test3의 객체가 생성될 때 결정됨
class Test3<T>{
	private T value;
	
	public void set(T value) {
		this.value=value;
	}
	
	public T get() {
		return value;
	}
}