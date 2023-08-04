package ch08.unit1;

public class Ex05 {

	public static void main(String[] args) {
		

	}

}

class Test5{
	int x ;
	
	public Test5() {
		x = 0;
		System.out.println("상위 인자 없는 생성자");
	
	}
	
	public Test5(int x)	{
		this.x=x;
		System.out.println("상위 인자 하나인 생성자");
		
	}
	public void print() {
		System.out.println(x);
		
	}
}


class Demo5 extends Test5{
	int a ;
	public Demo5() {
		// super(); 가 생략됨
		
		a= 0;
		System.out.println("하위 인자 없는 생성자");
	}
	
	public Demo5(int a) {
		this(a, 10);
		System.out.println("하위 인자 하나인 생성자");
		
	}
	
	public Demo5(int a, int x) {
		super(x);
		this.a=a;
		System.out.println("하위 인자 둘이 생성자");
	}
	
	public void disp() {
		System.out.println(a+":"+x);
	}
	
}
