package ch06.unit04;

public class Ex10_singleton {

	public static void main(String[] args) {
		Test10 t1 = new Test10(); // 생성자 두 번 부름 1
		Test10 t2 = new Test10(); // 2
		t1.print();
		t2.print();
		
		System.out.println(t1==t2); // false  같은 객체 아니다.
		
		//Demo10 d1 = new Demo10(); // 컴오류
		
		Demo10 d1 = Demo10.getInstance(); // 생성자 한 번 부름
		Demo10 d2 = Demo10.getInstance();
		
		System.out.println(d1==d2); // true. 같은 객체 

		
		

	}

}

class Test10{
	private int a = 10;
	public void print() {
		System.out.println(a);
	}
}
// singleton 패턴 : 하나의 객체만 생성되는 패턴 
class Demo10{
	private static Demo10 obj = null;  // null 메모리 할당 x 
	private int a = 5;
	
	// 생성자가 private 이면 외부에서 객체 생성 불가능
	private Demo10() {
		
	}
	public void disp() {
		System.out.println("a:"+a);
	}
	
	public static Demo10 getInstance() { // getInstance로 객체 생성 가능   // 한 번만 new를 하는 구조 
		if(obj==null) {
			obj =  new Demo10();
		}
		return obj;
	}
}