package ch08.unit04;

public class Ex01 {

	public static void main(String[] args) {
		

	}

}
// final 변수 : 한 번 초기화 가능
class Test1{
	// final 인스턴스 변수 : 객체가 생성되면서 한 번만 초기화 
	final int a = 100;
	// final int b; //초기화 하지 않음
	
	
	
	public void sub() {
		final int x = 10; // 지역변수가 final 
		final int y; 
		y= 20; // 단 한번만 초기화 가능
		
		
		// x = 100; // 컴오류
		// y = 200; // 컴오류
		
		System.out.println(x+","+y);
	}
}
