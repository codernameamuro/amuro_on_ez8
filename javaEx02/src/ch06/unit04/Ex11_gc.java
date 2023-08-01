package ch06.unit04;

public class Ex11_gc {

	public static void main(String[] args) {
		Demo11 obj = new Demo11();
			// Demo11 객체가 생성될 때 t1 객체가 생성됨 
		    // obj가 메모리 회수가 될 때 메모리 회수 
		obj.t1 = null; //t1의 주소가 사라짐  메모리 회수의 대상이 됨  
		// while(true){} main 안 끝남 
		// 오랜시간 사용하지 않을 때 (약한 참조) 메모리 회수 
	    // 강한 참조 --> 사용해도 메모리가 부족할 때 
		obj.sub();
		// t2는 sub() 메소드를 호출할 때 생성됨 
		// sub() 메소드를 빠져나올때 메모리 회수
		
	}

}

class Test11{
	int a = 10;
	
	public void disp() {
		System.out.println(a);
	}
	
}

class Demo11{
	Test11 t1 = new Test11();
	
	public void sub() {
		Test11 t2 = new Test11();
		t2.disp();
		
	}
}