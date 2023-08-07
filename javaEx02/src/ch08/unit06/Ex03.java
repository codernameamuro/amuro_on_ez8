package ch08.unit06;

public class Ex03 {

	public static void main(String[] args) {
		Demo3 obj = new Test3();
		obj.print();
		obj.disp();

	}

}

interface Demo3{
	public void print();
	public void disp();
	
}


// 추상클래스는 인터페이스의 모든 메소드를 구현히지 않아도 된다.
abstract class DemoImpl3 implements Demo3{
	public void print() {
		System.out.println("print...");
	}
}


class Test3 extends DemoImpl3{

	@Override
	public void disp() {
		System.out.println("disp...");
	}
}