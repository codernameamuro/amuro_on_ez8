package ch08.unit03;

public class Ex06 {

	public static void main(String[] args) {
		Object obj = new Test6();
		/*
		if(obj instanceof Test6) {
			Test6 t = (Test6)obj;
			t.pritn();
		}
		*/
		
		// instanceof 연산자에 패턴매칭. JDK 14 preview, JDK 16 정식.
		if(obj instanceof Test6 t) {
			t.pritn();
		}
		
		
		
		
		
		

	}

}

class Test6{
	int a = 10;
	int b = 20;
	
	public void pritn() {
		System.out.println(a + ":" + b);
	}
}