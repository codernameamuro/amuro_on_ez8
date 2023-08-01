package ch06.unit03;

public class Ex15_overloading { // 메소드의 이름은 동일하지만 메소드 괄호안의 매개변수의 개수나 타입이 다르면 다르게 정의하는 것을 오버로딩 (중복 정의)

	public static void main(String[] args) {
		Test15 t  = new Test15();
		
		int a = 10;
		t.disp(a);  // 1) 매개변수 타입이 일치하는 메소드 호출  //int
		
		byte b = 10;
		t.disp(b);  // 1) 매개변수 타입이 일치하는 메소드 호출 //short
					// 2) 타입이 일치하는것이 없으면 타입이 큰것중 가장 작은 메소드 호출
		
		long c = 10L;
		t.disp(c); // double
		
		// long c = 10L;
		// t.disp(c); // float 아래값 double --> float
		
		

	}

}
class Test15{
	public void disp() {
		System.out.println("인자없는 메소드...");
		
	}
	
	/*public int disp() {
		return 1;  // 매개 변수의 개수가 똑같기 때문에 오버로딩 발생 x 컴파일 오류 발생 o
	}
	*/
	public void disp(short s) {
		System.out.println("short:"+s);
		
	}
	
	public void disp(int s) {
		System.out.println("int:"+s);
		
	}
	
	public void disp(double s) {
		System.out.println("double:"+s);
		
	}
	
}
