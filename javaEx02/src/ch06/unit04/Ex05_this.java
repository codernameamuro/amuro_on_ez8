package ch06.unit04;

public class Ex05_this {

	public static void main(String[] args) {
		Test5 t1 = new Test5();
		t1.set(5);
		t1.print();
		t1.disp();
		System.out.println();
		
		Test5 t2 = new Test5();
		t2.set(3);
		t2.print();
		t2.disp();
		
		

	}

}
class Test5{
	private int a;
	private int b;
	private int c = 5;
	
	public void set(int b) {
		this.a = 10; // 필드 a, this 생략 가능. 자역변수에 a가 없으므로 
		// this : 호출한 객체 
		this.b = b + 100; // 필드 b에 매개변수 b+100을 대입
		// this.b : 호출한객체의 b 필드, b : 매개변수 
		
	}
	
	public void print() {
		int c = 50;
		System.out.println(this.a+","+this.b+","+this.c+","+c); // a,b 필드 c는 지역변수
	}
	
	public void disp() {
		System.out.println(this.a+","+this.b+","+this.c); // a,b,c 필드
		// 필드와 지역변수가 동일한 이름이 없으므로 아래도 가능
		// System.out.println(a+","+b+","+c);
	}
}
	