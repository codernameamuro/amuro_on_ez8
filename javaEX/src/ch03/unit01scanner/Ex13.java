package ch03.unit01scanner;

public class Ex13 {

	public static void main(String[] args) {
		char a;
		
		a = 'A';
		
		// a = a+1; // 컴파일 오류 int를 char에 담을 수 없음 
		//a = (char)(a+1); // 'B'
		
		a++;
		System.out.println(a);
		// ++a; 와 동일, 단독사용할 때, ++는 형변환이 일어나지 않는다
		++a;
		System.out.println(a); // C
		
		a = 'A';
		System.out.println((a++) + "," + (++a)); // A,C
		
		double b = 4.5;
		b++;
		System.out.println(b);

	}

}
