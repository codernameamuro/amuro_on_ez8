package ch08.unit03;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		
		// up - casting
		Test3 t2 = new Sample3();
		Test3 t3 = new Demo3();
		
		t1.disp();
		t2.disp(); // 자식의 메소드를 부를 수 없지만 override 된 경우에는 달라진다 ( up-casting 된 경우)
		t3.disp();

	}

}

class Test3 {
	public void print() {
		System.out.println("Test3 print...");
	}

	public void disp() {
		print();
		// write(); // 컴오류, 존재하지 않는 메소드
	}
}

class Sample3 extends Test3 {
	@Override
	public void print() {
		System.out.println("Sample3 print...");

	}

	public void write() {
		System.out.println("Sample3 write...");

	}

}

class Demo3 extends Test3 {
	public void sub() {
		System.out.println("Demo3 sub...");

	}
}