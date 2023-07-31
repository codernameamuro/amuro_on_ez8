package ch03.unit01scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		int a = 3, b = 2;
		double c;
		
		c=a/b + a/b;
		System.out.println(c); // 2.0 
		
		c=(double)a/b + a/b; //a --> 3.0
		System.out.println(c); // 2.5
		
		c=(double)(a/b) + a/b; // 1.0 + 1
		System.out.println(c);
		
		c=(double)a/b + (double)a/b; // 1.5 + 1.5
		System.out.println(c);
		
		c=3.7 % 1.3; //실수도 %연산 가능
		System.out.println(c);
		
		c='A' + 15;
		System.out.println(c); // 80.0 
		
		
		
	}
}
