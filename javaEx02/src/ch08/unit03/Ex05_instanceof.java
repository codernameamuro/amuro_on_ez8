package ch08.unit03;

public class Ex05_instanceof {

	public static void main(String[] args) {
		// Object > Test5 > Demo5
		Test5 t1 = new Test5();
		t1.print();
		
		// up-casting 언제나 가능
		Test5 t2 = new Demo5(); // up-casting
		t2.print();
		Demo5 d1 = new Demo5();
		d1.print();
		Test5 t3 = d1; // up-casting
		Object o = new Demo5(); // up-casting
		 
		System.out.println(t2.b); // 20, Test5 필드 
		System.out.println(t3.b); // 20, Test5 필드 
		// 필드는 무조건 자기것 출력
		// System.out.println(t2.c); // 컴파일 오류
		System.out.println(((Demo5)t2).c); // 200, 반드시 다운캐스팅 해야함
		System.out.println(((Demo5)o).c); // 200, 반드시 다운캐스팅 해야함
		System.out.println(((Test5)o).b); // 20, 다운캐스팅
		System.out.println(((Demo5)o).b); // 100, 다운캐스팅 
		System.out.println();
		
		
		t2.print(); // Demo5것 출력. override가 된 경우 상위 클래스 메소드는 숨는다.
		t2.sub(); // 10:20:100:200 override가 된 경우에 한해서 부를 수 있다. 10 20이 아닌 이유
		
		// t2.write(); // 실행할 때만, Test5에 write();가 없다. 컴오류
		// down-casting : 1. 업한것만 다운가능 2. 반드시 캐스팅 해야한다. 
		System.out.println();
		((Demo5)t2).write(); // 다운캐스팅 
		
		// ((Demo5)t1).write(); // 런오류 t1은 업하지 않음
			// ClasscastException 예외 발생
		
		System.out.println(t1); //ch08.unit03.Test5@2e3fc542
		System.out.println(t2); //ch08.unit03.Demo5@150c158
		
		System.out.println(t1 instanceof Demo5); // false
		System.out.println(t2 instanceof Demo5); // true
			// instanceOf : 객체가 해당 클래스의 객체이면 true 아니면 false
		
		if(t1 instanceof Demo5) {
			Demo5 dd = (Demo5)t1;
			System.out.println("t1...");
			dd.write();
		}
		if(t2 instanceof Demo5) {
			Demo5 dd = (Demo5)t2;
			System.out.println("t2...");
			dd.write();
		}

	}

}

class Test5{
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+","+b); // 10,20
	}
	
	public void disp() {
		System.out.println("disp...");
	}
	
	public void sub() {
		print();
	}
}

class Demo5 extends Test5{
	int b = 100;
	int c = 200;
	
	public void print() {
		System.out.println(a+":"+super.b+":"+b+":"+c); // 10,20,100,200
	}
	
	public void write() {
		System.out.println("write...");	
	}

}
