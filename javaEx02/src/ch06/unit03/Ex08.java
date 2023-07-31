package ch06.unit03;

public class Ex08 {
	public static void main(String[] args) {
		// r = 10; // 컴오류. 인스턴스변수는 클래스 메소드에서 바로 접근 불가
		Ex08 t = new Ex08();
		t.r = 10;
		
		double a = t.area();
		System.out.println(a);
		
		disp(a);
	}
	// 메소드가 가장 중요하다. 
	int r; // 인스턴스 메소드
	static double PI = 3.141592;
	
	public double area() {
		return r*r*PI;
	}
	double result;
	public static void disp(double result) {
		System.out.println("넓이 :"+ result);
		
	}
	


}
