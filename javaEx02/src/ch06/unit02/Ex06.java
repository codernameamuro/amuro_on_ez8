package ch06.unit02;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 Test6 t;
		 t.a=5; // 컴파일 오류. 초기화가 되어 있지 않음 
		 */
		/*
		 * Test6 t=null;
		 * t.a = 5; // 런타임 오류 (NullPointerException). 메모리 할당이 안됨.
		 * 
		 */
		
		 Test6 t = new Test6(); // 메모리 할당
		 t.a=5;
		 System.out.println(t.a); //5
		 
		
		// int [] a = new int [5]; 기본자료형 값을 저장함
		Test6[]tt= new Test6[5]; // 객체 배열  // 주소를 저장함 
		// Test6 t1=null, t2=null, t3=null, t4=null, t5=null; 와
		// 유사하며, 메모리 할당이 안된 상태 
		// tt[0].a=5;  // 런타임 오류 (NullPointerException)
		
		for(int i = 0 ; i<tt.length; i++) {
			tt[i] = new Test6(); //
			System.out.println(tt[i]);
			
		}
		tt[0].a=5;
		System.out.println(tt[0].a);
		
		

	}

}


class Test6{
	int a= 10;
	int b= 20;
}