package ch06.unit03;

public class Ex16 {

	public static void main(String[] args) {
		byte a = 10;
		short b = 20;
	    char c = 'A';
	    int d = 30;
	    long e  = 50;
	    Test16 t = new Test16();
	    
	    //메소드를 호출하면 
	    // 1) 매개변수의 타입이 동일한 타입을 호출
	    // 2) 1)번의 메소드가 없으면 타입이 큰것중 가장 적은것을 호출
	    //      기본자료형은 기본자료형에서 먼저 찾는다
	    // 3) 2)번이 없으면
	    //      호출한 곳이 기본타입 -> 매개변수에 Wrapper class 가 있으면 호출
	    //      호출한 곳이 Wrapper class -> 동일한 타입의 기본타입 매개변수를 호출
	    
	    
	    t.disp(a); // int
	    t.disp(b); // int
	    t.disp(c); // int
	    t.disp(d); // int
	    t.disp(e); // Long
	    
	    
	    // int < long 
	    // Integer < long
	    Integer x = 10;
	    t.sub(x);  // long integer를 받을 수 있다  // 클라스와 매개변수는 가능
	    
	    // Integer 과 Long는 형 변화 불가
	    // t.sub2(x); // 컴파일 오류 클래스(Wrapper)끼리는 불가능
	    
	    
	    
	  
	    

	}

}
/*
 -Wrapper class : 기본형 데이터를 객체로 처리하기 위해 제공하는 클래스 
  Byte, Short, Integer, Long, Float, Double
  Charactor, Boolean
 */

class Test16{
	public void disp(Short a) {
		System.out.println("Short :"+ a);
	}
	
	public void disp(int a) {
		System.out.println("int :"+a);
	}
	public void disp(Long a) {  // 기본자료형 Long에 대웅
		System.out.println("Long :"+a);
	}
	
	
	
	public void sub(long a) {
		System.out.println("long: "+a);
	}
	public void sub2(Long a) {
		System.out.println("Long :"+a);
	}
	
}