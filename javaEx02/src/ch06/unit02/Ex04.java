package ch06.unit02;

public class Ex04 {

	public static void main(String[] args) {

		// 레퍼런스 변수 (메모리를 할당받은) 만큼 필드는 메모리 할당을 받는다.
		Test4 t1 = new Test4();
		// t1의 a,b 필드가 메모리 할당
		Test4 t2 = new Test4();
		// t2의 a,b 필드가 메모리 할당 
		
		t1.b=50;
		System.out.println(t1.a+":"+t1.b); // 10, 50
		System.out.println(t2.a+":"+t2.b); //10, 0
		
		System.out.println(t1==t2);  // false
		// 서로 다른 개체. 다른곳을 참조하고 있음 
		t2.disp();
		
		Test4 t3= new Test4();
		//t3의 a,b 필드가 메모리 할당
		Test4 t4 = t3;
		// t4는 t3과 동일한 곳을 참조한다.
		t4.disp();
		t4.b=100;
		System.out.println(t3.a+":"+t3.b);  // 10, 100
		System.out.println(t4.a+":"+t4.b);  // 10, 100
		
		System.out.println(t3==t4); // true
		//동일한 곳을 참조
		// 클래스명 @해쉬코드
		// 해쉬코드 : JVM에서 객체를 빠르게 검색하기 위해 사용0
		// 동일한 객체는 해쉬코드가 같지만, 해쉬코드가 같다고 동일한 객체는 아님 
		
		System.out.println(t1); //ch06.unit02.Test4@782663d3
		System.out.println(t2); //ch06.unit02.Test4@1990a65e
		System.out.println(t3); //ch06.unit02.Test4@64485a47  // t3, t4 해쉬코드 같음 
		System.out.println(t4); //ch06.unit02.Test4@64485a47
		t3.disp();
		
	}

}

class Test4 {
	int a = 10;
	int b;

	public void disp() {
		System.out.println(a + "," + b);
	}
}