package ch06.unit03;

public class Ex09_parameter {

	public static void main(String[] args) {
		Test9 t = new Test9 ();
		int [] nn = {1,3,5,7,9};
		int a;
		
		a = 5;  // main a 값
		t.sub1(a);
		System.out.println("a:"+a); //5
		
		t.sub2(t);
		System.out.println("t.x:"+t.x);
		
		t.sub3(nn);
		System.out.println("nn[1]:"+nn[1]);
		
		

	}

}

class Test9 {
	int x  = 10;
	
	public void sub1(int a) { // sub1의 a값   // call by value 
		a += 10;
		
	}
	// 주소를 보내면 값이 복사돼 돌아오는 느낌
	public void sub2(Test9 t) { // call by reference
		t.x=20;
		
	}
	
	public void sub3(int [] a) { // call by reference 
		a[1] +=100;
	}
	
	
}