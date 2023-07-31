package ch06.unit03;

public class Ex07_static {

	public static void main(String[] args) {
		Test7 obj = new Test7();
		System.out.println(obj.a); // 객체를 이용하여 인스턴스 변수 접근  //0
		System.out.println(Test7.c); // 클래스 이름을 이용하여 클래스 변수 접근 //0
		
		obj.disp(); // 갹체를 이용하여 인스턴스 메소드 접근
		Test7.write(); // 클래스를 이용하여 클래스 메소드에
		

	}

}

class Test7{
	// 필드 : 인스턴스 변수 + 클래스 변수
	
	// 인스턴스변수
	// : 객체가 생성될 때마다 메모리할당. 객체가 3개가 생성되면 a,b도 메모리를 3번 할당 
	// : 메모리를 할당 받을 때 기본값으로 초기화가 이루어진다  숫자변수 --> 0 객체변수 --> null
	// : 선언할 때 초기값을 설정할 수 있음 
	// : 객체가 종속이 되므로 객체를 통해 접근가능  obj.1 obj.2 ...
	
	int a;       // 객체를 생성할때 0으로 초기화
	int b = 10;  // 객체를 생성할때 0->10으로 초기화 
	
	
	
	// 클래스변수
	// : 클래스가 로딩될때 한 번 메모리 할당을 받음 
	// : 객체 생성과 상관없이 단 한 번만 메모리 할당. 언제나 사용 가능
	// : 메모리를 할당 받을 때 기본값으로 초기화
	// : "클래스이름.필드" 로 접근
	// : 프로그램이 종료되는 시점에 메모리가 사라짐 
	// : 객체가 null이 되거나 오랫동안 사용하지 않으면 garbage collection 대상이 됨 
	// --> JVM이 메모리를 회수 (Java Virtual Machine)
	static int c; // 클래스가 로딩될 때 0으로 초기화
	static int d=100; // 클래스가 로딩될 때 0-->100으로 초기화
	
	// 매개변수, 지역변수 
	// : 매개변수 - 메소드의 인수 
	// : 지역변수  - 메소드에서 선언된 변수 
	// : 스택메모리 영역에 메모리를 할당 
	// : 초기값을 설정하지 않으면 쓰레기값을 가지고 있으 --> 연산불가 
	// : 메소드가 호출될 때 메모리를 할당 받고, 메소드가 빠져 나올때 메모리 회수
 	
	// 메소드 : 인스턴스 메소드 + 클래스 메소드
	
	// 인스턴스 메소드
	// : 객체가 생성되어야 호출될 수 있는 메소드
	// : 객체를 통해서 접근하여 사용
	// : 인스턴스 변수, 클래스 변수 사용 가능
	// : 다른 인스턴스 메소드호출 가능, 클래스 메소드 호출 가능
	
	// 인스턴스 메소드
	public int sub(int n) { //n: 매개변수(지역변수)
		int s = 0 ; // 지역변수
		s = n + b;  // b는 인스턴스 변수 
		return s;
	}
	
	public void disp() {
		System.out.println(a+":"+b);
		// a,b: 인스턴스 변수
		
		int x = sub(5); // 다른 인스턴스 메소드 호출
		System.out.println(x);
		
		System.out.println("static:"+c+","+d);
		// c,d: 클래스 변수
		
		write(); // 클래스 메소드 호출
	}
	
	//클래스 메소드
	//: 객체 생성과 상관 없이 클래스 이름을 통해서 접근 가능한 메소드
	//: 객체 생성과 상관 없이 호출 가능하므로 
	//  인스턴스 변수나 인스턴스 메소드는 바로 호출 불가능
	//: 인스턴스 변수나 인스턴스 메소드는 객체 생성 후 상용 가능
	//: 클래스 변수나 다른 메소드는 호출 가능
	
	// 클래스 메소드
	public static void write() {
		// System.out.println(a+","+b); 컴파일 오류
		// 인스턴스 변수 사용 불가
		System.out.println("static method:"+c+","+d); 
		// 클래스 변수 호출
		
		// int x = sub(10); // 컴파일 오류. 인스턴스 메소드 호출 불가 
		
		result(); // 다른 static 메소드 호출
	}
	
	public static void result() {
		System.out.println("result...");
		
		// 인스턴스 변수나 인스턴스 메소드는 객체 생성 후 호출 가능
		Test7 t = new Test7();
		System.out.println(t.a);
	}
}