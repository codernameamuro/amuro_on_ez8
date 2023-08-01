package ch07.unit03;

public class Ex03 {

	public static void main(String[] args) { // Wrapper class, null 가질 수 ㅇ벗다
		long a;
		a = 10;
		
		Long b;
		// b = 100; // 컴오류
		b = 100L;
		
		int x;
		x = (int)a; // long을 int로 캐스팅
		
		// Integer y = (Integer)b; // 컴오류. 클래스 상하관계만 캐스팅 가능
		   // Integer과 Long은 상손 관계가 아님  
		
		System.out.println(a+","+b+","+x);
						
		
		
		
	}

}
