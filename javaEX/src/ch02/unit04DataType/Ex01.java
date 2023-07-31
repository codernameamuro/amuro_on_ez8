package ch02.unit04DataType;

public class Ex01 {

	public static void main(String[] args) {
		int a, b, c; // 정수형 변수 선언
		//c= a + b; // 컴파일 오류, 변수를 초기화 하지 않으면 연산 불가능 
		//System.out.println(a); // 컴파일 오류. 초기화가 되어 있찌 않음, 출력 불가 
		b=10; c=5; a=b+c;
		System.out.println(a);
		
		//int a=30; // 컴파일 오류, 블럭 안에 동일한 이름의 변수 선언 불가능
		
		a=30; // 다시 a에 30을 부여하면 오류 발생 x, 위 a가 갖고 있던 15 사라짐 
		System.out.println(a);
		
		//a=15.0; // 컴파일 오류, 실수를 정수형에 대입 불가능 
		 		// a는 int. 실수는 정수형보다 값이 크기 때문에 
	}

}
