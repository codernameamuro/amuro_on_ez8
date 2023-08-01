package ch06.unit04;

public class Ex07 {

	public static void main(String[] args) {
		Test7 t = new Test7("너자바");
		t.disp();
		
		

	}

}

class Test7{
	private String name;
	private int age;
	
	public Test7() {
		System.out.println("인자 없는 생성자");
		
	}
	
	public Test7(String name) {
		// this.name= name; // this. 1) 호출한 자기 자신을 나타낸다     2) 다른 생성자 선두에 호출 가능, 한 번
		// Test7(name,0); // 컴오류 // 생성자는 일반 메소드처럼 호출 불가 // 생성자는 항상 new 다음에만 올 수 있다  // 객체를 생성할 때만 부를 수 있다
		this(name, 0); // 다른 생성자 호츌 (다른 생성자 몸체 실행). 생성자 선두에 단 한 번만 가능
		System.out.println("인자 하나인 생성자 ");
	}
	
	public Test7(String name, int age) { 
		this.name = name;
		this.age = age;
		
		System.out.println("인자 두개인 생성자");
		
	}
	
	public void disp() {
		System.out.println(name+","+age);
	}
}