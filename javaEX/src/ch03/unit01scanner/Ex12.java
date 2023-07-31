package ch03.unit01scanner;

public class Ex12 {

	public static void main(String[] args) {
		int a, b;
		
		a=10;
		b=a++ + a++ + 1; // 10 + 11 + 1
		System.out.println(a + "," + b); //12, 22
		
		a=10;
		b=++a + ++a + 1; // 11 + 12 + 1
		System.out.println(a + "," + b); //12, 24 
		
		a=10;
		b= a++ + ++a + ++a + a++ + a++; //10 12 13 13 14  --> 11로 넘어가서 ++a를 만나 12가 됨 
		System.out.println(a + "," + b); // 15, 62
		
		a = 0;
		b = a---a; // a-(--a)
		System.out.println(a + "," + b); // -1, 1 
		

	}

}
