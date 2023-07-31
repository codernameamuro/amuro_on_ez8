package ch03.unit02.관계연산자;

public class Ex04 {

	public static void main(String[] args) {
		int a, b;
		boolean c;
		
		System.out.println("a:20, b:20");
		
		a=20;
		b=20;
		c= ++a > 20 && ++b  >20;
		System.out.println(a+","+ b + "," + c);
		//21 21 true
		
		a=20;
		b=20;
		c= a++ > 20 && ++b  >20; //a는 연산하고 나감 b는 false기 떄문에 연산 x 
		System.out.println(a+","+ b + "," + c);
		
		a=20;
		b=20;
		c= ++a > 20 && b++  >20;
		System.out.println(a+","+ b + "," + c); //21 21 false
		
		a=20;
		b=20;
		c= ++a > 20 || ++b  >20;
		System.out.println(a+","+ b + "," + c); //21 20 true
		
		a=20;
		b=20;
		c= a++ > 20 || b++  >20;
		System.out.println(a+","+ b + "," + c); // 21 21 false
		
		
		
	}

}
