package ch03.unit02.관계연산자;

public class Ex03 {

	public static void main(String[] args) {
		int a;
		boolean b1, b2;
		
		a=10;
		b1=false;
		b2=a>20 && (b1 = true); // 단축연산. &&는 앞이 거짓이면 뒤쪽 연산 x 
		System.out.println(b1 + "," + b2); // f, f
		
		a=10;
		b1=false;
		b2=a<20 && (b1 = true); // 단축연산. 
		System.out.println(b1 + "," + b2); // t, t
		
		a=10;
		b1=false;
		b2=a > 20 || (b1 = true); 
		System.out.println(b1 + "," + b2); // t, t
		
		a=10;
		b1=false;
		b2=a<20 || (b1 = true); // 단축연산. ||는 앞이 참이면 뒤쪽 연산 x 
		System.out.println(b1 + "," + b2); // f, t
		
		

	}

}
