package ch03.unit01scanner;

public class Ex07 {

	public static void main(String[] args) {
		double a = 123.456;
		int n;
		
		System.out.println(a);
		System.out.printf("%f\n", a);
		System.out.printf("%.2f\n", a);
		
		n = (int)(a * 100);
		System.out.println(n);
		
		a=n/100.;
		System.out.println(a); // 123.45 소수점 세번째 자리에서 버림 
		
		
	}

}
