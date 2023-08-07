package ch08.unit04;

public class Ex02 {

	public static void main(String[] args) {
		
		Demo2 obj = new Demo2();
		
		double s = obj.area(10);
		obj.write(s);
		
		
	}

}


// 대표적인 final 클래스 : String, StringBuffer 등 
// final class A{}
// class B extends A{} // 컴오류.  final 클래스는 하위 클래스 가질 수 없음

class Test2{
	public static final double PI = 3.141592;
	
	protected double r;
	
	// final 메소드 : 하위 클래스에서 재정의 할 수 없음 
	public final double area(double r) {
		this.r=r;
		return r*r*PI;
	}
}

class Demo2 extends Test2{
	public void write(double result) {
		System.out.println("반지름 : "+r+" 넓이 : " + result);
		// System.out.println("반지름 : "+this.r+" 넓이 : " + result);
		// System.out.println("반지름 : "+super.r+" 넓이 : " + result); // 셋 다 동일함
		
	}
	
	/*public double area(double r) {
		return r*r;
	*/
	
}