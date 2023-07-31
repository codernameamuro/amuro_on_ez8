package ch03.unit01scanner;

public class Ex03 {

	public static void main(String[] args) {
		// int 연산자 int => int 
		
		int a;
		
		a= 3/2 + 1/2 + 2/3;  // 무조건 정수값 즉 1 + 0 + 0 꼴
		System.out.println(a); 
		
		
		double b;
		
		b=3/2 + 1/2 + 2/4;  // 1.0    정수 3 나누기 정수 2 ---> 정수값! 1.5--> x    1--> O 
		System.out.println(b);
		
		b=(double)(3/2 + 1/2 + 2/4);  // int식 이후 double() ---> 1.0
		System.out.println(b);
		
		// int 연산자 double  => double로 결과값이 바뀜  더 큰 것으로! 3 나누기 2.0... 
		b=3/2. + 1/2 + 2/4;  // 1.5 
		System.out.println(b);
		
		
	}

}
